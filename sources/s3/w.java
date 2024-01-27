package s3;

import n8.a;
import u3.b;
import y3.e;
import z3.s;

/* compiled from: TransportRuntime_Factory */
public final class w implements b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final a<c4.a> f11413a;

    /* renamed from: b  reason: collision with root package name */
    private final a<c4.a> f11414b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f11415c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f11416d;

    /* renamed from: e  reason: collision with root package name */
    private final a<z3.w> f11417e;

    public w(a<c4.a> aVar, a<c4.a> aVar2, a<e> aVar3, a<s> aVar4, a<z3.w> aVar5) {
        this.f11413a = aVar;
        this.f11414b = aVar2;
        this.f11415c = aVar3;
        this.f11416d = aVar4;
        this.f11417e = aVar5;
    }

    public static w a(a<c4.a> aVar, a<c4.a> aVar2, a<e> aVar3, a<s> aVar4, a<z3.w> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(c4.a aVar, c4.a aVar2, e eVar, s sVar, z3.w wVar) {
        return new u(aVar, aVar2, eVar, sVar, wVar);
    }

    /* renamed from: b */
    public u get() {
        return c(this.f11413a.get(), this.f11414b.get(), this.f11415c.get(), this.f11416d.get(), this.f11417e.get());
    }
}
