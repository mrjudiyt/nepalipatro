package i9;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n9.k;
import n9.q;
import n9.r;
import r8.b;
import r8.d;
import r8.e;
import r8.g;
import y8.l;

/* compiled from: CoroutineDispatcher.kt */
public abstract class g0 extends r8.a implements e {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14943i = new a((g) null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<e, g0> {

        /* renamed from: i9.g0$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C0253a extends n implements l<g.b, g0> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0253a f14944h = new C0253a();

            C0253a() {
                super(1);
            }

            /* renamed from: a */
            public final g0 invoke(g.b bVar) {
                if (bVar instanceof g0) {
                    return (g0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.f16407g, C0253a.f14944h);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g0() {
        super(e.f16407g);
    }

    public final <T> d<T> E(d<? super T> dVar) {
        return new k(this, dVar);
    }

    public abstract void K0(r8.g gVar, Runnable runnable);

    public boolean L0(r8.g gVar) {
        return true;
    }

    public g0 M0(int i10) {
        r.a(i10);
        return new q(this, i10);
    }

    public r8.g W(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public <E extends g.b> E h(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public String toString() {
        return q0.a(this) + '@' + q0.b(this);
    }

    public final void u(d<?> dVar) {
        m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((k) dVar).r();
    }
}
