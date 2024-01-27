package r8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;
import r8.g;

/* compiled from: ContinuationInterceptor.kt */
public interface e extends g.b {

    /* renamed from: g  reason: collision with root package name */
    public static final b f16407g = b.f16408h;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            m.f(cVar, Constants.KEY);
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b10 = bVar.b(eVar);
                if (b10 instanceof g.b) {
                    return b10;
                }
                return null;
            } else if (e.f16407g != cVar) {
                return null;
            } else {
                m.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            m.f(cVar, Constants.KEY);
            if (!(cVar instanceof b)) {
                return e.f16407g == cVar ? h.f16410h : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f16410h;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class b implements g.c<e> {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ b f16408h = new b();

        private b() {
        }
    }

    <T> d<T> E(d<? super T> dVar);

    void u(d<?> dVar);
}
