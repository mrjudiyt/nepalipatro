package z3;

import a4.d;
import java.util.concurrent.Executor;
import n8.a;
import u3.b;

/* compiled from: WorkInitializer_Factory */
public final class x implements b<w> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f13182a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f13183b;

    /* renamed from: c  reason: collision with root package name */
    private final a<y> f13184c;

    /* renamed from: d  reason: collision with root package name */
    private final a<b4.a> f13185d;

    public x(a<Executor> aVar, a<d> aVar2, a<y> aVar3, a<b4.a> aVar4) {
        this.f13182a = aVar;
        this.f13183b = aVar2;
        this.f13184c = aVar3;
        this.f13185d = aVar4;
    }

    public static x a(a<Executor> aVar, a<d> aVar2, a<y> aVar3, a<b4.a> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, d dVar, y yVar, b4.a aVar) {
        return new w(executor, dVar, yVar, aVar);
    }

    /* renamed from: b */
    public w get() {
        return c(this.f13182a.get(), this.f13183b.get(), this.f13184c.get(), this.f13185d.get());
    }
}
