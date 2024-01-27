package r8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;
import r8.g;
import r8.g.b;
import y8.l;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: h  reason: collision with root package name */
    private final l<g.b, E> f16398h;

    /* renamed from: i  reason: collision with root package name */
    private final g.c<?> f16399i;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        m.f(cVar, "baseKey");
        m.f(lVar, "safeCast");
        this.f16398h = lVar;
        this.f16399i = cVar instanceof b ? ((b) cVar).f16399i : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        m.f(cVar, Constants.KEY);
        return cVar == this || this.f16399i == cVar;
    }

    public final E b(g.b bVar) {
        m.f(bVar, "element");
        return (g.b) this.f16398h.invoke(bVar);
    }
}
