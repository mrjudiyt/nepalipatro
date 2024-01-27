package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl;
import io.flutter.plugins.webviewflutter.FlutterAssetManager;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebSettingsHostApiImpl;
import io.flutter.plugins.webviewflutter.WebStorageHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewHostApiImpl;

public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    private InstanceManager instanceManager;
    private JavaScriptChannelHostApiImpl javaScriptChannelHostApi;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private WebViewHostApiImpl webViewHostApi;

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUp$0(Void voidR) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setUp$2() {
        this.instanceManager.clear();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new WebViewFlutterPlugin().setUp(registrar.messenger(), registrar.platformViewRegistry(), registrar.activity(), new FlutterAssetManager.RegistrarFlutterAssetManager(registrar.context().getAssets(), registrar));
    }

    private void setUp(BinaryMessenger binaryMessenger, PlatformViewRegistry platformViewRegistry, Context context, FlutterAssetManager flutterAssetManager) {
        this.instanceManager = InstanceManager.create(new a4(binaryMessenger));
        s.d(binaryMessenger, new y3(this));
        platformViewRegistry.registerViewFactory("plugins.flutter.io/webview", new FlutterWebViewFactory(this.instanceManager));
        this.webViewHostApi = new WebViewHostApiImpl(this.instanceManager, binaryMessenger, new WebViewHostApiImpl.WebViewProxy(), context);
        this.javaScriptChannelHostApi = new JavaScriptChannelHostApiImpl(this.instanceManager, new JavaScriptChannelHostApiImpl.JavaScriptChannelCreator(), new JavaScriptChannelFlutterApiImpl(binaryMessenger, this.instanceManager), new Handler(context.getMainLooper()));
        v.d(binaryMessenger, new JavaObjectHostApiImpl(this.instanceManager));
        GeneratedAndroidWebView.WebViewHostApi.CC.b0(binaryMessenger, this.webViewHostApi);
        y.d(binaryMessenger, this.javaScriptChannelHostApi);
        m1.f(binaryMessenger, new WebViewClientHostApiImpl(this.instanceManager, new WebViewClientHostApiImpl.WebViewClientCreator(), new WebViewClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        k0.f(binaryMessenger, new WebChromeClientHostApiImpl(this.instanceManager, new WebChromeClientHostApiImpl.WebChromeClientCreator(), new WebChromeClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        i.d(binaryMessenger, new DownloadListenerHostApiImpl(this.instanceManager, new DownloadListenerHostApiImpl.DownloadListenerCreator(), new DownloadListenerFlutterApiImpl(binaryMessenger, this.instanceManager)));
        z0.D(binaryMessenger, new WebSettingsHostApiImpl(this.instanceManager, new WebSettingsHostApiImpl.WebSettingsCreator()));
        m.f(binaryMessenger, new FlutterAssetManagerHostApiImpl(flutterAssetManager));
        GeneratedAndroidWebView.CookieManagerHostApi.CC.j(binaryMessenger, new CookieManagerHostApiImpl(binaryMessenger, this.instanceManager));
        c1.f(binaryMessenger, new WebStorageHostApiImpl(this.instanceManager, new WebStorageHostApiImpl.WebStorageCreator()));
        if (Build.VERSION.SDK_INT >= 21) {
            c0.f(binaryMessenger, new PermissionRequestHostApiImpl(binaryMessenger, this.instanceManager));
        }
        p.d(binaryMessenger, new GeolocationPermissionsCallbackHostApiImpl(binaryMessenger, this.instanceManager));
    }

    private void updateContext(Context context) {
        this.webViewHostApi.setContext(context);
        this.javaScriptChannelHostApi.setPlatformThreadHandler(new Handler(context.getMainLooper()));
    }

    public InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getPlatformViewRegistry(), flutterPluginBinding.getApplicationContext(), new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
    }

    public void onDetachedFromActivity() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivityForConfigChanges() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        InstanceManager instanceManager2 = this.instanceManager;
        if (instanceManager2 != null) {
            instanceManager2.stopFinalizationListener();
            this.instanceManager = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }
}
