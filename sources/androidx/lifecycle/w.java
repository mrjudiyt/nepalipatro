package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.x;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: ProcessLifecycleOwner.kt */
public final class w implements m {

    /* renamed from: p  reason: collision with root package name */
    public static final b f3524p = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final w f3525q = new w();

    /* renamed from: h  reason: collision with root package name */
    private int f3526h;

    /* renamed from: i  reason: collision with root package name */
    private int f3527i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3528j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3529k = true;

    /* renamed from: l  reason: collision with root package name */
    private Handler f3530l;

    /* renamed from: m  reason: collision with root package name */
    private final n f3531m = new n(this);

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f3532n = new v(this);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final x.a f3533o = new d(this);

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3534a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            m.f(activity, "activity");
            m.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final m a() {
            return w.f3525q;
        }

        public final void b(Context context) {
            m.f(context, "context");
            w.f3525q.h(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class c extends d {
        final /* synthetic */ w this$0;

        /* compiled from: ProcessLifecycleOwner.kt */
        public static final class a extends d {
            final /* synthetic */ w this$0;

            a(w wVar) {
                this.this$0 = wVar;
            }

            public void onActivityPostResumed(Activity activity) {
                m.f(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                m.f(activity, "activity");
                this.this$0.f();
            }
        }

        c(w wVar) {
            this.this$0 = wVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                x.f3536i.b(activity).f(this.this$0.f3533o);
            }
        }

        public void onActivityPaused(Activity activity) {
            m.f(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            m.f(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            m.f(activity, "activity");
            this.this$0.g();
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class d implements x.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f3535a;

        d(w wVar) {
            this.f3535a = wVar;
        }

        public void onCreate() {
        }

        public void onResume() {
            this.f3535a.e();
        }

        public void onStart() {
            this.f3535a.f();
        }
    }

    private w() {
    }

    /* access modifiers changed from: private */
    public static final void i(w wVar) {
        m.f(wVar, "this$0");
        wVar.j();
        wVar.k();
    }

    public static final m l() {
        return f3524p.a();
    }

    public final void d() {
        int i10 = this.f3527i - 1;
        this.f3527i = i10;
        if (i10 == 0) {
            Handler handler = this.f3530l;
            m.c(handler);
            handler.postDelayed(this.f3532n, 700);
        }
    }

    public final void e() {
        int i10 = this.f3527i + 1;
        this.f3527i = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f3528j) {
            this.f3531m.h(h.a.ON_RESUME);
            this.f3528j = false;
            return;
        }
        Handler handler = this.f3530l;
        m.c(handler);
        handler.removeCallbacks(this.f3532n);
    }

    public final void f() {
        int i10 = this.f3526h + 1;
        this.f3526h = i10;
        if (i10 == 1 && this.f3529k) {
            this.f3531m.h(h.a.ON_START);
            this.f3529k = false;
        }
    }

    public final void g() {
        this.f3526h--;
        k();
    }

    public h getLifecycle() {
        return this.f3531m;
    }

    public final void h(Context context) {
        m.f(context, "context");
        this.f3530l = new Handler();
        this.f3531m.h(h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f3527i == 0) {
            this.f3528j = true;
            this.f3531m.h(h.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f3526h == 0 && this.f3528j) {
            this.f3531m.h(h.a.ON_STOP);
            this.f3529k = true;
        }
    }
}
