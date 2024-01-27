package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.h;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.FlutterEngineGroupCache;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.util.ViewUtils;
import java.util.Arrays;
import java.util.List;

class FlutterActivityAndFragmentDelegate implements ExclusiveAppComponent<Activity> {
    private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
    private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
    private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
    private static final String TAG = "FlutterActivityAndFragmentDelegate";
    ViewTreeObserver.OnPreDrawListener activePreDrawListener;
    private FlutterEngineGroup engineGroup;
    private FlutterEngine flutterEngine;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    FlutterView flutterView;
    /* access modifiers changed from: private */
    public Host host;
    private boolean isAttached;
    /* access modifiers changed from: private */
    public boolean isFirstFrameRendered;
    private boolean isFlutterEngineFromHost;
    /* access modifiers changed from: private */
    public boolean isFlutterUiDisplayed;
    private PlatformPlugin platformPlugin;
    private Integer previousVisibility;

    public interface DelegateFactory {
        FlutterActivityAndFragmentDelegate createDelegate(Host host);
    }

    interface Host extends SplashScreenProvider, FlutterEngineProvider, FlutterEngineConfigurator, PlatformPlugin.PlatformPluginDelegate {
        void cleanUpFlutterEngine(FlutterEngine flutterEngine);

        void configureFlutterEngine(FlutterEngine flutterEngine);

        void detachFromFlutterEngine();

        Activity getActivity();

        String getAppBundlePath();

        String getCachedEngineGroupId();

        String getCachedEngineId();

        Context getContext();

        List<String> getDartEntrypointArgs();

        String getDartEntrypointFunctionName();

        String getDartEntrypointLibraryUri();

        ExclusiveAppComponent<Activity> getExclusiveAppComponent();

        FlutterShellArgs getFlutterShellArgs();

        String getInitialRoute();

        h getLifecycle();

        RenderMode getRenderMode();

        TransparencyMode getTransparencyMode();

        void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView);

        void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView);

        void onFlutterUiDisplayed();

        void onFlutterUiNoLongerDisplayed();

        FlutterEngine provideFlutterEngine(Context context);

        PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine);

        SplashScreen provideSplashScreen();

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();

        boolean shouldDispatchAppLifecycleState();

        boolean shouldHandleDeeplinking();

        boolean shouldRestoreAndSaveState();

        void updateSystemUiOverlays();
    }

    FlutterActivityAndFragmentDelegate(Host host2) {
        this(host2, (FlutterEngineGroup) null);
    }

    private FlutterEngineGroup.Options addEntrypointOptions(FlutterEngineGroup.Options options) {
        String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
        }
        DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
        String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
            initialRoute = RemoteSettings.FORWARD_SLASH_STRING;
        }
        return options.setDartEntrypoint(dartEntrypoint).setInitialRoute(initialRoute).setDartEntrypointArgs(this.host.getDartEntrypointArgs());
    }

    private void delayFirstAndroidViewDraw(final FlutterView flutterView2) {
        if (this.host.getRenderMode() == RenderMode.surface) {
            if (this.activePreDrawListener != null) {
                flutterView2.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            }
            this.activePreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    if (FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed && FlutterActivityAndFragmentDelegate.this.activePreDrawListener != null) {
                        flutterView2.getViewTreeObserver().removeOnPreDrawListener(this);
                        FlutterActivityAndFragmentDelegate.this.activePreDrawListener = null;
                    }
                    return FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed;
                }
            };
            flutterView2.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    private void doInitialFlutterViewRun() {
        String str;
        DartExecutor.DartEntrypoint dartEntrypoint;
        if (this.host.getCachedEngineId() == null && !this.flutterEngine.getDartExecutor().isExecutingDart()) {
            String initialRoute = this.host.getInitialRoute();
            if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
                initialRoute = RemoteSettings.FORWARD_SLASH_STRING;
            }
            String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
            if (("Executing Dart entrypoint: " + this.host.getDartEntrypointFunctionName() + ", library uri: " + dartEntrypointLibraryUri) == null) {
                str = "\"\"";
            } else {
                str = dartEntrypointLibraryUri + ", and sending initial route: " + initialRoute;
            }
            Log.v(TAG, str);
            this.flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
            String appBundlePath = this.host.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = FlutterInjector.instance().flutterLoader().findAppBundlePath();
            }
            if (dartEntrypointLibraryUri == null) {
                dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
            } else {
                dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, dartEntrypointLibraryUri, this.host.getDartEntrypointFunctionName());
            }
            this.flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint, this.host.getDartEntrypointArgs());
        }
    }

    private void ensureAlive() {
        if (this.host == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String maybeGetInitialRouteFromIntent(Intent intent) {
        Uri data;
        if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void detachFromFlutterEngine() {
        if (!this.host.shouldDestroyEngineWithHost()) {
            this.host.detachFromFlutterEngine();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.host + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* access modifiers changed from: package-private */
    public FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    /* access modifiers changed from: package-private */
    public boolean isAttached() {
        return this.isAttached;
    }

    /* access modifiers changed from: package-private */
    public boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    /* access modifiers changed from: package-private */
    public void onActivityResult(int i10, int i11, Intent intent) {
        ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
            this.flutterEngine.getActivityControlSurface().onActivityResult(i10, i11, intent);
            return;
        }
        Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void onAttach(Context context) {
        ensureAlive();
        if (this.flutterEngine == null) {
            setupFlutterEngine();
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Log.v(TAG, "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.flutterEngine.getActivityControlSurface().attachToActivity(this, this.host.getLifecycle());
        }
        Host host2 = this.host;
        this.platformPlugin = host2.providePlatformPlugin(host2.getActivity(), this.flutterEngine);
        this.host.configureFlutterEngine(this.flutterEngine);
        this.isAttached = true;
    }

    /* access modifiers changed from: package-private */
    public void onBackPressed() {
        ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
            this.flutterEngine.getNavigationChannel().popRoute();
            return;
        }
        Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z10) {
        Log.v(TAG, "Creating FlutterView.");
        ensureAlive();
        boolean z11 = true;
        if (this.host.getRenderMode() == RenderMode.surface) {
            Context context = this.host.getContext();
            if (this.host.getTransparencyMode() != TransparencyMode.transparent) {
                z11 = false;
            }
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, z11);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(this.host.getContext());
            if (this.host.getTransparencyMode() != TransparencyMode.opaque) {
                z11 = false;
            }
            flutterTextureView.setOpaque(z11);
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterTextureView);
        }
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        Log.v(TAG, "Attaching FlutterEngine to FlutterView.");
        this.flutterView.attachToFlutterEngine(this.flutterEngine);
        this.flutterView.setId(i10);
        SplashScreen provideSplashScreen = this.host.provideSplashScreen();
        if (provideSplashScreen != null) {
            Log.w(TAG, "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.host.getContext());
            flutterSplashView.setId(ViewUtils.generateViewId(FLUTTER_SPLASH_VIEW_FALLBACK_ID));
            flutterSplashView.displayFlutterViewWithSplash(this.flutterView, provideSplashScreen);
            return flutterSplashView;
        }
        if (z10) {
            delayFirstAndroidViewDraw(this.flutterView);
        }
        return this.flutterView;
    }

    /* access modifiers changed from: package-private */
    public void onDestroyView() {
        Log.v(TAG, "onDestroyView()");
        ensureAlive();
        if (this.activePreDrawListener != null) {
            this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            this.activePreDrawListener = null;
        }
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 != null) {
            flutterView2.detachFromFlutterEngine();
            this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void onDetach() {
        FlutterEngine flutterEngine2;
        Log.v(TAG, "onDetach()");
        ensureAlive();
        this.host.cleanUpFlutterEngine(this.flutterEngine);
        if (this.host.shouldAttachEngineToActivity()) {
            Log.v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.host.getActivity().isChangingConfigurations()) {
                this.flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
            } else {
                this.flutterEngine.getActivityControlSurface().detachFromActivity();
            }
        }
        PlatformPlugin platformPlugin2 = this.platformPlugin;
        if (platformPlugin2 != null) {
            platformPlugin2.destroy();
            this.platformPlugin = null;
        }
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine2 = this.flutterEngine) != null) {
            flutterEngine2.getLifecycleChannel().appIsDetached();
        }
        if (this.host.shouldDestroyEngineWithHost()) {
            this.flutterEngine.destroy();
            if (this.host.getCachedEngineId() != null) {
                FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
            }
            this.flutterEngine = null;
        }
        this.isAttached = false;
    }

    /* access modifiers changed from: package-private */
    public void onNewIntent(Intent intent) {
        ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.flutterEngine.getActivityControlSurface().onNewIntent(intent);
            String maybeGetInitialRouteFromIntent = maybeGetInitialRouteFromIntent(intent);
            if (maybeGetInitialRouteFromIntent != null && !maybeGetInitialRouteFromIntent.isEmpty()) {
                this.flutterEngine.getNavigationChannel().pushRouteInformation(maybeGetInitialRouteFromIntent);
                return;
            }
            return;
        }
        Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void onPause() {
        FlutterEngine flutterEngine2;
        Log.v(TAG, "onPause()");
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine2 = this.flutterEngine) != null) {
            flutterEngine2.getLifecycleChannel().appIsInactive();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPostResume() {
        Log.v(TAG, "onPostResume()");
        ensureAlive();
        if (this.flutterEngine != null) {
            updateSystemUiOverlays();
        } else {
            Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i10, strArr, iArr);
            return;
        }
        Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void onRestoreInstanceState(Bundle bundle) {
        Bundle bundle2;
        Log.v(TAG, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        ensureAlive();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
            bArr = bundle.getByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY);
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.host.shouldRestoreAndSaveState()) {
            this.flutterEngine.getRestorationChannel().setRestorationData(bArr);
        }
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        FlutterEngine flutterEngine2;
        Log.v(TAG, "onResume()");
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine2 = this.flutterEngine) != null) {
            flutterEngine2.getLifecycleChannel().appIsResumed();
        }
    }

    /* access modifiers changed from: package-private */
    public void onSaveInstanceState(Bundle bundle) {
        Log.v(TAG, "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        ensureAlive();
        if (this.host.shouldRestoreAndSaveState()) {
            bundle.putByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY, this.flutterEngine.getRestorationChannel().getRestorationData());
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle2);
            bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void onStart() {
        Log.v(TAG, "onStart()");
        ensureAlive();
        doInitialFlutterViewRun();
        Integer num = this.previousVisibility;
        if (num != null) {
            this.flutterView.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void onStop() {
        FlutterEngine flutterEngine2;
        Log.v(TAG, "onStop()");
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine2 = this.flutterEngine) != null) {
            flutterEngine2.getLifecycleChannel().appIsPaused();
        }
        this.previousVisibility = Integer.valueOf(this.flutterView.getVisibility());
        this.flutterView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void onTrimMemory(int i10) {
        ensureAlive();
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            if (this.isFirstFrameRendered && i10 >= 10) {
                flutterEngine2.getDartExecutor().notifyLowMemoryWarning();
                this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
            }
            this.flutterEngine.getRenderer().onTrimMemory(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void onUserLeaveHint() {
        ensureAlive();
        if (this.flutterEngine != null) {
            Log.v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.flutterEngine.getActivityControlSurface().onUserLeaveHint();
            return;
        }
        Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void onWindowFocusChanged(boolean z10) {
        FlutterEngine flutterEngine2;
        ensureAlive();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z10 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        Log.v(TAG, sb.toString());
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine2 = this.flutterEngine) != null) {
            if (z10) {
                flutterEngine2.getLifecycleChannel().aWindowIsFocused();
            } else {
                flutterEngine2.getLifecycleChannel().noWindowsAreFocused();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
    }

    /* access modifiers changed from: package-private */
    public void setupFlutterEngine() {
        Log.v(TAG, "Setting up FlutterEngine.");
        String cachedEngineId = this.host.getCachedEngineId();
        if (cachedEngineId != null) {
            FlutterEngine flutterEngine2 = FlutterEngineCache.getInstance().get(cachedEngineId);
            this.flutterEngine = flutterEngine2;
            this.isFlutterEngineFromHost = true;
            if (flutterEngine2 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + cachedEngineId + "'");
            }
            return;
        }
        Host host2 = this.host;
        FlutterEngine provideFlutterEngine = host2.provideFlutterEngine(host2.getContext());
        this.flutterEngine = provideFlutterEngine;
        if (provideFlutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        String cachedEngineGroupId = this.host.getCachedEngineGroupId();
        if (cachedEngineGroupId != null) {
            FlutterEngineGroup flutterEngineGroup = FlutterEngineGroupCache.getInstance().get(cachedEngineGroupId);
            if (flutterEngineGroup != null) {
                this.flutterEngine = flutterEngineGroup.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext())));
                this.isFlutterEngineFromHost = false;
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + cachedEngineGroupId + "'");
        }
        Log.v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        FlutterEngineGroup flutterEngineGroup2 = this.engineGroup;
        if (flutterEngineGroup2 == null) {
            flutterEngineGroup2 = new FlutterEngineGroup(this.host.getContext(), this.host.getFlutterShellArgs().toArray());
        }
        this.flutterEngine = flutterEngineGroup2.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(this.host.shouldRestoreAndSaveState())));
        this.isFlutterEngineFromHost = false;
    }

    /* access modifiers changed from: package-private */
    public void updateSystemUiOverlays() {
        PlatformPlugin platformPlugin2 = this.platformPlugin;
        if (platformPlugin2 != null) {
            platformPlugin2.updateSystemUiOverlays();
        }
    }

    FlutterActivityAndFragmentDelegate(Host host2, FlutterEngineGroup flutterEngineGroup) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() {
            public void onFlutterUiDisplayed() {
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiDisplayed();
                boolean unused = FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = true;
                boolean unused2 = FlutterActivityAndFragmentDelegate.this.isFirstFrameRendered = true;
            }

            public void onFlutterUiNoLongerDisplayed() {
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiNoLongerDisplayed();
                boolean unused = FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = false;
            }
        };
        this.host = host2;
        this.isFirstFrameRendered = false;
        this.engineGroup = flutterEngineGroup;
    }

    public Activity getAppComponent() {
        Activity activity = this.host.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
}
