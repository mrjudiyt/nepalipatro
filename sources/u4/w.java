package u4;

import a6.a;
import a6.i0;
import a6.p;
import a6.x;
import a6.y;
import k4.k;
import u4.i0;

/* compiled from: PesReader */
public final class w implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f12073a;

    /* renamed from: b  reason: collision with root package name */
    private final x f12074b = new x(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f12075c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f12076d;

    /* renamed from: e  reason: collision with root package name */
    private i0 f12077e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12078f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12079g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12080h;

    /* renamed from: i  reason: collision with root package name */
    private int f12081i;

    /* renamed from: j  reason: collision with root package name */
    private int f12082j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12083k;

    /* renamed from: l  reason: collision with root package name */
    private long f12084l;

    public w(m mVar) {
        this.f12073a = mVar;
    }

    private boolean d(y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f12076d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.P(min);
        } else {
            yVar.j(bArr, this.f12076d, min);
        }
        int i11 = this.f12076d + min;
        this.f12076d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean e() {
        this.f12074b.p(0);
        int h10 = this.f12074b.h(24);
        if (h10 != 1) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected start code prefix: ");
            sb.append(h10);
            p.h("PesReader", sb.toString());
            this.f12082j = -1;
            return false;
        }
        this.f12074b.r(8);
        int h11 = this.f12074b.h(16);
        this.f12074b.r(5);
        this.f12083k = this.f12074b.g();
        this.f12074b.r(2);
        this.f12078f = this.f12074b.g();
        this.f12079g = this.f12074b.g();
        this.f12074b.r(6);
        int h12 = this.f12074b.h(8);
        this.f12081i = h12;
        if (h11 == 0) {
            this.f12082j = -1;
        } else {
            int i10 = ((h11 + 6) - 9) - h12;
            this.f12082j = i10;
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Found negative packet payload size: ");
                sb2.append(i10);
                p.h("PesReader", sb2.toString());
                this.f12082j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f12074b.p(0);
        this.f12084l = -9223372036854775807L;
        if (this.f12078f) {
            this.f12074b.r(4);
            this.f12074b.r(1);
            this.f12074b.r(1);
            long h10 = (((long) this.f12074b.h(3)) << 30) | ((long) (this.f12074b.h(15) << 15)) | ((long) this.f12074b.h(15));
            this.f12074b.r(1);
            if (!this.f12080h && this.f12079g) {
                this.f12074b.r(4);
                this.f12074b.r(1);
                this.f12074b.r(1);
                this.f12074b.r(1);
                this.f12077e.b((((long) this.f12074b.h(3)) << 30) | ((long) (this.f12074b.h(15) << 15)) | ((long) this.f12074b.h(15)));
                this.f12080h = true;
            }
            this.f12084l = this.f12077e.b(h10);
        }
    }

    private void g(int i10) {
        this.f12075c = i10;
        this.f12076d = 0;
    }

    public final void a(y yVar, int i10) {
        a.h(this.f12077e);
        if ((i10 & 1) != 0) {
            int i11 = this.f12075c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    p.h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    int i12 = this.f12082j;
                    if (i12 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i12);
                        sb.append(" more bytes");
                        p.h("PesReader", sb.toString());
                    }
                    this.f12073a.c();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (yVar.a() > 0) {
            int i13 = this.f12075c;
            if (i13 != 0) {
                int i14 = 0;
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (d(yVar, this.f12074b.f274a, Math.min(10, this.f12081i)) && d(yVar, (byte[]) null, this.f12081i)) {
                            f();
                            if (this.f12083k) {
                                i14 = 4;
                            }
                            i10 |= i14;
                            this.f12073a.e(this.f12084l, i10);
                            g(3);
                        }
                    } else if (i13 == 3) {
                        int a10 = yVar.a();
                        int i15 = this.f12082j;
                        if (i15 != -1) {
                            i14 = a10 - i15;
                        }
                        if (i14 > 0) {
                            a10 -= i14;
                            yVar.N(yVar.e() + a10);
                        }
                        this.f12073a.a(yVar);
                        int i16 = this.f12082j;
                        if (i16 != -1) {
                            int i17 = i16 - a10;
                            this.f12082j = i17;
                            if (i17 == 0) {
                                this.f12073a.c();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(yVar, this.f12074b.f274a, 9)) {
                    if (e()) {
                        i14 = 2;
                    }
                    g(i14);
                }
            } else {
                yVar.P(yVar.a());
            }
        }
    }

    public final void b() {
        this.f12075c = 0;
        this.f12076d = 0;
        this.f12080h = false;
        this.f12073a.b();
    }

    public void c(i0 i0Var, k kVar, i0.d dVar) {
        this.f12077e = i0Var;
        this.f12073a.d(kVar, dVar);
    }
}
