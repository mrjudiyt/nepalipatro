package z3;

import a4.c;
import a4.d;
import android.content.Context;
import java.util.concurrent.Executor;
import n8.a;
import t3.e;
import u3.b;

/* compiled from: Uploader_Factory */
public final class t implements b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f13169a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f13170b;

    /* renamed from: c  reason: collision with root package name */
    private final a<d> f13171c;

    /* renamed from: d  reason: collision with root package name */
    private final a<y> f13172d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f13173e;

    /* renamed from: f  reason: collision with root package name */
    private final a<b4.a> f13174f;

    /* renamed from: g  reason: collision with root package name */
    private final a<c4.a> f13175g;

    /* renamed from: h  reason: collision with root package name */
    private final a<c4.a> f13176h;

    /* renamed from: i  reason: collision with root package name */
    private final a<c> f13177i;

    public t(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<y> aVar4, a<Executor> aVar5, a<b4.a> aVar6, a<c4.a> aVar7, a<c4.a> aVar8, a<c> aVar9) {
        this.f13169a = aVar;
        this.f13170b = aVar2;
        this.f13171c = aVar3;
        this.f13172d = aVar4;
        this.f13173e = aVar5;
        this.f13174f = aVar6;
        this.f13175g = aVar7;
        this.f13176h = aVar8;
        this.f13177i = aVar9;
    }

    public static t a(a<Context> aVar, a<e> aVar2, a<d> aVar3, a<y> aVar4, a<Executor> aVar5, a<b4.a> aVar6, a<c4.a> aVar7, a<c4.a> aVar8, a<c> aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static s c(Context context, e eVar, d dVar, y yVar, Executor executor, b4.a aVar, c4.a aVar2, c4.a aVar3, c cVar) {
        return new s(context, eVar, dVar, yVar, executor, aVar, aVar2, aVar3, cVar);
    }

    /* renamed from: b */
    public s get() {
        return c(this.f13169a.get(), this.f13170b.get(), this.f13171c.get(), this.f13172d.get(), this.f13173e.get(), this.f13174f.get(), this.f13175g.get(), this.f13176h.get(), this.f13177i.get());
    }
}
