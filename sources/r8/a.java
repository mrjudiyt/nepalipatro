package r8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.m;
import r8.g;
import y8.p;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements g.b {

    /* renamed from: h  reason: collision with root package name */
    private final g.c<?> f16397h;

    public a(g.c<?> cVar) {
        m.f(cVar, Constants.KEY);
        this.f16397h = cVar;
    }

    public g W(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g Y(g gVar) {
        return g.b.a.d(this, gVar);
    }

    public g.c<?> getKey() {
        return this.f16397h;
    }

    public <E extends g.b> E h(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public <R> R w(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r10, pVar);
    }
}
