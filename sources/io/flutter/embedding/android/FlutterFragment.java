package io.flutter.embedding.android;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.b;
import io.flutter.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import p0.a;

public class FlutterFragment extends Fragment implements FlutterActivityAndFragmentDelegate.Host, ComponentCallbacks2, FlutterActivityAndFragmentDelegate.DelegateFactory {
    protected static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    protected static final String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
    protected static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    protected static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    protected static final String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    protected static final String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
    protected static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    protected static final String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    protected static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    protected static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    protected static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    protected static final String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
    protected static final String ARG_INITIAL_ROUTE = "initial_route";
    protected static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    protected static final String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
    protected static final String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
    public static final int FLUTTER_VIEW_ID = ViewUtils.generateViewId(61938);
    private static final String TAG = "FlutterFragment";
    FlutterActivityAndFragmentDelegate delegate;
    private FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory;
    private final e onBackPressedCallback;
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;

    @interface ActivityCallThrough {
    }

    public static class CachedEngineFragmentBuilder {
        private boolean destroyEngineWithFragment;
        private final String engineId;
        private final Class<? extends FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private TransparencyMode transparencyMode;

        public <T extends FlutterFragment> T build() {
            try {
                T t10 = (FlutterFragment) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        /* access modifiers changed from: protected */
        public Bundle createArgs() {
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_ID, this.engineId);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, this.destroyEngineWithFragment);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            RenderMode renderMode2 = this.renderMode;
            if (renderMode2 == null) {
                renderMode2 = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode2.name());
            TransparencyMode transparencyMode2 = this.transparencyMode;
            if (transparencyMode2 == null) {
                transparencyMode2 = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode2.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean z10) {
            this.destroyEngineWithFragment = z10;
            return this;
        }

        public CachedEngineFragmentBuilder handleDeeplinking(Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public CachedEngineFragmentBuilder renderMode(RenderMode renderMode2) {
            this.renderMode = renderMode2;
            return this;
        }

        public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        public CachedEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        public CachedEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        public CachedEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode2) {
            this.transparencyMode = transparencyMode2;
            return this;
        }

        private CachedEngineFragmentBuilder(String str) {
            this((Class<? extends FlutterFragment>) FlutterFragment.class, str);
        }

        public CachedEngineFragmentBuilder(Class<? extends FlutterFragment> cls, String str) {
            this.destroyEngineWithFragment = false;
            this.handleDeeplinking = false;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.engineId = str;
        }
    }

    public static class NewEngineInGroupFragmentBuilder {
        private final String cachedEngineGroupId;
        private String dartEntrypoint;
        private final Class<? extends FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private String initialRoute;
        private RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private TransparencyMode transparencyMode;

        public NewEngineInGroupFragmentBuilder(String str) {
            this(FlutterFragment.class, str);
        }

        public <T extends FlutterFragment> T build() {
            try {
                T t10 = (FlutterFragment) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        /* access modifiers changed from: protected */
        public Bundle createArgs() {
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_GROUP_ID, this.cachedEngineGroupId);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            RenderMode renderMode2 = this.renderMode;
            if (renderMode2 == null) {
                renderMode2 = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode2.name());
            TransparencyMode transparencyMode2 = this.transparencyMode;
            if (transparencyMode2 == null) {
                transparencyMode2 = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode2.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public NewEngineInGroupFragmentBuilder dartEntrypoint(String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public NewEngineInGroupFragmentBuilder handleDeeplinking(boolean z10) {
            this.handleDeeplinking = z10;
            return this;
        }

        public NewEngineInGroupFragmentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public NewEngineInGroupFragmentBuilder renderMode(RenderMode renderMode2) {
            this.renderMode = renderMode2;
            return this;
        }

        public NewEngineInGroupFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        public NewEngineInGroupFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        public NewEngineInGroupFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        public NewEngineInGroupFragmentBuilder transparencyMode(TransparencyMode transparencyMode2) {
            this.transparencyMode = transparencyMode2;
            return this;
        }

        public NewEngineInGroupFragmentBuilder(Class<? extends FlutterFragment> cls, String str) {
            this.dartEntrypoint = "main";
            this.initialRoute = RemoteSettings.FORWARD_SLASH_STRING;
            this.handleDeeplinking = false;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.cachedEngineGroupId = str;
        }
    }

    public FlutterFragment() {
        this.onWindowFocusChangeListener = Build.VERSION.SDK_INT >= 18 ? new ViewTreeObserver.OnWindowFocusChangeListener() {
            public void onWindowFocusChanged(boolean z10) {
                if (FlutterFragment.this.stillAttachedForEvent("onWindowFocusChanged")) {
                    FlutterFragment.this.delegate.onWindowFocusChanged(z10);
                }
            }
        } : null;
        this.delegateFactory = this;
        this.onBackPressedCallback = new e(true) {
            public void handleOnBackPressed() {
                FlutterFragment.this.onBackPressed();
            }
        };
        setArguments(new Bundle());
    }

    public static FlutterFragment createDefault() {
        return new NewEngineFragmentBuilder().build();
    }

    /* access modifiers changed from: private */
    public boolean stillAttachedForEvent(String str) {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        } else {
            Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    public static CachedEngineFragmentBuilder withCachedEngine(String str) {
        return new CachedEngineFragmentBuilder(str);
    }

    public static NewEngineFragmentBuilder withNewEngine() {
        return new NewEngineFragmentBuilder();
    }

    public static NewEngineInGroupFragmentBuilder withNewEngineInGroup(String str) {
        return new NewEngineInGroupFragmentBuilder(str);
    }

    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
        }
    }

    public FlutterActivityAndFragmentDelegate createDelegate(FlutterActivityAndFragmentDelegate.Host host) {
        return new FlutterActivityAndFragmentDelegate(host);
    }

    public void detachFromFlutterEngine() {
        Log.w(TAG, "FlutterFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public String getAppBundlePath() {
        return getArguments().getString(ARG_APP_BUNDLE_PATH);
    }

    public String getCachedEngineGroupId() {
        return getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, (String) null);
    }

    public String getCachedEngineId() {
        return getArguments().getString(ARG_CACHED_ENGINE_ID, (String) null);
    }

    public List<String> getDartEntrypointArgs() {
        return getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
    }

    public String getDartEntrypointFunctionName() {
        return getArguments().getString(ARG_DART_ENTRYPOINT, "main");
    }

    public String getDartEntrypointLibraryUri() {
        return getArguments().getString(ARG_DART_ENTRYPOINT_URI);
    }

    public /* bridge */ /* synthetic */ a getDefaultViewModelCreationExtras() {
        return f.a(this);
    }

    public ExclusiveAppComponent<Activity> getExclusiveAppComponent() {
        return this.delegate;
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    public FlutterShellArgs getFlutterShellArgs() {
        String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new FlutterShellArgs(stringArray);
    }

    public String getInitialRoute() {
        return getArguments().getString(ARG_INITIAL_ROUTE);
    }

    public RenderMode getRenderMode() {
        return RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
    }

    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
    }

    /* access modifiers changed from: package-private */
    public boolean isFlutterEngineInjected() {
        return this.delegate.isFlutterEngineFromHost();
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i10, i11, intent);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FlutterActivityAndFragmentDelegate createDelegate = this.delegateFactory.createDelegate(this);
        this.delegate = createDelegate;
        createDelegate.onAttach(context);
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            requireActivity().getOnBackPressedDispatcher().a(this, this.onBackPressedCallback);
        }
        context.registerComponentCallbacks(this);
    }

    @ActivityCallThrough
    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.delegate.onRestoreInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (Build.VERSION.SDK_INT >= 18) {
            requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    public void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDetach();
            this.delegate.release();
            this.delegate = null;
            return;
        }
        Log.v(TAG, "FlutterFragment " + this + " onDetach called after release.");
    }

    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    public void onFlutterUiDisplayed() {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
        }
    }

    public void onFlutterUiNoLongerDisplayed() {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    @ActivityCallThrough
    public void onNewIntent(Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
    }

    @ActivityCallThrough
    public void onPostResume() {
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @ActivityCallThrough
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    public void onTrimMemory(int i10) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i10);
        }
    }

    @ActivityCallThrough
    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 18) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
    }

    public boolean popSystemNavigator() {
        androidx.fragment.app.e activity;
        if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
            return false;
        }
        this.onBackPressedCallback.setEnabled(false);
        activity.getOnBackPressedDispatcher().c();
        this.onBackPressedCallback.setEnabled(true);
        return true;
    }

    public FlutterEngine provideFlutterEngine(Context context) {
        androidx.fragment.app.e activity = getActivity();
        if (!(activity instanceof FlutterEngineProvider)) {
            return null;
        }
        Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((FlutterEngineProvider) activity).provideFlutterEngine(getContext());
    }

    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
        }
        return null;
    }

    public SplashScreen provideSplashScreen() {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof SplashScreenProvider) {
            return ((SplashScreenProvider) activity).provideSplashScreen();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void setDelegateFactory(FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory2) {
        this.delegateFactory = delegateFactory2;
        this.delegate = delegateFactory2.createDelegate(this);
    }

    public /* synthetic */ void setFrameworkHandlesBack(boolean z10) {
        b.a(this, z10);
    }

    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDelayFirstAndroidViewDraw() {
        return getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean z10 = getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? z10 : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
    }

    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    public boolean shouldHandleDeeplinking() {
        return getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
    }

    public boolean shouldRestoreAndSaveState() {
        if (getArguments().containsKey(ARG_ENABLE_STATE_RESTORATION)) {
            return getArguments().getBoolean(ARG_ENABLE_STATE_RESTORATION);
        }
        return getCachedEngineId() == null;
    }

    public void updateSystemUiOverlays() {
        FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }

    public static class NewEngineFragmentBuilder {
        private String appBundlePath;
        private String dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private String dartLibraryUri;
        private final Class<? extends FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private String initialRoute;
        private RenderMode renderMode;
        private FlutterShellArgs shellArgs;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private TransparencyMode transparencyMode;

        public NewEngineFragmentBuilder() {
            this.dartEntrypoint = "main";
            this.dartLibraryUri = null;
            this.initialRoute = RemoteSettings.FORWARD_SLASH_STRING;
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = FlutterFragment.class;
        }

        public NewEngineFragmentBuilder appBundlePath(String str) {
            this.appBundlePath = str;
            return this;
        }

        public <T extends FlutterFragment> T build() {
            try {
                T t10 = (FlutterFragment) this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(createArgs());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e10);
            }
        }

        /* access modifiers changed from: protected */
        public Bundle createArgs() {
            Bundle bundle = new Bundle();
            bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            bundle.putString(FlutterFragment.ARG_APP_BUNDLE_PATH, this.appBundlePath);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT_URI, this.dartLibraryUri);
            bundle.putStringArrayList(FlutterFragment.ARG_DART_ENTRYPOINT_ARGS, this.dartEntrypointArgs != null ? new ArrayList(this.dartEntrypointArgs) : null);
            FlutterShellArgs flutterShellArgs = this.shellArgs;
            if (flutterShellArgs != null) {
                bundle.putStringArray(FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, flutterShellArgs.toArray());
            }
            RenderMode renderMode2 = this.renderMode;
            if (renderMode2 == null) {
                renderMode2 = RenderMode.surface;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode2.name());
            TransparencyMode transparencyMode2 = this.transparencyMode;
            if (transparencyMode2 == null) {
                transparencyMode2 = TransparencyMode.transparent;
            }
            bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode2.name());
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public NewEngineFragmentBuilder dartEntrypoint(String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public NewEngineFragmentBuilder dartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public NewEngineFragmentBuilder dartLibraryUri(String str) {
            this.dartLibraryUri = str;
            return this;
        }

        public NewEngineFragmentBuilder flutterShellArgs(FlutterShellArgs flutterShellArgs) {
            this.shellArgs = flutterShellArgs;
            return this;
        }

        public NewEngineFragmentBuilder handleDeeplinking(Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public NewEngineFragmentBuilder initialRoute(String str) {
            this.initialRoute = str;
            return this;
        }

        public NewEngineFragmentBuilder renderMode(RenderMode renderMode2) {
            this.renderMode = renderMode2;
            return this;
        }

        public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean z10) {
            this.shouldAttachEngineToActivity = z10;
            return this;
        }

        public NewEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z10) {
            this.shouldAutomaticallyHandleOnBackPressed = z10;
            return this;
        }

        public NewEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z10) {
            this.shouldDelayFirstAndroidViewDraw = z10;
            return this;
        }

        public NewEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode2) {
            this.transparencyMode = transparencyMode2;
            return this;
        }

        public NewEngineFragmentBuilder(Class<? extends FlutterFragment> cls) {
            this.dartEntrypoint = "main";
            this.dartLibraryUri = null;
            this.initialRoute = RemoteSettings.FORWARD_SLASH_STRING;
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = RenderMode.surface;
            this.transparencyMode = TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
        }
    }
}
