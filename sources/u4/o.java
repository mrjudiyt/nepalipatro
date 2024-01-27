package u4;

import a6.m0;
import a6.p;
import a6.u;
import a6.x;
import a6.y;
import e4.j;
import java.util.Arrays;
import java.util.Collections;
import k4.b0;
import k4.k;
import u4.i0;

/* compiled from: H263Reader */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f11924l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f11925a;

    /* renamed from: b  reason: collision with root package name */
    private final y f11926b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f11927c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f11928d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final u f11929e;

    /* renamed from: f  reason: collision with root package name */
    private b f11930f;

    /* renamed from: g  reason: collision with root package name */
    private long f11931g;

    /* renamed from: h  reason: collision with root package name */
    private String f11932h;

    /* renamed from: i  reason: collision with root package name */
    private b0 f11933i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11934j;

    /* renamed from: k  reason: collision with root package name */
    private long f11935k;

    /* compiled from: H263Reader */
    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f11936f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f11937a;

        /* renamed from: b  reason: collision with root package name */
        private int f11938b;

        /* renamed from: c  reason: collision with root package name */
        public int f11939c;

        /* renamed from: d  reason: collision with root package name */
        public int f11940d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f11941e;

        public a(int i10) {
            this.f11941e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f11937a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f11941e;
                int length = bArr2.length;
                int i13 = this.f11939c;
                if (length < i13 + i12) {
                    this.f11941e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f11941e, this.f11939c, i12);
                this.f11939c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f11938b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f11939c -= i11;
                                this.f11937a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            p.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f11940d = this.f11939c;
                            this.f11938b = 4;
                        }
                    } else if (i10 > 31) {
                        p.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f11938b = 3;
                    }
                } else if (i10 != 181) {
                    p.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f11938b = 2;
                }
            } else if (i10 == 176) {
                this.f11938b = 1;
                this.f11937a = true;
            }
            byte[] bArr = f11936f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f11937a = false;
            this.f11939c = 0;
            this.f11938b = 0;
        }
    }

    /* compiled from: H263Reader */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f11942a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f11943b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f11944c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11945d;

        /* renamed from: e  reason: collision with root package name */
        private int f11946e;

        /* renamed from: f  reason: collision with root package name */
        private int f11947f;

        /* renamed from: g  reason: collision with root package name */
        private long f11948g;

        /* renamed from: h  reason: collision with root package name */
        private long f11949h;

        public b(b0 b0Var) {
            this.f11942a = b0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f11944c) {
                int i12 = this.f11947f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f11945d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f11944c = false;
                    return;
                }
                this.f11947f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f11946e == 182 && z10 && this.f11943b) {
                boolean z11 = this.f11945d;
                this.f11942a.e(this.f11949h, z11 ? 1 : 0, (int) (j10 - this.f11948g), i10, (b0.a) null);
            }
            if (this.f11946e != 179) {
                this.f11948g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f11946e = i10;
            this.f11945d = false;
            boolean z10 = true;
            this.f11943b = i10 == 182 || i10 == 179;
            if (i10 != 182) {
                z10 = false;
            }
            this.f11944c = z10;
            this.f11947f = 0;
            this.f11949h = j10;
        }

        public void d() {
            this.f11943b = false;
            this.f11944c = false;
            this.f11945d = false;
            this.f11946e = -1;
        }
    }

    o(k0 k0Var) {
        this.f11925a = k0Var;
        if (k0Var != null) {
            this.f11929e = new u(178, 128);
            this.f11926b = new y();
            return;
        }
        this.f11929e = null;
        this.f11926b = null;
    }

    private static j f(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f11941e, aVar.f11939c);
        x xVar = new x(copyOf);
        xVar.s(i10);
        xVar.s(4);
        xVar.q();
        xVar.r(8);
        if (xVar.g()) {
            xVar.r(4);
            xVar.r(3);
        }
        int h10 = xVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = xVar.h(8);
            int h12 = xVar.h(8);
            if (h12 == 0) {
                p.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) h11) / ((float) h12);
            }
        } else {
            float[] fArr = f11924l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                p.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xVar.g()) {
            xVar.r(2);
            xVar.r(1);
            if (xVar.g()) {
                xVar.r(15);
                xVar.q();
                xVar.r(15);
                xVar.q();
                xVar.r(15);
                xVar.q();
                xVar.r(3);
                xVar.r(11);
                xVar.q();
                xVar.r(15);
                xVar.q();
            }
        }
        if (xVar.h(2) != 0) {
            p.h("H263Reader", "Unhandled video object layer shape");
        }
        xVar.q();
        int h13 = xVar.h(16);
        xVar.q();
        if (xVar.g()) {
            if (h13 == 0) {
                p.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                xVar.r(i11);
            }
        }
        xVar.q();
        int h14 = xVar.h(13);
        xVar.q();
        int h15 = xVar.h(13);
        xVar.q();
        xVar.q();
        return new j.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    public void a(y yVar) {
        a6.a.h(this.f11930f);
        a6.a.h(this.f11933i);
        int e10 = yVar.e();
        int f10 = yVar.f();
        byte[] d10 = yVar.d();
        this.f11931g += (long) yVar.a();
        this.f11933i.a(yVar, yVar.a());
        while (true) {
            int c10 = u.c(d10, e10, f10, this.f11927c);
            if (c10 == f10) {
                break;
            }
            int i10 = c10 + 3;
            byte b10 = yVar.d()[i10] & 255;
            int i11 = c10 - e10;
            int i12 = 0;
            if (!this.f11934j) {
                if (i11 > 0) {
                    this.f11928d.a(d10, e10, c10);
                }
                if (this.f11928d.b(b10, i11 < 0 ? -i11 : 0)) {
                    b0 b0Var = this.f11933i;
                    a aVar = this.f11928d;
                    b0Var.d(f(aVar, aVar.f11940d, (String) a6.a.e(this.f11932h)));
                    this.f11934j = true;
                }
            }
            this.f11930f.a(d10, e10, c10);
            u uVar = this.f11929e;
            if (uVar != null) {
                if (i11 > 0) {
                    uVar.a(d10, e10, c10);
                } else {
                    i12 = -i11;
                }
                if (this.f11929e.b(i12)) {
                    u uVar2 = this.f11929e;
                    ((y) m0.j(this.f11926b)).M(this.f11929e.f12068d, u.k(uVar2.f12068d, uVar2.f12069e));
                    ((k0) m0.j(this.f11925a)).a(this.f11935k, this.f11926b);
                }
                if (b10 == 178 && yVar.d()[c10 + 2] == 1) {
                    this.f11929e.e(b10);
                }
            }
            int i13 = f10 - c10;
            this.f11930f.b(this.f11931g - ((long) i13), i13, this.f11934j);
            this.f11930f.c(b10, this.f11935k);
            e10 = i10;
        }
        if (!this.f11934j) {
            this.f11928d.a(d10, e10, f10);
        }
        this.f11930f.a(d10, e10, f10);
        u uVar3 = this.f11929e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    public void b() {
        u.a(this.f11927c);
        this.f11928d.c();
        b bVar = this.f11930f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f11929e;
        if (uVar != null) {
            uVar.d();
        }
        this.f11931g = 0;
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11932h = dVar.b();
        b0 e10 = kVar.e(dVar.c(), 2);
        this.f11933i = e10;
        this.f11930f = new b(e10);
        k0 k0Var = this.f11925a;
        if (k0Var != null) {
            k0Var.b(kVar, dVar);
        }
    }

    public void e(long j10, int i10) {
        this.f11935k = j10;
    }
}
