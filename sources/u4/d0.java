package u4;

import a6.a;
import a6.y;
import e4.j;
import java.util.List;
import k4.b0;
import k4.c;
import k4.k;
import u4.i0;

/* compiled from: SeiReader */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f11775a;

    /* renamed from: b  reason: collision with root package name */
    private final b0[] f11776b;

    public d0(List<j> list) {
        this.f11775a = list;
        this.f11776b = new b0[list.size()];
    }

    public void a(long j10, y yVar) {
        c.a(j10, yVar, this.f11776b);
    }

    public void b(k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f11776b.length; i10++) {
            dVar.a();
            b0 e10 = kVar.e(dVar.c(), 3);
            j jVar = this.f11775a.get(i10);
            String str = jVar.f8096s;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            a.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = jVar.f8085h;
            if (str2 == null) {
                str2 = dVar.b();
            }
            e10.d(new j.b().S(str2).e0(str).g0(jVar.f8088k).V(jVar.f8087j).F(jVar.K).T(jVar.f8098u).E());
            this.f11776b[i10] = e10;
        }
    }
}
