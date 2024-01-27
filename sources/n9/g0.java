package n9;

import com.facebook.internal.NativeProtocol;
import i9.h2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n9.g0;
import r8.g;

/* compiled from: ConcurrentLinkedList.kt */
public abstract class g0<S extends g0<S>> extends f<S> implements h2 {

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15802k = AtomicIntegerFieldUpdater.newUpdater(g0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: j  reason: collision with root package name */
    public final long f15803j;

    public g0(long j10, S s10, int i10) {
        super(s10);
        this.f15803j = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public boolean h() {
        return f15802k.get(this) == n() && !i();
    }

    public final boolean m() {
        return f15802k.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, g gVar);

    public final void p() {
        if (f15802k.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15802k;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i10));
        return true;
    }
}
