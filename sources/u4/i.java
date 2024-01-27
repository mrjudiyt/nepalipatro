package u4;

import a6.a;
import a6.m0;
import a6.p;
import a6.x;
import a6.y;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e4.j;
import g4.a;
import java.util.Arrays;
import java.util.Collections;
import k4.b0;
import k4.h;
import k4.k;
import u4.i0;

/* compiled from: AdtsReader */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f11847v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11848a;

    /* renamed from: b  reason: collision with root package name */
    private final x f11849b;

    /* renamed from: c  reason: collision with root package name */
    private final y f11850c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11851d;

    /* renamed from: e  reason: collision with root package name */
    private String f11852e;

    /* renamed from: f  reason: collision with root package name */
    private b0 f11853f;

    /* renamed from: g  reason: collision with root package name */
    private b0 f11854g;

    /* renamed from: h  reason: collision with root package name */
    private int f11855h;

    /* renamed from: i  reason: collision with root package name */
    private int f11856i;

    /* renamed from: j  reason: collision with root package name */
    private int f11857j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11858k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11859l;

    /* renamed from: m  reason: collision with root package name */
    private int f11860m;

    /* renamed from: n  reason: collision with root package name */
    private int f11861n;

    /* renamed from: o  reason: collision with root package name */
    private int f11862o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11863p;

    /* renamed from: q  reason: collision with root package name */
    private long f11864q;

    /* renamed from: r  reason: collision with root package name */
    private int f11865r;

    /* renamed from: s  reason: collision with root package name */
    private long f11866s;

    /* renamed from: t  reason: collision with root package name */
    private b0 f11867t;

    /* renamed from: u  reason: collision with root package name */
    private long f11868u;

    public i(boolean z10) {
        this(z10, (String) null);
    }

    private void f() {
        a.e(this.f11853f);
        m0.j(this.f11867t);
        m0.j(this.f11854g);
    }

    private void g(y yVar) {
        if (yVar.a() != 0) {
            this.f11849b.f274a[0] = yVar.d()[yVar.e()];
            this.f11849b.p(2);
            int h10 = this.f11849b.h(4);
            int i10 = this.f11861n;
            if (i10 == -1 || h10 == i10) {
                if (!this.f11859l) {
                    this.f11859l = true;
                    this.f11860m = this.f11862o;
                    this.f11861n = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    private boolean h(y yVar, int i10) {
        yVar.O(i10 + 1);
        if (!w(yVar, this.f11849b.f274a, 1)) {
            return false;
        }
        this.f11849b.p(4);
        int h10 = this.f11849b.h(1);
        int i11 = this.f11860m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f11861n != -1) {
            if (!w(yVar, this.f11849b.f274a, 1)) {
                return true;
            }
            this.f11849b.p(2);
            if (this.f11849b.h(4) != this.f11861n) {
                return false;
            }
            yVar.O(i10 + 2);
        }
        if (!w(yVar, this.f11849b.f274a, 4)) {
            return true;
        }
        this.f11849b.p(14);
        int h11 = this.f11849b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] d10 = yVar.d();
        int f10 = yVar.f();
        int i12 = i10 + h11;
        if (i12 >= f10) {
            return true;
        }
        if (d10[i12] == -1) {
            int i13 = i12 + 1;
            if (i13 == f10) {
                return true;
            }
            if (!l((byte) -1, d10[i13]) || ((d10[i13] & 8) >> 3) != h10) {
                return false;
            }
            return true;
        } else if (d10[i12] != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == f10) {
                return true;
            }
            if (d10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            if (i15 == f10 || d10[i15] == 51) {
                return true;
            }
            return false;
        }
    }

    private boolean i(y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f11856i);
        yVar.j(bArr, this.f11856i, min);
        int i11 = this.f11856i + min;
        this.f11856i = i11;
        return i11 == i10;
    }

    private void j(y yVar) {
        byte[] d10 = yVar.d();
        int e10 = yVar.e();
        int f10 = yVar.f();
        while (e10 < f10) {
            int i10 = e10 + 1;
            byte b10 = d10[e10] & 255;
            if (this.f11857j != 512 || !l((byte) -1, (byte) b10) || (!this.f11859l && !h(yVar, i10 - 2))) {
                int i11 = this.f11857j;
                byte b11 = b10 | i11;
                if (b11 == 329) {
                    this.f11857j = 768;
                } else if (b11 == 511) {
                    this.f11857j = 512;
                } else if (b11 == 836) {
                    this.f11857j = 1024;
                } else if (b11 == 1075) {
                    u();
                    yVar.O(i10);
                    return;
                } else if (i11 != 256) {
                    this.f11857j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    i10--;
                }
                e10 = i10;
            } else {
                this.f11862o = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f11858k = z10;
                if (!this.f11859l) {
                    r();
                } else {
                    t();
                }
                yVar.O(i10);
                return;
            }
        }
        yVar.O(e10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f11849b.p(0);
        if (!this.f11863p) {
            int h10 = this.f11849b.h(2) + 1;
            if (h10 != 2) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Detected audio object type: ");
                sb.append(h10);
                sb.append(", but assuming AAC LC.");
                p.h("AdtsReader", sb.toString());
                h10 = 2;
            }
            this.f11849b.r(5);
            byte[] a10 = g4.a.a(h10, this.f11861n, this.f11849b.h(3));
            a.b f10 = g4.a.f(a10);
            j E = new j.b().S(this.f11852e).e0("audio/mp4a-latm").I(f10.f8827c).H(f10.f8826b).f0(f10.f8825a).T(Collections.singletonList(a10)).V(this.f11851d).E();
            this.f11864q = 1024000000 / ((long) E.G);
            this.f11853f.d(E);
            this.f11863p = true;
        } else {
            this.f11849b.r(10);
        }
        this.f11849b.r(4);
        int h11 = (this.f11849b.h(13) - 2) - 5;
        if (this.f11858k) {
            h11 -= 2;
        }
        v(this.f11853f, this.f11864q, 0, h11);
    }

    private void o() {
        this.f11854g.a(this.f11850c, 10);
        this.f11850c.O(6);
        v(this.f11854g, 0, 10, this.f11850c.B() + 10);
    }

    private void p(y yVar) {
        int min = Math.min(yVar.a(), this.f11865r - this.f11856i);
        this.f11867t.a(yVar, min);
        int i10 = this.f11856i + min;
        this.f11856i = i10;
        int i11 = this.f11865r;
        if (i10 == i11) {
            this.f11867t.e(this.f11866s, 1, i11, 0, (b0.a) null);
            this.f11866s += this.f11868u;
            s();
        }
    }

    private void q() {
        this.f11859l = false;
        s();
    }

    private void r() {
        this.f11855h = 1;
        this.f11856i = 0;
    }

    private void s() {
        this.f11855h = 0;
        this.f11856i = 0;
        this.f11857j = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    private void t() {
        this.f11855h = 3;
        this.f11856i = 0;
    }

    private void u() {
        this.f11855h = 2;
        this.f11856i = f11847v.length;
        this.f11865r = 0;
        this.f11850c.O(0);
    }

    private void v(b0 b0Var, long j10, int i10, int i11) {
        this.f11855h = 4;
        this.f11856i = i10;
        this.f11867t = b0Var;
        this.f11868u = j10;
        this.f11865r = i11;
    }

    private boolean w(y yVar, byte[] bArr, int i10) {
        if (yVar.a() < i10) {
            return false;
        }
        yVar.j(bArr, 0, i10);
        return true;
    }

    public void a(y yVar) {
        f();
        while (yVar.a() > 0) {
            int i10 = this.f11855h;
            if (i10 == 0) {
                j(yVar);
            } else if (i10 == 1) {
                g(yVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(yVar, this.f11849b.f274a, this.f11858k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(yVar, this.f11850c.d(), 10)) {
                o();
            }
        }
    }

    public void b() {
        q();
    }

    public void c() {
    }

    public void d(k kVar, i0.d dVar) {
        dVar.a();
        this.f11852e = dVar.b();
        b0 e10 = kVar.e(dVar.c(), 1);
        this.f11853f = e10;
        this.f11867t = e10;
        if (this.f11848a) {
            dVar.a();
            b0 e11 = kVar.e(dVar.c(), 5);
            this.f11854g = e11;
            e11.d(new j.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f11854g = new h();
    }

    public void e(long j10, int i10) {
        this.f11866s = j10;
    }

    public long k() {
        return this.f11864q;
    }

    public i(boolean z10, String str) {
        this.f11849b = new x(new byte[7]);
        this.f11850c = new y(Arrays.copyOf(f11847v, 10));
        s();
        this.f11860m = -1;
        this.f11861n = -1;
        this.f11864q = -9223372036854775807L;
        this.f11848a = z10;
        this.f11851d = str;
    }
}
