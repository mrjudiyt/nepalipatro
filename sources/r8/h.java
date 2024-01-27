package r8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import r8.g;
import y8.p;

/* compiled from: CoroutineContextImpl.kt */
public final class h implements g, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final h f16410h = new h();

    private h() {
    }

    private final Object readResolve() {
        return f16410h;
    }

    public g W(g.c<?> cVar) {
        m.f(cVar, Constants.KEY);
        return this;
    }

    public g Y(g gVar) {
        m.f(gVar, "context");
        return gVar;
    }

    public <E extends g.b> E h(g.c<E> cVar) {
        m.f(cVar, Constants.KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    public <R> R w(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        m.f(pVar, "operation");
        return r10;
    }
}
