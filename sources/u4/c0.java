package u4;

import a6.i0;
import a6.m0;
import a6.y;
import k4.k;
import u4.i0;

/* compiled from: SectionReader */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11769a;

    /* renamed from: b  reason: collision with root package name */
    private final y f11770b = new y(32);

    /* renamed from: c  reason: collision with root package name */
    private int f11771c;

    /* renamed from: d  reason: collision with root package name */
    private int f11772d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11773e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11774f;

    public c0(b0 b0Var) {
        this.f11769a = b0Var;
    }

    public void a(y yVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int e10 = z10 ? yVar.e() + yVar.C() : -1;
        if (this.f11774f) {
            if (z10) {
                this.f11774f = false;
                yVar.O(e10);
                this.f11772d = 0;
            } else {
                return;
            }
        }
        while (yVar.a() > 0) {
            int i11 = this.f11772d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int C = yVar.C();
                    yVar.O(yVar.e() - 1);
                    if (C == 255) {
                        this.f11774f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.a(), 3 - this.f11772d);
                yVar.j(this.f11770b.d(), this.f11772d, min);
                int i12 = this.f11772d + min;
                this.f11772d = i12;
                if (i12 == 3) {
                    this.f11770b.O(0);
                    this.f11770b.N(3);
                    this.f11770b.P(1);
                    int C2 = this.f11770b.C();
                    int C3 = this.f11770b.C();
                    this.f11773e = (C2 & 128) != 0;
                    this.f11771c = (((C2 & 15) << 8) | C3) + 3;
                    int b10 = this.f11770b.b();
                    int i13 = this.f11771c;
                    if (b10 < i13) {
                        this.f11770b.c(Math.min(4098, Math.max(i13, this.f11770b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.a(), this.f11771c - this.f11772d);
                yVar.j(this.f11770b.d(), this.f11772d, min2);
                int i14 = this.f11772d + min2;
                this.f11772d = i14;
                int i15 = this.f11771c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f11773e) {
                        this.f11770b.N(i15);
                    } else if (m0.u(this.f11770b.d(), 0, this.f11771c, -1) != 0) {
                        this.f11774f = true;
                        return;
                    } else {
                        this.f11770b.N(this.f11771c - 4);
                    }
                    this.f11770b.O(0);
                    this.f11769a.a(this.f11770b);
                    this.f11772d = 0;
                }
            }
        }
    }

    public void b() {
        this.f11774f = true;
    }

    public void c(i0 i0Var, k kVar, i0.d dVar) {
        this.f11769a.c(i0Var, kVar, dVar);
        this.f11774f = true;
    }
}
