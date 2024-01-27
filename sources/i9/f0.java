package i9;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;
import r8.d;
import r8.e;
import r8.g;
import r8.h;
import y8.p;

/* compiled from: CoroutineContext.kt */
public final class f0 {

    /* compiled from: CoroutineContext.kt */
    static final class a extends n implements p<g, g.b, g> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f14933h = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            if (bVar instanceof d0) {
                return gVar.Y(((d0) bVar).g0());
            }
            return gVar.Y(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    static final class b extends n implements p<g, g.b, g> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ y<g> f14934h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f14935i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(y<g> yVar, boolean z10) {
            super(2);
            this.f14934h = yVar;
            this.f14935i = z10;
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            if (!(bVar instanceof d0)) {
                return gVar.Y(bVar);
            }
            g.b h10 = ((g) this.f14934h.f15575h).h(bVar.getKey());
            if (h10 == null) {
                d0 d0Var = (d0) bVar;
                if (this.f14935i) {
                    d0Var = d0Var.g0();
                }
                return gVar.Y(d0Var);
            }
            y<g> yVar = this.f14934h;
            yVar.f15575h = ((g) yVar.f15575h).W(bVar.getKey());
            return gVar.Y(((d0) bVar).h0(h10));
        }
    }

    /* compiled from: CoroutineContext.kt */
    static final class c extends n implements p<Boolean, g.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f14936h = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof d0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final g a(g gVar, g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.Y(gVar2);
        }
        y yVar = new y();
        yVar.f15575h = gVar2;
        h hVar = h.f16410h;
        g gVar3 = (g) gVar.w(hVar, new b(yVar, z10));
        if (c11) {
            yVar.f15575h = ((g) yVar.f15575h).w(hVar, a.f14933h);
        }
        return gVar3.Y((g) yVar.f15575h);
    }

    public static final String b(g gVar) {
        j0 j0Var;
        String str;
        if (!p0.c() || (j0Var = (j0) gVar.h(j0.f14950j)) == null) {
            return null;
        }
        k0 k0Var = (k0) gVar.h(k0.f14953j);
        if (k0Var == null || (str = k0Var.K0()) == null) {
            str = "coroutine";
        }
        return str + '#' + j0Var.K0();
    }

    private static final boolean c(g gVar) {
        return ((Boolean) gVar.w(Boolean.FALSE, c.f14936h)).booleanValue();
    }

    public static final g d(l0 l0Var, g gVar) {
        g a10 = a(l0Var.i(), gVar, true);
        g Y = p0.c() ? a10.Y(new j0(p0.b().incrementAndGet())) : a10;
        return (a10 == a1.a() || a10.h(e.f16407g) != null) ? Y : Y.Y(a1.a());
    }

    public static final g e(g gVar, g gVar2) {
        if (!c(gVar2)) {
            return gVar.Y(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final q2<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof w0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof q2) {
                return (q2) eVar;
            }
        }
        return null;
    }

    public static final q2<?> g(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.h(r2.f14986h) != null)) {
            return null;
        }
        q2<?> f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f10 != null) {
            f10.U0(gVar, obj);
        }
        return f10;
    }
}
