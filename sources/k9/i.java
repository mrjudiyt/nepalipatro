package k9;

import i9.s2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.m;
import n9.b0;
import n9.g0;
import o8.q;
import r8.g;
import y8.l;

/* compiled from: BufferedChannel.kt */
public final class i<E> extends g0<i<E>> {

    /* renamed from: l  reason: collision with root package name */
    private final b<E> f15532l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicReferenceArray f15533m = new AtomicReferenceArray(c.f15505b * 2);

    public i(long j10, i<E> iVar, b<E> bVar, int i10) {
        super(j10, iVar, i10);
        this.f15532l = bVar;
    }

    private final void z(int i10, Object obj) {
        this.f15533m.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f15533m.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    public int n() {
        return c.f15505b;
    }

    public void o(int i10, Throwable th, g gVar) {
        l<E, q> lVar;
        l<E, q> lVar2;
        int i11 = c.f15505b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object v10 = v(i10);
        while (true) {
            Object w10 = w(i10);
            if ((w10 instanceof s2) || (w10 instanceof t)) {
                if (r(i10, w10, z10 ? c.f15513j : c.f15514k)) {
                    s(i10);
                    x(i10, !z10);
                    if (z10 && (lVar = u().f15493i) != null) {
                        b0.b(lVar, v10, gVar);
                        return;
                    }
                    return;
                }
            } else if (w10 == c.f15513j || w10 == c.f15514k) {
                s(i10);
            } else if (!(w10 == c.f15510g || w10 == c.f15509f)) {
                if (w10 != c.f15512i && w10 != c.f15507d && w10 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + w10).toString());
                }
                return;
            }
        }
        s(i10);
        if (z10 && (lVar2 = u().f15493i) != null) {
            b0.b(lVar2, v10, gVar);
        }
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return this.f15533m.compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, (Object) null);
    }

    public final Object t(int i10, Object obj) {
        return this.f15533m.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f15532l;
        m.c(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return this.f15533m.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f15533m.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().G0((this.f15803j * ((long) c.f15505b)) + ((long) i10));
        }
        p();
    }

    public final E y(int i10) {
        E v10 = v(i10);
        s(i10);
        return v10;
    }
}
