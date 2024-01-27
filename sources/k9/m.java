package k9;

import i9.s2;
import k9.h;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.internal.UndeliveredElementException;
import n9.b0;
import n9.j0;
import o8.q;
import r8.d;
import y8.l;

/* compiled from: ConflatedBufferedChannel.kt */
public class m<E> extends b<E> {

    /* renamed from: t  reason: collision with root package name */
    private final int f15538t;

    /* renamed from: u  reason: collision with root package name */
    private final a f15539u;

    public m(int i10, a aVar, l<? super E, q> lVar) {
        super(i10, lVar);
        this.f15538t = i10;
        this.f15539u = aVar;
        boolean z10 = false;
        if (aVar != a.SUSPEND) {
            if (!(i10 >= 1 ? true : z10)) {
                throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.b(b.class).a() + " instead").toString());
    }

    static /* synthetic */ <E> Object H0(m<E> mVar, E e10, d<? super q> dVar) {
        UndeliveredElementException d10;
        Object K0 = mVar.K0(e10, true);
        if (!(K0 instanceof h.a)) {
            return q.f16189a;
        }
        h.e(K0);
        l<E, q> lVar = mVar.f15493i;
        if (lVar == null || (d10 = b0.d(lVar, e10, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw mVar.N();
        }
        b.a(d10, mVar.N());
        throw d10;
    }

    private final Object I0(E e10, boolean z10) {
        l<E, q> lVar;
        UndeliveredElementException d10;
        Object n10 = super.n(e10);
        if (h.i(n10) || h.h(n10)) {
            return n10;
        }
        if (!z10 || (lVar = this.f15493i) == null || (d10 = b0.d(lVar, e10, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            return h.f15528b.c(q.f16189a);
        }
        throw d10;
    }

    private final Object J0(E e10) {
        i iVar;
        j0 j0Var = c.f15507d;
        i iVar2 = (i) b.f15487o.get(this);
        while (true) {
            long andIncrement = b.f15483k.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean p10 = X(andIncrement);
            int i10 = c.f15505b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (iVar2.f15803j != j11) {
                i d10 = I(j11, iVar2);
                if (d10 != null) {
                    iVar = d10;
                } else if (p10) {
                    return h.f15528b.a(N());
                }
            } else {
                iVar = iVar2;
            }
            int v10 = C0(iVar, i11, e10, j10, j0Var, p10);
            if (v10 == 0) {
                iVar.b();
                return h.f15528b.c(q.f16189a);
            } else if (v10 == 1) {
                return h.f15528b.c(q.f16189a);
            } else {
                if (v10 != 2) {
                    if (v10 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (v10 != 4) {
                        if (v10 == 5) {
                            iVar.b();
                        }
                        iVar2 = iVar;
                    } else {
                        if (j10 < M()) {
                            iVar.b();
                        }
                        return h.f15528b.a(N());
                    }
                } else if (p10) {
                    iVar.p();
                    return h.f15528b.a(N());
                } else {
                    s2 s2Var = j0Var instanceof s2 ? (s2) j0Var : null;
                    if (s2Var != null) {
                        m0(s2Var, iVar, i11);
                    }
                    E((iVar.f15803j * ((long) i10)) + ((long) i11));
                    return h.f15528b.c(q.f16189a);
                }
            }
        }
    }

    private final Object K0(E e10, boolean z10) {
        if (this.f15539u == a.DROP_LATEST) {
            return I0(e10, z10);
        }
        return J0(e10);
    }

    /* access modifiers changed from: protected */
    public boolean Y() {
        return this.f15539u == a.DROP_OLDEST;
    }

    public Object c(E e10, d<? super q> dVar) {
        return H0(this, e10, dVar);
    }

    public Object n(E e10) {
        return K0(e10, false);
    }
}
