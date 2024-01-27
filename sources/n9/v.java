package n9;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class v<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15857a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_cur");
    private volatile Object _cur;

    public v(boolean z10) {
        this._cur = new w(8, z10);
    }

    public final boolean a(E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15857a;
        while (true) {
            w wVar = (w) atomicReferenceFieldUpdater.get(this);
            int a10 = wVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                b.a(f15857a, this, wVar, wVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15857a;
        while (true) {
            w wVar = (w) atomicReferenceFieldUpdater.get(this);
            if (!wVar.d()) {
                b.a(f15857a, this, wVar, wVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((w) f15857a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15857a;
        while (true) {
            w wVar = (w) atomicReferenceFieldUpdater.get(this);
            E j10 = wVar.j();
            if (j10 != w.f15861h) {
                return j10;
            }
            b.a(f15857a, this, wVar, wVar.i());
        }
    }
}
