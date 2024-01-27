package i9;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;
import r8.g;

/* compiled from: Builders.kt */
final class e<T> extends a<T> {

    /* renamed from: k  reason: collision with root package name */
    private final Thread f14927k;

    /* renamed from: l  reason: collision with root package name */
    private final e1 f14928l;

    public e(g gVar, Thread thread, e1 e1Var) {
        super(gVar, true, true);
        this.f14927k = thread;
        this.f14928l = e1Var;
    }

    public final T T0() {
        c.a();
        try {
            e1 e1Var = this.f14928l;
            z zVar = null;
            if (e1Var != null) {
                e1.T0(e1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                e1 e1Var2 = this.f14928l;
                long W0 = e1Var2 != null ? e1Var2.W0() : Long.MAX_VALUE;
                if (!d0()) {
                    c.a();
                    LockSupport.parkNanos(this, W0);
                } else {
                    e1 e1Var3 = this.f14928l;
                    if (e1Var3 != null) {
                        e1.O0(e1Var3, false, 1, (Object) null);
                    }
                    c.a();
                    T h10 = b2.h(X());
                    if (h10 instanceof z) {
                        zVar = (z) h10;
                    }
                    if (zVar == null) {
                        return h10;
                    }
                    throw zVar.f15006a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            A(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean e0() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        if (!m.a(Thread.currentThread(), this.f14927k)) {
            Thread thread = this.f14927k;
            c.a();
            LockSupport.unpark(thread);
        }
    }
}
