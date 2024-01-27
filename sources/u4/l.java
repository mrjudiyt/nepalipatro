package u4;

import a6.y;
import e4.j;
import java.util.Collections;
import java.util.List;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: DvbSubtitleReader */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f11896a;

    /* renamed from: b  reason: collision with root package name */
    private final b0[] f11897b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11898c;

    /* renamed from: d  reason: collision with root package name */
    private int f11899d;

    /* renamed from: e  reason: collision with root package name */
    private int f11900e;

    /* renamed from: f  reason: collision with root package name */
    private long f11901f;

    public l(List<i0.a> list) {
        this.f11896a = list;
        this.f11897b = new b0[list.size()];
    }

    private boolean f(y yVar, int i10) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.C() != i10) {
            this.f11898c = false;
        }
        this.f11899d--;
        return this.f11898c;
    }

    public void a(y yVar) {
        if (!this.f11898c) {
            return;
        }
        if (this.f11899d != 2 || f(yVar, 32)) {
            if (this.f11899d != 1 || f(yVar, 0)) {
                int e10 = yVar.e();
                int a10 = yVar.a();
                for (b0 a11 : this.f11897b) {
                    yVar.O(e10);
                    a11.a(yVar, a10);
                }
                this.f11900e += a10;
            }
        }
    }

    public void b() {
        this.f11898c = false;
    }

    public void c() {
        if (this.f11898c) {
            for (b0 e10 : this.f11897b) {
                e10.e(this.f11901f, 1, this.f11900e, 0, (b0.a) null);
            }
            this.f11898c = false;
        }
    }

    public void d(k kVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f11897b.length; i10++) {
            i0.a aVar = this.f11896a.get(i10);
            dVar.a();
            b0 e10 = kVar.e(dVar.c(), 3);
            e10.d(new j.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f11871c)).V(aVar.f11869a).E());
            this.f11897b[i10] = e10;
        }
    }

    public void e(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f11898c = true;
            this.f11901f = j10;
            this.f11900e = 0;
            this.f11899d = 2;
        }
    }
}
