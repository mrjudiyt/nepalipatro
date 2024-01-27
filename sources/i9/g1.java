package i9;

import i9.f1;
import java.util.concurrent.locks.LockSupport;

/* compiled from: EventLoop.kt */
public abstract class g1 extends e1 {
    /* access modifiers changed from: protected */
    public abstract Thread Z0();

    /* access modifiers changed from: protected */
    public void a1(long j10, f1.a aVar) {
        r0.f14983p.l1(j10, aVar);
    }

    /* access modifiers changed from: protected */
    public final void b1() {
        Thread Z0 = Z0();
        if (Thread.currentThread() != Z0) {
            c.a();
            LockSupport.unpark(Z0);
        }
    }
}
