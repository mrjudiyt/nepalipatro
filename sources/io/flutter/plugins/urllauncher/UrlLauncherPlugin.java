package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.urllauncher.Messages;

public final class UrlLauncherPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "UrlLauncherPlugin";
    private UrlLauncher urlLauncher;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        UrlLauncher urlLauncher2 = new UrlLauncher(registrar.context());
        urlLauncher2.setActivity(registrar.activity());
        f.l(registrar.messenger(), urlLauncher2);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        UrlLauncher urlLauncher2 = this.urlLauncher;
        if (urlLauncher2 == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher2.setActivity(activityPluginBinding.getActivity());
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.urlLauncher = new UrlLauncher(flutterPluginBinding.getApplicationContext());
        f.l(flutterPluginBinding.getBinaryMessenger(), this.urlLauncher);
    }

    public void onDetachedFromActivity() {
        UrlLauncher urlLauncher2 = this.urlLauncher;
        if (urlLauncher2 == null) {
            Log.wtf(TAG, "urlLauncher was never set.");
        } else {
            urlLauncher2.setActivity((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.urlLauncher == null) {
            Log.wtf(TAG, "Already detached from the engine.");
            return;
        }
        f.l(flutterPluginBinding.getBinaryMessenger(), (Messages.UrlLauncherApi) null);
        this.urlLauncher = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
