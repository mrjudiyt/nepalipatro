package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.q1;
import androidx.datastore.preferences.protobuf.t;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema */
final class t0<T> implements e1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f2951a;

    /* renamed from: b  reason: collision with root package name */
    private final k1<?, ?> f2952b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2953c;

    /* renamed from: d  reason: collision with root package name */
    private final p<?> f2954d;

    private t0(k1<?, ?> k1Var, p<?> pVar, p0 p0Var) {
        this.f2952b = k1Var;
        this.f2953c = pVar.e(p0Var);
        this.f2954d = pVar;
        this.f2951a = p0Var;
    }

    private <UT, UB> int j(k1<UT, UB> k1Var, T t10) {
        return k1Var.i(k1Var.g(t10));
    }

    private <UT, UB, ET extends t.b<ET>> void k(k1<UT, UB> k1Var, p<ET> pVar, T t10, d1 d1Var, o oVar) {
        UB f10 = k1Var.f(t10);
        t<ET> d10 = pVar.d(t10);
        do {
            try {
                if (d1Var.A() == Integer.MAX_VALUE) {
                    k1Var.o(t10, f10);
                    return;
                }
            } finally {
                k1Var.o(t10, f10);
            }
        } while (m(d1Var, oVar, pVar, d10, k1Var, f10));
    }

    static <T> t0<T> l(k1<?, ?> k1Var, p<?> pVar, p0 p0Var) {
        return new t0<>(k1Var, pVar, p0Var);
    }

    private <UT, UB, ET extends t.b<ET>> boolean m(d1 d1Var, o oVar, p<ET> pVar, t<ET> tVar, k1<UT, UB> k1Var, UB ub) {
        int a10 = d1Var.a();
        if (a10 == q1.f2887a) {
            int i10 = 0;
            Object obj = null;
            h hVar = null;
            while (d1Var.A() != Integer.MAX_VALUE) {
                int a11 = d1Var.a();
                if (a11 == q1.f2889c) {
                    i10 = d1Var.o();
                    obj = pVar.b(oVar, this.f2951a, i10);
                } else if (a11 == q1.f2890d) {
                    if (obj != null) {
                        pVar.h(d1Var, obj, oVar, tVar);
                    } else {
                        hVar = d1Var.D();
                    }
                } else if (!d1Var.H()) {
                    break;
                }
            }
            if (d1Var.a() == q1.f2888b) {
                if (hVar != null) {
                    if (obj != null) {
                        pVar.i(hVar, obj, oVar, tVar);
                    } else {
                        k1Var.d(ub, i10, hVar);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.a();
        } else if (q1.b(a10) != 2) {
            return d1Var.H();
        } else {
            Object b10 = pVar.b(oVar, this.f2951a, q1.a(a10));
            if (b10 == null) {
                return k1Var.m(ub, d1Var);
            }
            pVar.h(d1Var, b10, oVar, tVar);
            return true;
        }
    }

    private <UT, UB> void n(k1<UT, UB> k1Var, T t10, r1 r1Var) {
        k1Var.s(k1Var.g(t10), r1Var);
    }

    public void a(T t10, T t11) {
        g1.G(this.f2952b, t10, t11);
        if (this.f2953c) {
            g1.E(this.f2954d, t10, t11);
        }
    }

    public void b(T t10, d1 d1Var, o oVar) {
        k(this.f2952b, this.f2954d, t10, d1Var, oVar);
    }

    public void c(T t10) {
        this.f2952b.j(t10);
        this.f2954d.f(t10);
    }

    public final boolean d(T t10) {
        return this.f2954d.c(t10).p();
    }

    public void e(T t10, r1 r1Var) {
        Iterator<Map.Entry<?, Object>> s10 = this.f2954d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry next = s10.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.h() != q1.c.MESSAGE || bVar.b() || bVar.i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof b0.b) {
                r1Var.c(bVar.getNumber(), ((b0.b) next).a().e());
            } else {
                r1Var.c(bVar.getNumber(), next.getValue());
            }
        }
        n(this.f2952b, t10, r1Var);
    }

    public boolean f(T t10, T t11) {
        if (!this.f2952b.g(t10).equals(this.f2952b.g(t11))) {
            return false;
        }
        if (this.f2953c) {
            return this.f2954d.c(t10).equals(this.f2954d.c(t11));
        }
        return true;
    }

    public int g(T t10) {
        int j10 = j(this.f2952b, t10) + 0;
        return this.f2953c ? j10 + this.f2954d.c(t10).j() : j10;
    }

    public T h() {
        return this.f2951a.f().j();
    }

    public int i(T t10) {
        int hashCode = this.f2952b.g(t10).hashCode();
        return this.f2953c ? (hashCode * 53) + this.f2954d.c(t10).hashCode() : hashCode;
    }
}
