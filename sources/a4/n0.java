package a4;

import n8.a;
import u3.b;

/* compiled from: SQLiteEventStore_Factory */
public final class n0 implements b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<c4.a> f96a;

    /* renamed from: b  reason: collision with root package name */
    private final a<c4.a> f97b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f98c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t0> f99d;

    /* renamed from: e  reason: collision with root package name */
    private final a<String> f100e;

    public n0(a<c4.a> aVar, a<c4.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        this.f96a = aVar;
        this.f97b = aVar2;
        this.f98c = aVar3;
        this.f99d = aVar4;
        this.f100e = aVar5;
    }

    public static n0 a(a<c4.a> aVar, a<c4.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(c4.a aVar, c4.a aVar2, Object obj, Object obj2, a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    /* renamed from: b */
    public m0 get() {
        return c(this.f96a.get(), this.f97b.get(), this.f98c.get(), this.f99d.get(), this.f100e);
    }
}
