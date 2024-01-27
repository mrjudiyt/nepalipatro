package b2;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* compiled from: PermissionHandlerPlugin */
public final class m implements FlutterPlugin, ActivityAware {

    /* renamed from: h  reason: collision with root package name */
    private final n f4982h = new n();

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f4983i;

    /* renamed from: j  reason: collision with root package name */
    private PluginRegistry.Registrar f4984j;

    /* renamed from: k  reason: collision with root package name */
    private ActivityPluginBinding f4985k;

    /* renamed from: l  reason: collision with root package name */
    private l f4986l;

    private void a() {
        ActivityPluginBinding activityPluginBinding = this.f4985k;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f4982h);
            this.f4985k.removeRequestPermissionsResultListener(this.f4982h);
        }
    }

    private void b() {
        PluginRegistry.Registrar registrar = this.f4984j;
        if (registrar != null) {
            registrar.addActivityResultListener(this.f4982h);
            this.f4984j.addRequestPermissionsResultListener(this.f4982h);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f4985k;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f4982h);
            this.f4985k.addRequestPermissionsResultListener(this.f4982h);
        }
    }

    private void c(Context context, BinaryMessenger binaryMessenger) {
        this.f4983i = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f4982h, new p());
        this.f4986l = lVar;
        this.f4983i.setMethodCallHandler(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.f4986l;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    private void e() {
        this.f4983i.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4983i = null;
        this.f4986l = null;
    }

    private void f() {
        l lVar = this.f4986l;
        if (lVar != null) {
            lVar.i((Activity) null);
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.f4985k = activityPluginBinding;
        b();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromActivity() {
        f();
        a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
