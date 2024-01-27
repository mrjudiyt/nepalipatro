package u4;

import a6.c;
import a6.m0;
import a6.p;
import a6.u;
import a6.y;
import a6.z;
import e4.j;
import java.util.Collections;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: H265Reader */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f11999a;

    /* renamed from: b  reason: collision with root package name */
    private String f12000b;

    /* renamed from: c  reason: collision with root package name */
    private b0 f12001c;

    /* renamed from: d  reason: collision with root package name */
    private a f12002d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12003e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f12004f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f12005g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f12006h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f12007i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f12008j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f12009k = new u(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f12010l;

    /* renamed from: m  reason: collision with root package name */
    private long f12011m;

    /* renamed from: n  reason: collision with root package name */
    private final y f12012n = new y();

    /* compiled from: H265Reader */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f12013a;

        /* renamed from: b  reason: collision with root package name */
        private long f12014b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12015c;

        /* renamed from: d  reason: collision with root package name */
        private int f12016d;

        /* renamed from: e  reason: collision with root package name */
        private long f12017e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12018f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f12019g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f12020h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f12021i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f12022j;

        /* renamed from: k  reason: collision with root package name */
        private long f12023k;

        /* renamed from: l  reason: collision with root package name */
        private long f12024l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f12025m;

        public a(b0 b0Var) {
            this.f12013a = b0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            boolean z10 = this.f12025m;
            int i11 = (int) (this.f12014b - this.f12023k);
            this.f12013a.e(this.f12024l, z10 ? 1 : 0, i11, i10, (b0.a) null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f12022j && this.f12019g) {
                this.f12025m = this.f12015c;
                this.f12022j = false;
            } else if (this.f12020h || this.f12019g) {
                if (z10 && this.f12021i) {
                    d(i10 + ((int) (j10 - this.f12014b)));
                }
                this.f12023k = this.f12014b;
                this.f12024l = this.f12017e;
                this.f12025m = this.f12015c;
                this.f12021i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f12018f) {
                int i12 = this.f12016d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f12019g = (bArr[i13] & 128) != 0;
                    this.f12018f = false;
                    return;
                }
                this.f12016d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f12018f = false;
            this.f12019g = false;
            this.f12020h = false;
            this.f12021i = false;
            this.f12022j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f12019g = false;
            this.f12020h = false;
            this.f12017e = j11;
            this.f12016d = 0;
            this.f12014b = j10;
            if (!c(i11)) {
                if (this.f12021i && !this.f12022j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f12021i = false;
                }
                if (b(i11)) {
                    this.f12020h = !this.f12022j;
                    this.f12022j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f12015c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f12018f = z11;
        }
    }

    public q(d0 d0Var) {
        this.f11999a = d0Var;
    }

    private void f() {
        a6.a.h(this.f12001c);
        m0.j(this.f12002d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f12002d.a(j10, i10, this.f12003e);
        if (!this.f12003e) {
            this.f12005g.b(i11);
            this.f12006h.b(i11);
            this.f12007i.b(i11);
            if (this.f12005g.c() && this.f12006h.c() && this.f12007i.c()) {
                this.f12001c.d(i(this.f12000b, this.f12005g, this.f12006h, this.f12007i));
                this.f12003e = true;
            }
        }
        if (this.f12008j.b(i11)) {
            u uVar = this.f12008j;
            this.f12012n.M(this.f12008j.f12068d, u.k(uVar.f12068d, uVar.f12069e));
            this.f12012n.P(5);
            this.f11999a.a(j11, this.f12012n);
        }
        if (this.f12009k.b(i11)) {
            u uVar2 = this.f12009k;
            this.f12012n.M(this.f12009k.f12068d, u.k(uVar2.f12068d, uVar2.f12069e));
            this.f12012n.P(5);
            this.f11999a.a(j11, this.f12012n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f12002d.e(bArr, i10, i11);
        if (!this.f12003e) {
            this.f12005g.a(bArr, i10, i11);
            this.f12006h.a(bArr, i10, i11);
            this.f12007i.a(bArr, i10, i11);
        }
        this.f12008j.a(bArr, i10, i11);
        this.f12009k.a(bArr, i10, i11);
    }

    private static j i(String str, u uVar, u uVar2, u uVar3) {
        u uVar4 = uVar;
        u uVar5 = uVar2;
        u uVar6 = uVar3;
        int i10 = uVar4.f12069e;
        byte[] bArr = new byte[(uVar5.f12069e + i10 + uVar6.f12069e)];
        System.arraycopy(uVar4.f12068d, 0, bArr, 0, i10);
        System.arraycopy(uVar5.f12068d, 0, bArr, uVar4.f12069e, uVar5.f12069e);
        System.arraycopy(uVar6.f12068d, 0, bArr, uVar4.f12069e + uVar5.f12069e, uVar6.f12069e);
        z zVar = new z(uVar5.f12068d, 0, uVar5.f12069e);
        zVar.l(44);
        int e10 = zVar.e(3);
        zVar.k();
        zVar.l(88);
        zVar.l(8);
        int i11 = 0;
        for (int i12 = 0; i12 < e10; i12++) {
            if (zVar.d()) {
                i11 += 89;
            }
            if (zVar.d()) {
                i11 += 8;
            }
        }
        zVar.l(i11);
        if (e10 > 0) {
            zVar.l((8 - e10) * 2);
        }
        zVar.h();
        int h10 = zVar.h();
        if (h10 == 3) {
            zVar.k();
        }
        int h11 = zVar.h();
        int h12 = zVar.h();
        if (zVar.d()) {
            int h13 = zVar.h();
            int h14 = zVar.h();
            int h15 = zVar.h();
            int h16 = zVar.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        zVar.h();
        zVar.h();
        int h17 = zVar.h();
        for (int i13 = zVar.d() ? 0 : e10; i13 <= e10; i13++) {
            zVar.h();
            zVar.h();
            zVar.h();
        }
        zVar.h();
        zVar.h();
        zVar.h();
        zVar.h();
        zVar.h();
        zVar.h();
        if (zVar.d() && zVar.d()) {
            j(zVar);
        }
        zVar.l(2);
        if (zVar.d()) {
            zVar.l(8);
            zVar.h();
            zVar.h();
            zVar.k();
        }
        k(zVar);
        if (zVar.d()) {
            for (int i14 = 0; i14 < zVar.h(); i14++) {
                zVar.l(h17 + 4 + 1);
            }
        }
        zVar.l(2);
        float f10 = 1.0f;
        if (zVar.d()) {
            if (zVar.d()) {
                int e11 = zVar.e(8);
                if (e11 == 255) {
                    int e12 = zVar.e(16);
                    int e13 = zVar.e(16);
                    if (!(e12 == 0 || e13 == 0)) {
                        f10 = ((float) e12) / ((float) e13);
                    }
                } else {
                    float[] fArr = u.f245b;
                    if (e11 < fArr.length) {
                        f10 = fArr[e11];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(e11);
                        p.h("H265Reader", sb.toString());
                    }
                }
            }
            if (zVar.d()) {
                zVar.k();
            }
            if (zVar.d()) {
                zVar.l(4);
                if (zVar.d()) {
                    zVar.l(24);
                }
            }
            if (zVar.d()) {
                zVar.h();
                zVar.h();
            }
            zVar.k();
            if (zVar.d()) {
                h12 *= 2;
            }
        }
        zVar.i(uVar5.f12068d, 0, uVar5.f12069e);
        zVar.l(24);
        return new j.b().S(str).e0("video/hevc").I(c.c(zVar)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(z zVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!zVar.d()) {
                    zVar.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        zVar.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        zVar.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(z zVar) {
        int h10 = zVar.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = zVar.d();
            }
            if (z10) {
                zVar.k();
                zVar.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (zVar.d()) {
                        zVar.k();
                    }
                }
            } else {
                int h11 = zVar.h();
                int h12 = zVar.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    zVar.h();
                    zVar.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    zVar.h();
                    zVar.k();
                }
                i10 = i13;
            }
        }
    }

    private void l(long j10, int i10, int i11, long j11) {
        this.f12002d.g(j10, i10, i11, j11, this.f12003e);
        if (!this.f12003e) {
            this.f12005g.e(i11);
            this.f12006h.e(i11);
            this.f12007i.e(i11);
        }
        this.f12008j.e(i11);
        this.f12009k.e(i11);
    }

    public void a(y yVar) {
        f();
        while (yVar.a() > 0) {
            int e10 = yVar.e();
            int f10 = yVar.f();
            byte[] d10 = yVar.d();
            this.f12010l += (long) yVar.a();
            this.f12001c.a(yVar, yVar.a());
            while (true) {
                if (e10 < f10) {
                    int c10 = u.c(d10, e10, f10, this.f12004f);
                    if (c10 == f10) {
                        h(d10, e10, f10);
                        return;
                    }
                    int e11 = u.e(d10, c10);
                    int i10 = c10 - e10;
                    if (i10 > 0) {
                        h(d10, e10, c10);
                    }
                    int i11 = f10 - c10;
                    long j10 = this.f12010l - ((long) i11);
                    int i12 = i10 < 0 ? -i10 : 0;
                    long j11 = j10;
                    int i13 = i11;
                    g(j11, i13, i12, this.f12011m);
                    l(j11, i13, e11, this.f12011m);
                    e10 = c10 + 3;
                }
            }
        }
    }

    public void b() {
        this.f12010l = 0;
        u.a(this.f12004f);
        this.f12005g.d();
        this.f12006h.d();
        this.f12007i.d();
        this.f12008j.d();
        this.f12009k.d();
        a aVar = this.f12002d;
        if (aVar != null) {
            aVar.f();
        }
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f12000b = dVar.b();
        b0 e10 = kVar.e(dVar.c(), 2);
        this.f12001c = e10;
        this.f12002d = new a(e10);
        this.f11999a.b(kVar, dVar);
    }

    public void e(long j10, int i10) {
        this.f12011m = j10;
    }
}
