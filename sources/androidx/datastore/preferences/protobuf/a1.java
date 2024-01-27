package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf */
final class a1 {

    /* renamed from: c  reason: collision with root package name */
    private static final a1 f2708c = new a1();

    /* renamed from: a  reason: collision with root package name */
    private final f1 f2709a = new h0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, e1<?>> f2710b = new ConcurrentHashMap();

    private a1() {
    }

    public static a1 a() {
        return f2708c;
    }

    public <T> void b(T t10, d1 d1Var, o oVar) {
        e(t10).b(t10, d1Var, oVar);
    }

    public e1<?> c(Class<?> cls, e1<?> e1Var) {
        z.b(cls, "messageType");
        z.b(e1Var, "schema");
        return this.f2710b.putIfAbsent(cls, e1Var);
    }

    public <T> e1<T> d(Class<T> cls) {
        z.b(cls, "messageType");
        e1<T> e1Var = (e1) this.f2710b.get(cls);
        if (e1Var != null) {
            return e1Var;
        }
        e1<T> a10 = this.f2709a.a(cls);
        e1<?> c10 = c(cls, a10);
        return c10 != null ? c10 : a10;
    }

    public <T> e1<T> e(T t10) {
        return d(t10.getClass());
    }
}
