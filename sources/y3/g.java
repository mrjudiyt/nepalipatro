package y3;

import n8.a;
import u3.b;
import u3.d;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class g implements b<z3.g> {

    /* renamed from: a  reason: collision with root package name */
    private final a<c4.a> f12959a;

    public g(a<c4.a> aVar) {
        this.f12959a = aVar;
    }

    public static z3.g a(c4.a aVar) {
        return (z3.g) d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(a<c4.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: c */
    public z3.g get() {
        return a(this.f12959a.get());
    }
}
