package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.h;
import kotlin.jvm.internal.m;

/* compiled from: ServiceLifecycleDispatcher.kt */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f3472a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3473b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    private a f3474c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private final n f3475h;

        /* renamed from: i  reason: collision with root package name */
        private final h.a f3476i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3477j;

        public a(n nVar, h.a aVar) {
            m.f(nVar, "registry");
            m.f(aVar, "event");
            this.f3475h = nVar;
            this.f3476i = aVar;
        }

        public void run() {
            if (!this.f3477j) {
                this.f3475h.h(this.f3476i);
                this.f3477j = true;
            }
        }
    }

    public f0(m mVar) {
        m.f(mVar, "provider");
        this.f3472a = new n(mVar);
    }

    private final void f(h.a aVar) {
        a aVar2 = this.f3474c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f3472a, aVar);
        this.f3474c = aVar3;
        Handler handler = this.f3473b;
        m.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public h a() {
        return this.f3472a;
    }

    public void b() {
        f(h.a.ON_START);
    }

    public void c() {
        f(h.a.ON_CREATE);
    }

    public void d() {
        f(h.a.ON_STOP);
        f(h.a.ON_DESTROY);
    }

    public void e() {
        f(h.a.ON_START);
    }
}
