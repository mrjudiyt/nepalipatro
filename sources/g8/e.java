package g8;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallState;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import o8.k;
import o8.o;
import o8.q;
import y8.l;

/* compiled from: InAppUpdatePlugin.kt */
public final class e implements FlutterPlugin, MethodChannel.MethodCallHandler, PluginRegistry.ActivityResultListener, Application.ActivityLifecycleCallbacks, ActivityAware {

    /* renamed from: n  reason: collision with root package name */
    public static final a f14739n = new a((kotlin.jvm.internal.g) null);

    /* renamed from: h  reason: collision with root package name */
    private MethodChannel f14740h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a f14741i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public MethodChannel.Result f14742j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Integer f14743k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public e6.a f14744l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public e6.b f14745m;

    /* compiled from: InAppUpdatePlugin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    static final class b extends n implements l<e6.a, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f14746h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f14747i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, MethodChannel.Result result) {
            super(1);
            this.f14746h = eVar;
            this.f14747i = result;
        }

        public final void a(e6.a aVar) {
            this.f14746h.f14744l = aVar;
            MethodChannel.Result result = this.f14747i;
            k[] kVarArr = new k[10];
            kVarArr[0] = o.a("updateAvailability", Integer.valueOf(aVar.h()));
            kVarArr[1] = o.a("immediateAllowed", Boolean.valueOf(aVar.e(1)));
            Set<Integer> c10 = aVar.c(e6.d.c(1));
            m.e(c10, "info.getFailedUpdatePrec…AppUpdateType.IMMEDIATE))");
            ArrayList arrayList = new ArrayList(q.l(c10, 10));
            for (Integer intValue : c10) {
                arrayList.add(Integer.valueOf(intValue.intValue()));
            }
            kVarArr[2] = o.a("immediateAllowedPreconditions", x.R(arrayList));
            kVarArr[3] = o.a("flexibleAllowed", Boolean.valueOf(aVar.e(0)));
            Set<Integer> c11 = aVar.c(e6.d.c(0));
            m.e(c11, "info.getFailedUpdatePrec…(AppUpdateType.FLEXIBLE))");
            ArrayList arrayList2 = new ArrayList(q.l(c11, 10));
            for (Integer intValue2 : c11) {
                arrayList2.add(Integer.valueOf(intValue2.intValue()));
            }
            kVarArr[4] = o.a("flexibleAllowedPreconditions", x.R(arrayList2));
            kVarArr[5] = o.a("availableVersionCode", Integer.valueOf(aVar.a()));
            kVarArr[6] = o.a("installStatus", Integer.valueOf(aVar.d()));
            kVarArr[7] = o.a(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, aVar.g());
            kVarArr[8] = o.a("clientVersionStalenessDays", aVar.b());
            kVarArr[9] = o.a("updatePriority", Integer.valueOf(aVar.i()));
            result.success(h0.f(kVarArr));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e6.a) obj);
            return q.f16189a;
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    static final class c extends n implements y8.a<q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f14748h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.f14748h = eVar;
        }

        public final void invoke() {
            e6.b f10 = this.f14748h.f14745m;
            if (f10 != null) {
                f10.b();
            }
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    static final class d extends n implements l<e6.a, q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f14749h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Activity f14750i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, Activity activity) {
            super(1);
            this.f14749h = eVar;
            this.f14750i = activity;
        }

        public final void a(e6.a aVar) {
            Integer g10;
            if (aVar.h() == 3 && (g10 = this.f14749h.f14743k) != null && g10.intValue() == 1) {
                try {
                    e6.b f10 = this.f14749h.f14745m;
                    if (f10 != null) {
                        f10.d(aVar, 1, this.f14750i, 1276);
                    }
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((e6.a) obj);
            return q.f16189a;
        }
    }

    /* renamed from: g8.e$e  reason: collision with other inner class name */
    /* compiled from: InAppUpdatePlugin.kt */
    public static final class C0250e implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityPluginBinding f14751a;

        C0250e(ActivityPluginBinding activityPluginBinding) {
            this.f14751a = activityPluginBinding;
        }

        public Activity activity() {
            Activity activity = this.f14751a.getActivity();
            m.e(activity, "activityPluginBinding.activity");
            return activity;
        }

        public void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            m.f(activityResultListener, "callback");
            this.f14751a.addActivityResultListener(activityResultListener);
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    public static final class f implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityPluginBinding f14752a;

        f(ActivityPluginBinding activityPluginBinding) {
            this.f14752a = activityPluginBinding;
        }

        public Activity activity() {
            Activity activity = this.f14752a.getActivity();
            m.e(activity, "activityPluginBinding.activity");
            return activity;
        }

        public void addActivityResultListener(PluginRegistry.ActivityResultListener activityResultListener) {
            m.f(activityResultListener, "callback");
            this.f14752a.addActivityResultListener(activityResultListener);
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    static final class g extends n implements y8.a<q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f14753h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f14754i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, MethodChannel.Result result) {
            super(0);
            this.f14753h = eVar;
            this.f14754i = result;
        }

        public final void invoke() {
            this.f14753h.f14743k = 1;
            this.f14753h.f14742j = this.f14754i;
            e6.b f10 = this.f14753h.f14745m;
            if (f10 != null) {
                e6.a e10 = this.f14753h.f14744l;
                m.c(e10);
                a d10 = this.f14753h.f14741i;
                m.c(d10);
                f10.a(e10, d10.activity(), e6.d.c(1), 1276);
            }
        }
    }

    /* compiled from: InAppUpdatePlugin.kt */
    static final class h extends n implements y8.a<q> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f14755h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ MethodChannel.Result f14756i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar, MethodChannel.Result result) {
            super(0);
            this.f14755h = eVar;
            this.f14756i = result;
        }

        /* access modifiers changed from: private */
        public static final void c(e eVar, InstallState installState) {
            m.f(eVar, "this$0");
            m.f(installState, "state");
            if (installState.c() == 11) {
                MethodChannel.Result h10 = eVar.f14742j;
                if (h10 != null) {
                    h10.success((Object) null);
                }
                eVar.f14742j = null;
            } else if (installState.b() != 0) {
                MethodChannel.Result h11 = eVar.f14742j;
                if (h11 != null) {
                    h11.error("Error during installation", String.valueOf(installState.b()), (Object) null);
                }
                eVar.f14742j = null;
            }
        }

        public final void invoke() {
            this.f14755h.f14743k = 0;
            this.f14755h.f14742j = this.f14756i;
            e6.b f10 = this.f14755h.f14745m;
            if (f10 != null) {
                e6.a e10 = this.f14755h.f14744l;
                m.c(e10);
                a d10 = this.f14755h.f14741i;
                m.c(d10);
                f10.a(e10, d10.activity(), e6.d.c(0), 1276);
            }
            e6.b f11 = this.f14755h.f14745m;
            if (f11 != null) {
                f11.e(new f(this.f14755h));
            }
        }
    }

    private final void l(MethodChannel.Result result, y8.a<q> aVar) {
        if (this.f14744l != null) {
            a aVar2 = this.f14741i;
            if ((aVar2 != null ? aVar2.activity() : null) == null) {
                result.error("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", (Object) null);
                throw new IllegalArgumentException(q.f16189a.toString());
            } else if (this.f14745m != null) {
                aVar.invoke();
            } else {
                result.error("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", (Object) null);
                throw new IllegalArgumentException(q.f16189a.toString());
            }
        } else {
            result.error("REQUIRE_CHECK_FOR_UPDATE", "Call checkForUpdate first!", (Object) null);
            throw new IllegalArgumentException(q.f16189a.toString());
        }
    }

    private final void m(MethodChannel.Result result) {
        Activity activity;
        Application application;
        a aVar = this.f14741i;
        if ((aVar != null ? aVar.activity() : null) != null) {
            a aVar2 = this.f14741i;
            if (aVar2 != null) {
                aVar2.addActivityResultListener(this);
            }
            a aVar3 = this.f14741i;
            if (!(aVar3 == null || (activity = aVar3.activity()) == null || (application = activity.getApplication()) == null)) {
                application.registerActivityLifecycleCallbacks(this);
            }
            a aVar4 = this.f14741i;
            m.c(aVar4);
            e6.b a10 = e6.c.a(aVar4.activity());
            this.f14745m = a10;
            m.c(a10);
            Task<e6.a> c10 = a10.c();
            m.e(c10, "appUpdateManager!!.appUpdateInfo");
            c10.addOnSuccessListener(new c(new b(this, result)));
            c10.addOnFailureListener(new b(result));
            return;
        }
        result.error("REQUIRE_FOREGROUND_ACTIVITY", "in_app_update requires a foreground activity", (Object) null);
        throw new IllegalArgumentException(q.f16189a.toString());
    }

    /* access modifiers changed from: private */
    public static final void n(l lVar, Object obj) {
        m.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void o(MethodChannel.Result result, Exception exc) {
        m.f(result, "$result");
        m.f(exc, "it");
        result.error("TASK_FAILURE", exc.getMessage(), (Object) null);
    }

    private final void p(MethodChannel.Result result) {
        l(result, new c(this));
    }

    /* access modifiers changed from: private */
    public static final void q(l lVar, Object obj) {
        m.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void r(MethodChannel.Result result) {
        l(result, new g(this, result));
    }

    private final void s(MethodChannel.Result result) {
        l(result, new h(this, result));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != 1276) {
            return false;
        }
        Integer num = this.f14743k;
        if (num != null && num.intValue() == 1) {
            if (i11 == -1) {
                MethodChannel.Result result2 = this.f14742j;
                if (result2 != null) {
                    result2.success((Object) null);
                }
            } else if (i11 == 0) {
                MethodChannel.Result result3 = this.f14742j;
                if (result3 != null) {
                    result3.error("USER_DENIED_UPDATE", String.valueOf(i11), (Object) null);
                }
            } else if (i11 == 1 && (result = this.f14742j) != null) {
                result.error("IN_APP_UPDATE_FAILED", "Some other error prevented either the user from providing consent or the update to proceed.", (Object) null);
            }
            this.f14742j = null;
            return true;
        }
        Integer num2 = this.f14743k;
        if (num2 == null || num2.intValue() != 0) {
            return false;
        }
        if (i11 == 0) {
            MethodChannel.Result result4 = this.f14742j;
            if (result4 != null) {
                result4.error("USER_DENIED_UPDATE", String.valueOf(i11), (Object) null);
            }
            this.f14742j = null;
        } else if (i11 == 1) {
            MethodChannel.Result result5 = this.f14742j;
            if (result5 != null) {
                result5.error("IN_APP_UPDATE_FAILED", String.valueOf(i11), (Object) null);
            }
            this.f14742j = null;
        }
        return true;
    }

    public void onActivityResumed(Activity activity) {
        Task<e6.a> c10;
        m.f(activity, "activity");
        e6.b bVar = this.f14745m;
        if (bVar != null && (c10 = bVar.c()) != null) {
            c10.addOnSuccessListener(new d(new d(this, activity)));
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
        m.f(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "activityPluginBinding");
        this.f14741i = new C0250e(activityPluginBinding);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "in_app_update");
        this.f14740h = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromActivity() {
        this.f14741i = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f14741i = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m.f(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f14740h;
        if (methodChannel == null) {
            m.x("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        m.f(methodCall, "call");
        m.f(result, "result");
        String str = methodCall.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1873373639:
                    if (str.equals("performImmediateUpdate")) {
                        r(result);
                        return;
                    }
                    break;
                case -1541164682:
                    if (str.equals("startFlexibleUpdate")) {
                        s(result);
                        return;
                    }
                    break;
                case -1317168438:
                    if (str.equals("checkForUpdate")) {
                        m(result);
                        return;
                    }
                    break;
                case -193504755:
                    if (str.equals("completeFlexibleUpdate")) {
                        p(result);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m.f(activityPluginBinding, "activityPluginBinding");
        this.f14741i = new f(activityPluginBinding);
    }
}
