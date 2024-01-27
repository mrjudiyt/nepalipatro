package y1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.q;

/* compiled from: SignInWithApplePlugin.kt */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: k  reason: collision with root package name */
    public static final C0215a f12939k = new C0215a((g) null);

    /* renamed from: l  reason: collision with root package name */
    private static MethodChannel.Result f12940l;

    /* renamed from: m  reason: collision with root package name */
    private static y8.a<q> f12941m;

    /* renamed from: h  reason: collision with root package name */
    private final int f12942h = 1001;

    /* renamed from: i  reason: collision with root package name */
    private MethodChannel f12943i;

    /* renamed from: j  reason: collision with root package name */
    private ActivityPluginBinding f12944j;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    /* compiled from: SignInWithApplePlugin.kt */
    public static final class C0215a {
        private C0215a() {
        }

        public /* synthetic */ C0215a(g gVar) {
            this();
        }
    }

    /* compiled from: SignInWithApplePlugin.kt */
    static final class b extends n implements y8.a<q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Activity f12945h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity) {
            super(0);
            this.f12945h = activity;
        }

        public final void invoke() {
            Intent launchIntentForPackage = this.f12945h.getPackageManager().getLaunchIntentForPackage(this.f12945h.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage((String) null);
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
            }
            this.f12945h.startActivity(launchIntentForPackage);
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != this.f12942h || (result = f12940l) == null) {
            return false;
        }
        result.error("authorization-error/canceled", "The user closed the Custom Tab", (Object) null);
        f12940l = null;
        f12941m = null;
        return false;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        this.f12944j = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f12943i = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f12944j;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f12944j = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f12943i;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f12943i = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        String str = methodCall.method;
        if (m.a(str, "isAvailable")) {
            result.success(Boolean.TRUE);
        } else if (m.a(str, "performAuthorizationRequest")) {
            ActivityPluginBinding activityPluginBinding = this.f12944j;
            Activity activity = activityPluginBinding != null ? activityPluginBinding.getActivity() : null;
            if (activity == null) {
                result.error("MISSING_ACTIVITY", "Plugin is not attached to an activity", methodCall.arguments);
                return;
            }
            String str2 = (String) methodCall.argument("url");
            if (str2 == null) {
                result.error("MISSING_ARG", "Missing 'url' argument", methodCall.arguments);
                return;
            }
            MethodChannel.Result result2 = f12940l;
            if (result2 != null) {
                result2.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", (Object) null);
            }
            y8.a<q> aVar = f12941m;
            if (aVar != null) {
                m.c(aVar);
                aVar.invoke();
            }
            f12940l = result;
            f12941m = new b(activity);
            d b10 = new d.b().b();
            m.e(b10, "builder.build()");
            b10.f1357a.setData(Uri.parse(str2));
            activity.startActivityForResult(b10.f1357a, this.f12942h, b10.f1358b);
        } else {
            result.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
