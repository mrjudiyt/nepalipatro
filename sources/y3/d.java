package y3;

import java.util.concurrent.Executor;
import n8.a;
import t3.e;
import u3.b;
import z3.y;

/* compiled from: DefaultScheduler_Factory */
public final class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f12954a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f12955b;

    /* renamed from: c  reason: collision with root package name */
    private final a<y> f12956c;

    /* renamed from: d  reason: collision with root package name */
    private final a<a4.d> f12957d;

    /* renamed from: e  reason: collision with root package name */
    private final a<b4.a> f12958e;

    public d(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<a4.d> aVar4, a<b4.a> aVar5) {
        this.f12954a = aVar;
        this.f12955b = aVar2;
        this.f12956c = aVar3;
        this.f12957d = aVar4;
        this.f12958e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<a4.d> aVar4, a<b4.a> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, y yVar, a4.d dVar, b4.a aVar) {
        return new c(executor, eVar, yVar, dVar, aVar);
    }

    /* renamed from: b */
    public c get() {
        return c(this.f12954a.get(), this.f12955b.get(), this.f12956c.get(), this.f12957d.get(), this.f12958e.get());
    }
}
