package ha;

import android.app.Activity;
import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: FlutterLoginFacebookPlugin */
public class b implements FlutterPlugin, ActivityAware {

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f14857h;

    /* renamed from: i  reason: collision with root package name */
    private d f14858i;

    /* renamed from: j  reason: collision with root package name */
    private a f14859j;

    /* renamed from: k  reason: collision with root package name */
    private CallbackManager f14860k;

    /* renamed from: l  reason: collision with root package name */
    private ActivityPluginBinding f14861l;

    /* renamed from: m  reason: collision with root package name */
    private c f14862m;

    private void a() {
        if (this.f14861l != null) {
            LoginManager.getInstance().unregisterCallback(this.f14860k);
            this.f14861l.removeActivityResultListener(this.f14859j);
            this.f14861l = null;
            this.f14858i.i((Activity) null);
        }
    }

    private void b(ActivityPluginBinding activityPluginBinding) {
        this.f14861l = activityPluginBinding;
        LoginManager.getInstance().registerCallback(this.f14860k, this.f14862m);
        activityPluginBinding.addActivityResultListener(this.f14859j);
        this.f14858i.i(activityPluginBinding.getActivity());
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f14857h = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_login_facebook");
        this.f14860k = CallbackManager.Factory.create();
        this.f14862m = new c();
        this.f14859j = new a(this.f14860k);
        d dVar = new d(this.f14862m);
        this.f14858i = dVar;
        this.f14857h.setMethodCallHandler(dVar);
    }

    public void onDetachedFromActivity() {
        a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        a();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f14858i = null;
        this.f14859j = null;
        this.f14860k = null;
        this.f14861l = null;
        this.f14862m = null;
        this.f14857h.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        b(activityPluginBinding);
    }
}
