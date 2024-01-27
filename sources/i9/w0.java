package i9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n9.f0;
import n9.l;
import r8.d;
import r8.g;

/* compiled from: Builders.common.kt */
public final class w0<T> extends f0<T> {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14997l = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision");
    private volatile int _decision;

    public w0(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14997l;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f14997l.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14997l;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f14997l.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        if (!U0()) {
            l.c(c.b(this.f15800k), c0.a(obj, this.f15800k), (y8.l) null, 2, (Object) null);
        }
    }

    public final Object T0() {
        if (V0()) {
            return d.c();
        }
        Object h10 = b2.h(X());
        if (!(h10 instanceof z)) {
            return h10;
        }
        throw ((z) h10).f15006a;
    }

    /* access modifiers changed from: protected */
    public void x(Object obj) {
        P0(obj);
    }
}
