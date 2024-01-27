package g0;

import h0.b;
import i9.l0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import y8.a;

/* compiled from: DataStoreFactory.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f8696a = new f();

    private f() {
    }

    public final <T> e<T> a(j<T> jVar, b<T> bVar, List<? extends c<T>> list, l0 l0Var, a<? extends File> aVar) {
        m.f(jVar, "serializer");
        m.f(list, "migrations");
        m.f(l0Var, "scope");
        m.f(aVar, "produceFile");
        return new l(aVar, jVar, o.b(d.f8678a.b(list)), new h0.a(), l0Var);
    }
}
