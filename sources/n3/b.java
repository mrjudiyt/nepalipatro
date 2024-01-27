package n3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* compiled from: CustomTabsPlugin */
public class b implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {

    /* renamed from: h  reason: collision with root package name */
    private Activity f10270h;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f10271i;

    private void a(Map<String, Object> map, MethodChannel.Result result) {
        Activity activity = this.f10270h;
        if (activity == null) {
            result.error("LAUNCH_ERROR", "Launching a CustomTabs requires a foreground activity.", (Object) null);
            return;
        }
        a aVar = new a(activity);
        try {
            Map map2 = (Map) map.get("customTabsOption");
            c3.b.b(activity, aVar.c(map2), Uri.parse(map.get("url").toString()), aVar.b(map2));
            result.success((Object) null);
        } catch (ActivityNotFoundException e10) {
            result.error("LAUNCH_ERROR", e10.getMessage(), (Object) null);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f10270h = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.droibit.github.io/custom_tabs");
        this.f10271i = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromActivity() {
        this.f10270h = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f10271i;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("launch".equals(methodCall.method)) {
            a((Map) methodCall.arguments, result);
        } else {
            result.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
