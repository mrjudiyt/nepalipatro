package u4;

import a6.a;
import a6.y;
import e4.j;
import java.util.List;
import k4.b0;
import k4.c;
import k4.k;
import u4.i0;

/* compiled from: UserDataReader */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f11894a;

    /* renamed from: b  reason: collision with root package name */
    private final b0[] f11895b;

    public k0(List<j> list) {
        this.f11894a = list;
        this.f11895b = new b0[list.size()];
    }

    public void a(long j10, y yVar) {
        if (yVar.a() >= 9) {
            int m10 = yVar.m();
            int m11 = yVar.m();
            int C = yVar.C();
            if (m10 == 434 && m11 == 1195456820 && C == 3) {
                c.b(j10, yVar, this.f11895b);
            }
        }
    }

    public void b(k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f11895b.length; i10++) {
            dVar.a();
            b0 e10 = kVar.e(dVar.c(), 3);
            j jVar = this.f11894a.get(i10);
            String str = jVar.f8096s;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String valueOf = String.valueOf(str);
            a.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            e10.d(new j.b().S(dVar.b()).e0(str).g0(jVar.f8088k).V(jVar.f8087j).F(jVar.K).T(jVar.f8098u).E());
            this.f11895b[i10] = e10;
        }
    }
}
