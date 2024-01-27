package u6;

import r6.f;
import r6.j;
import r6.k;
import r6.p;
import r6.q;
import r6.s;
import r6.t;
import y6.c;

/* compiled from: TreeTypeAdapter */
public final class l<T> extends s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q<T> f16656a;

    /* renamed from: b  reason: collision with root package name */
    private final k<T> f16657b;

    /* renamed from: c  reason: collision with root package name */
    final f f16658c;

    /* renamed from: d  reason: collision with root package name */
    private final x6.a<T> f16659d;

    /* renamed from: e  reason: collision with root package name */
    private final t f16660e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f16661f = new b();

    /* renamed from: g  reason: collision with root package name */
    private s<T> f16662g;

    /* compiled from: TreeTypeAdapter */
    private final class b implements p, j {
        private b() {
        }
    }

    public l(q<T> qVar, k<T> kVar, f fVar, x6.a<T> aVar, t tVar) {
        this.f16656a = qVar;
        this.f16657b = kVar;
        this.f16658c = fVar;
        this.f16659d = aVar;
        this.f16660e = tVar;
    }

    private s<T> e() {
        s<T> sVar = this.f16662g;
        if (sVar != null) {
            return sVar;
        }
        s<T> m10 = this.f16658c.m(this.f16660e, this.f16659d);
        this.f16662g = m10;
        return m10;
    }

    public T b(y6.a aVar) {
        if (this.f16657b == null) {
            return e().b(aVar);
        }
        r6.l a10 = t6.l.a(aVar);
        if (a10.e()) {
            return null;
        }
        return this.f16657b.a(a10, this.f16659d.e(), this.f16661f);
    }

    public void d(c cVar, T t10) {
        q<T> qVar = this.f16656a;
        if (qVar == null) {
            e().d(cVar, t10);
        } else if (t10 == null) {
            cVar.g0();
        } else {
            t6.l.b(qVar.a(t10, this.f16659d.e(), this.f16661f), cVar);
        }
    }
}
