package n9;

import i9.g0;
import i9.i0;
import i9.s0;
import i9.v0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r8.g;
import r8.h;

/* compiled from: LimitedDispatcher.kt */
public final class q extends g0 implements v0 {

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15836o = AtomicIntegerFieldUpdater.newUpdater(q.class, "runningWorkers");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g0 f15837j;

    /* renamed from: k  reason: collision with root package name */
    private final int f15838k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ v0 f15839l;

    /* renamed from: m  reason: collision with root package name */
    private final v<Runnable> f15840m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f15841n;
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    private final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private Runnable f15842h;

        public a(Runnable runnable) {
            this.f15842h = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f15842h.run();
                } catch (Throwable th) {
                    i0.a(h.f16410h, th);
                }
                Runnable O0 = q.this.P0();
                if (O0 != null) {
                    this.f15842h = O0;
                    i10++;
                    if (i10 >= 16 && q.this.f15837j.L0(q.this)) {
                        q.this.f15837j.K0(q.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public q(g0 g0Var, int i10) {
        this.f15837j = g0Var;
        this.f15838k = i10;
        v0 v0Var = g0Var instanceof v0 ? (v0) g0Var : null;
        this.f15839l = v0Var == null ? s0.a() : v0Var;
        this.f15840m = new v<>(false);
        this.f15841n = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable P0() {
        while (true) {
            Runnable d10 = this.f15840m.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f15841n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15836o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f15840m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean Q0() {
        synchronized (this.f15841n) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15836o;
            if (atomicIntegerFieldUpdater.get(this) >= this.f15838k) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public void K0(g gVar, Runnable runnable) {
        Runnable P0;
        this.f15840m.a(runnable);
        if (f15836o.get(this) < this.f15838k && Q0() && (P0 = P0()) != null) {
            this.f15837j.K0(this, new a(P0));
        }
    }
}
