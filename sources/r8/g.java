package r8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import r8.e;
import y8.p;

/* compiled from: CoroutineContext.kt */
public interface g {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* renamed from: r8.g$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        static final class C0276a extends n implements p<g, b, g> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0276a f16409h = new C0276a();

            C0276a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                c cVar;
                m.f(gVar, "acc");
                m.f(bVar, "element");
                g W = gVar.W(bVar.getKey());
                h hVar = h.f16410h;
                if (W == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f16407g;
                e eVar = (e) W.h(bVar2);
                if (eVar == null) {
                    cVar = new c(W, bVar);
                } else {
                    g W2 = W.W(bVar2);
                    if (W2 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(W2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            m.f(gVar2, "context");
            return gVar2 == h.f16410h ? gVar : (g) gVar2.w(gVar, C0276a.f16409h);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                m.f(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                m.f(cVar, Constants.KEY);
                if (!m.a(bVar.getKey(), cVar)) {
                    return null;
                }
                m.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> cVar) {
                m.f(cVar, Constants.KEY);
                return m.a(bVar.getKey(), cVar) ? h.f16410h : bVar;
            }

            public static g d(b bVar, g gVar) {
                m.f(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        c<?> getKey();

        <E extends b> E h(c<E> cVar);
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    g W(c<?> cVar);

    g Y(g gVar);

    <E extends b> E h(c<E> cVar);

    <R> R w(R r10, p<? super R, ? super b, ? extends R> pVar);
}
