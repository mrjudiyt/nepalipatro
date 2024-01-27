package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class InAppPurchasePlugin implements FlutterPlugin, ActivityAware {
    static final String PROXY_PACKAGE_KEY = "PROXY_PACKAGE";
    static final String PROXY_VALUE = "io.flutter.plugins.inapppurchase";
    private MethodCallHandlerImpl methodCallHandler;
    private MethodChannel methodChannel;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        InAppPurchasePlugin inAppPurchasePlugin = new InAppPurchasePlugin();
        registrar.activity().getIntent().putExtra(PROXY_PACKAGE_KEY, "io.flutter.plugins.inapppurchase");
        ((Application) registrar.context().getApplicationContext()).registerActivityLifecycleCallbacks(inAppPurchasePlugin.methodCallHandler);
    }

    private void setUpMethodChannel(BinaryMessenger binaryMessenger, Context context) {
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/in_app_purchase");
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl((Activity) null, context, this.methodChannel, new BillingClientFactoryImpl());
        this.methodCallHandler = methodCallHandlerImpl;
        this.methodChannel.setMethodCallHandler(methodCallHandlerImpl);
    }

    private void teardownMethodChannel() {
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.methodChannel = null;
        this.methodCallHandler = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.getActivity().getIntent().putExtra(PROXY_PACKAGE_KEY, "io.flutter.plugins.inapppurchase");
        this.methodCallHandler.setActivity(activityPluginBinding.getActivity());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUpMethodChannel(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivity() {
        this.methodCallHandler.setActivity((Activity) null);
        this.methodCallHandler.onDetachedFromActivity();
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.methodCallHandler.setActivity((Activity) null);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        teardownMethodChannel();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    /* access modifiers changed from: package-private */
    public void setMethodCallHandler(MethodCallHandlerImpl methodCallHandlerImpl) {
        this.methodCallHandler = methodCallHandlerImpl;
    }
}
