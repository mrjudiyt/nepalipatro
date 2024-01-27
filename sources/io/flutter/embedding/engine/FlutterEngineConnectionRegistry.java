package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.h;
import io.flutter.Log;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.util.TraceSection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class FlutterEngineConnectionRegistry implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface {
    private static final String TAG = "FlutterEngineCxnRegstry";
    private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
    private FlutterEngineActivityPluginBinding activityPluginBinding;
    private BroadcastReceiver broadcastReceiver;
    private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();
    private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
    private ContentProvider contentProvider;
    private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();
    private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
    private ExclusiveAppComponent<Activity> exclusiveActivity;
    private final FlutterEngine flutterEngine;
    private boolean isWaitingForActivityReattachment = false;
    private final FlutterPlugin.FlutterPluginBinding pluginBinding;
    private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();
    private Service service;
    private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();
    private FlutterEngineServicePluginBinding servicePluginBinding;

    private static class DefaultFlutterAssets implements FlutterPlugin.FlutterAssets {
        final FlutterLoader flutterLoader;

        public String getAssetFilePathByName(String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        public String getAssetFilePathBySubpath(String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        private DefaultFlutterAssets(FlutterLoader flutterLoader2) {
            this.flutterLoader = flutterLoader2;
        }

        public String getAssetFilePathByName(String str, String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }

        public String getAssetFilePathBySubpath(String str, String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }
    }

    private static class FlutterEngineActivityPluginBinding implements ActivityPluginBinding {
        private final Activity activity;
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
        private final Set<PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
        private final Set<PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
        private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();
        private final Set<PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();
        private final Set<PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new HashSet();

        public FlutterEngineActivityPluginBinding(Activity activity2, h hVar) {
            this.activity = activity2;
            this.hiddenLifecycleReference = new HiddenLifecycleReference(hVar);
        }

        public void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.add(activityResultListener);
        }

        public void addOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.add(newIntentListener);
        }

        public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
        }

        public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.add(userLeaveHintListener);
        }

        public void addOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.add(windowFocusChangedListener);
        }

        public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.add(requestPermissionsResultListener);
        }

        public Activity getActivity() {
            return this.activity;
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        /* access modifiers changed from: package-private */
        public boolean onActivityResult(int i10, int i11, Intent intent) {
            Iterator it = new HashSet(this.onActivityResultListeners).iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z10;
                    }
                    if (((PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void onNewIntent(Intent intent) {
            for (PluginRegistry.NewIntentListener onNewIntent : this.onNewIntentListeners) {
                onNewIntent.onNewIntent(intent);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            Iterator<PluginRegistry.RequestPermissionsResultListener> it = this.onRequestPermissionsResultListeners.iterator();
            while (true) {
                boolean z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z10;
                    }
                    if (it.next().onRequestPermissionsResult(i10, strArr, iArr) || z10) {
                        z10 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void onRestoreInstanceState(Bundle bundle) {
            for (ActivityPluginBinding.OnSaveInstanceStateListener onRestoreInstanceState : this.onSaveInstanceStateListeners) {
                onRestoreInstanceState.onRestoreInstanceState(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void onSaveInstanceState(Bundle bundle) {
            for (ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceState : this.onSaveInstanceStateListeners) {
                onSaveInstanceState.onSaveInstanceState(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void onUserLeaveHint() {
            for (PluginRegistry.UserLeaveHintListener onUserLeaveHint : this.onUserLeaveHintListeners) {
                onUserLeaveHint.onUserLeaveHint();
            }
        }

        /* access modifiers changed from: package-private */
        public void onWindowFocusChanged(boolean z10) {
            for (PluginRegistry.WindowFocusChangedListener onWindowFocusChanged : this.onWindowFocusChangedListeners) {
                onWindowFocusChanged.onWindowFocusChanged(z10);
            }
        }

        public void removeActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.remove(activityResultListener);
        }

        public void removeOnNewIntentListener(PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.remove(newIntentListener);
        }

        public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
        }

        public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.remove(userLeaveHintListener);
        }

        public void removeOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.remove(windowFocusChangedListener);
        }

        public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.remove(requestPermissionsResultListener);
        }
    }

    private static class FlutterEngineBroadcastReceiverPluginBinding implements BroadcastReceiverPluginBinding {
        private final BroadcastReceiver broadcastReceiver;

        FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver broadcastReceiver2) {
            this.broadcastReceiver = broadcastReceiver2;
        }

        public BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    private static class FlutterEngineContentProviderPluginBinding implements ContentProviderPluginBinding {
        private final ContentProvider contentProvider;

        FlutterEngineContentProviderPluginBinding(ContentProvider contentProvider2) {
            this.contentProvider = contentProvider2;
        }

        public ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    private static class FlutterEngineServicePluginBinding implements ServicePluginBinding {
        private final HiddenLifecycleReference hiddenLifecycleReference;
        private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
        private final Service service;

        FlutterEngineServicePluginBinding(Service service2, h hVar) {
            this.service = service2;
            this.hiddenLifecycleReference = hVar != null ? new HiddenLifecycleReference(hVar) : null;
        }

        public void addOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add(onModeChangeListener);
        }

        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public Service getService() {
            return this.service;
        }

        /* access modifiers changed from: package-private */
        public void onMoveToBackground() {
            for (ServiceAware.OnModeChangeListener onMoveToBackground : this.onModeChangeListeners) {
                onMoveToBackground.onMoveToBackground();
            }
        }

        /* access modifiers changed from: package-private */
        public void onMoveToForeground() {
            for (ServiceAware.OnModeChangeListener onMoveToForeground : this.onModeChangeListeners) {
                onMoveToForeground.onMoveToForeground();
            }
        }

        public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove(onModeChangeListener);
        }
    }

    FlutterEngineConnectionRegistry(Context context, FlutterEngine flutterEngine2, FlutterLoader flutterLoader, FlutterEngineGroup flutterEngineGroup) {
        this.flutterEngine = flutterEngine2;
        this.pluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine2, flutterEngine2.getDartExecutor(), flutterEngine2.getRenderer(), flutterEngine2.getPlatformViewsController().getRegistry(), new DefaultFlutterAssets(flutterLoader), flutterEngineGroup);
    }

    private void attachToActivityInternal(Activity activity, h hVar) {
        this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, hVar);
        this.flutterEngine.getPlatformViewsController().setSoftwareRendering(activity.getIntent() != null ? activity.getIntent().getBooleanExtra(FlutterShellArgs.ARG_KEY_ENABLE_SOFTWARE_RENDERING, false) : false);
        this.flutterEngine.getPlatformViewsController().attach(activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
        for (ActivityAware next : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                next.onReattachedToActivityForConfigChanges(this.activityPluginBinding);
            } else {
                next.onAttachedToActivity(this.activityPluginBinding);
            }
        }
        this.isWaitingForActivityReattachment = false;
    }

    private Activity attachedActivity() {
        ExclusiveAppComponent<Activity> exclusiveAppComponent = this.exclusiveActivity;
        if (exclusiveAppComponent != null) {
            return exclusiveAppComponent.getAppComponent();
        }
        return null;
    }

    private void detachFromActivityInternal() {
        this.flutterEngine.getPlatformViewsController().detach();
        this.exclusiveActivity = null;
        this.activityPluginBinding = null;
    }

    private void detachFromAppComponent() {
        if (isAttachedToActivity()) {
            detachFromActivity();
        } else if (isAttachedToService()) {
            detachFromService();
        } else if (isAttachedToBroadcastReceiver()) {
            detachFromBroadcastReceiver();
        } else if (isAttachedToContentProvider()) {
            detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.exclusiveActivity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    public void add(FlutterPlugin flutterPlugin) {
        TraceSection.begin("FlutterEngineConnectionRegistry#add " + flutterPlugin.getClass().getSimpleName());
        try {
            if (has(flutterPlugin.getClass())) {
                Log.w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
                return;
            }
            Log.v(TAG, "Adding plugin: " + flutterPlugin);
            this.plugins.put(flutterPlugin.getClass(), flutterPlugin);
            flutterPlugin.onAttachedToEngine(this.pluginBinding);
            if (flutterPlugin instanceof ActivityAware) {
                ActivityAware activityAware = (ActivityAware) flutterPlugin;
                this.activityAwarePlugins.put(flutterPlugin.getClass(), activityAware);
                if (isAttachedToActivity()) {
                    activityAware.onAttachedToActivity(this.activityPluginBinding);
                }
            }
            if (flutterPlugin instanceof ServiceAware) {
                ServiceAware serviceAware = (ServiceAware) flutterPlugin;
                this.serviceAwarePlugins.put(flutterPlugin.getClass(), serviceAware);
                if (isAttachedToService()) {
                    serviceAware.onAttachedToService(this.servicePluginBinding);
                }
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware) flutterPlugin;
                this.broadcastReceiverAwarePlugins.put(flutterPlugin.getClass(), broadcastReceiverAware);
                if (isAttachedToBroadcastReceiver()) {
                    broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                }
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                ContentProviderAware contentProviderAware = (ContentProviderAware) flutterPlugin;
                this.contentProviderAwarePlugins.put(flutterPlugin.getClass(), contentProviderAware);
                if (isAttachedToContentProvider()) {
                    contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                }
            }
            TraceSection.end();
        } finally {
            TraceSection.end();
        }
    }

    public void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, h hVar) {
        TraceSection.begin("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            ExclusiveAppComponent<Activity> exclusiveAppComponent2 = this.exclusiveActivity;
            if (exclusiveAppComponent2 != null) {
                exclusiveAppComponent2.detachFromFlutterEngine();
            }
            detachFromAppComponent();
            this.exclusiveActivity = exclusiveAppComponent;
            attachToActivityInternal(exclusiveAppComponent.getAppComponent(), hVar);
        } finally {
            TraceSection.end();
        }
    }

    public void attachToBroadcastReceiver(BroadcastReceiver broadcastReceiver2, h hVar) {
        TraceSection.begin("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
        try {
            detachFromAppComponent();
            this.broadcastReceiver = broadcastReceiver2;
            this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver2);
            for (BroadcastReceiverAware onAttachedToBroadcastReceiver : this.broadcastReceiverAwarePlugins.values()) {
                onAttachedToBroadcastReceiver.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
            }
        } finally {
            TraceSection.end();
        }
    }

    public void attachToContentProvider(ContentProvider contentProvider2, h hVar) {
        TraceSection.begin("FlutterEngineConnectionRegistry#attachToContentProvider");
        try {
            detachFromAppComponent();
            this.contentProvider = contentProvider2;
            this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider2);
            for (ContentProviderAware onAttachedToContentProvider : this.contentProviderAwarePlugins.values()) {
                onAttachedToContentProvider.onAttachedToContentProvider(this.contentProviderPluginBinding);
            }
        } finally {
            TraceSection.end();
        }
    }

    public void attachToService(Service service2, h hVar, boolean z10) {
        TraceSection.begin("FlutterEngineConnectionRegistry#attachToService");
        try {
            detachFromAppComponent();
            this.service = service2;
            this.servicePluginBinding = new FlutterEngineServicePluginBinding(service2, hVar);
            for (ServiceAware onAttachedToService : this.serviceAwarePlugins.values()) {
                onAttachedToService.onAttachedToService(this.servicePluginBinding);
            }
        } finally {
            TraceSection.end();
        }
    }

    public void destroy() {
        Log.v(TAG, "Destroying.");
        detachFromAppComponent();
        removeAll();
    }

    public void detachFromActivity() {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (ActivityAware onDetachedFromActivity : this.activityAwarePlugins.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                detachFromActivityInternal();
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void detachFromActivityForConfigChanges() {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.isWaitingForActivityReattachment = true;
                for (ActivityAware onDetachedFromActivityForConfigChanges : this.activityAwarePlugins.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                detachFromActivityInternal();
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void detachFromBroadcastReceiver() {
        if (isAttachedToBroadcastReceiver()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (BroadcastReceiverAware onDetachedFromBroadcastReceiver : this.broadcastReceiverAwarePlugins.values()) {
                    onDetachedFromBroadcastReceiver.onDetachedFromBroadcastReceiver();
                }
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void detachFromContentProvider() {
        if (isAttachedToContentProvider()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (ContentProviderAware onDetachedFromContentProvider : this.contentProviderAwarePlugins.values()) {
                    onDetachedFromContentProvider.onDetachedFromContentProvider();
                }
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void detachFromService() {
        if (isAttachedToService()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (ServiceAware onDetachedFromService : this.serviceAwarePlugins.values()) {
                    onDetachedFromService.onDetachedFromService();
                }
                this.service = null;
                this.servicePluginBinding = null;
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public FlutterPlugin get(Class<? extends FlutterPlugin> cls) {
        return this.plugins.get(cls);
    }

    public boolean has(Class<? extends FlutterPlugin> cls) {
        return this.plugins.containsKey(cls);
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.activityPluginBinding.onActivityResult(i10, i11, intent);
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public void onMoveToBackground() {
        if (isAttachedToService()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onMoveToBackground");
            try {
                this.servicePluginBinding.onMoveToBackground();
            } finally {
                TraceSection.end();
            }
        }
    }

    public void onMoveToForeground() {
        if (isAttachedToService()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onMoveToForeground");
            try {
                this.servicePluginBinding.onMoveToForeground();
            } finally {
                TraceSection.end();
            }
        }
    }

    public void onNewIntent(Intent intent) {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.activityPluginBinding.onNewIntent(intent);
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.activityPluginBinding.onRequestPermissionsResult(i10, strArr, iArr);
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.activityPluginBinding.onRestoreInstanceState(bundle);
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.activityPluginBinding.onSaveInstanceState(bundle);
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    public void onUserLeaveHint() {
        if (isAttachedToActivity()) {
            TraceSection.begin("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.activityPluginBinding.onUserLeaveHint();
            } finally {
                TraceSection.end();
            }
        } else {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void remove(Class<? extends FlutterPlugin> cls) {
        FlutterPlugin flutterPlugin = this.plugins.get(cls);
        if (flutterPlugin != null) {
            TraceSection.begin("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (flutterPlugin instanceof ActivityAware) {
                    if (isAttachedToActivity()) {
                        ((ActivityAware) flutterPlugin).onDetachedFromActivity();
                    }
                    this.activityAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof ServiceAware) {
                    if (isAttachedToService()) {
                        ((ServiceAware) flutterPlugin).onDetachedFromService();
                    }
                    this.serviceAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof BroadcastReceiverAware) {
                    if (isAttachedToBroadcastReceiver()) {
                        ((BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                    }
                    this.broadcastReceiverAwarePlugins.remove(cls);
                }
                if (flutterPlugin instanceof ContentProviderAware) {
                    if (isAttachedToContentProvider()) {
                        ((ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                    }
                    this.contentProviderAwarePlugins.remove(cls);
                }
                flutterPlugin.onDetachedFromEngine(this.pluginBinding);
                this.plugins.remove(cls);
            } finally {
                TraceSection.end();
            }
        }
    }

    public void removeAll() {
        remove((Set<Class<? extends FlutterPlugin>>) new HashSet(this.plugins.keySet()));
        this.plugins.clear();
    }

    public void remove(Set<Class<? extends FlutterPlugin>> set) {
        for (Class<? extends FlutterPlugin> remove : set) {
            remove(remove);
        }
    }

    public void add(Set<FlutterPlugin> set) {
        for (FlutterPlugin add : set) {
            add(add);
        }
    }
}
