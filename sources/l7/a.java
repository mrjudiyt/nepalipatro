package l7;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Iterator;

/* compiled from: LaunchReviewPlugin */
public class a implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: h  reason: collision with root package name */
    Activity f15643h;

    private static a a(a aVar, BinaryMessenger binaryMessenger, Activity activity) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "launch_review");
        aVar.f15643h = activity;
        methodChannel.setMethodCallHandler(aVar);
        return aVar;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f15643h = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(this, flutterPluginBinding.getBinaryMessenger(), (Activity) null);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("launch")) {
            String str = (String) methodCall.argument("android_id");
            if (str == null) {
                str = this.f15643h.getPackageName();
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            boolean z10 = false;
            Iterator<ResolveInfo> it = this.f15643h.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                    ActivityInfo activityInfo = next.activityInfo;
                    ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.addFlags(268435456);
                    intent.addFlags(2097152);
                    intent.addFlags(67108864);
                    intent.setComponent(componentName);
                    Toast.makeText(this.f15643h, "Please Rate Application", 0).show();
                    this.f15643h.startActivity(intent);
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                try {
                    Activity activity = this.f15643h;
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                } catch (ActivityNotFoundException unused) {
                    Activity activity2 = this.f15643h;
                    activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
                }
            }
            result.success((Object) null);
            return;
        }
        result.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
    }
}
