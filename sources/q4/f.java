package q4;

import a6.m0;
import a6.y;
import c5.h;
import c5.m;
import com.google.android.exoplayer2.ParserException;
import e4.c;
import e4.j;
import g4.u;
import java.io.EOFException;
import k4.b0;
import k4.i;
import k4.j;
import k4.k;
import k4.o;
import k4.v;
import k4.x;
import x4.a;

/* compiled from: Mp3Extractor */
public final class f implements i {

    /* renamed from: u  reason: collision with root package name */
    public static final o f10691u = e.f16274b;

    /* renamed from: v  reason: collision with root package name */
    private static final h.a f10692v = d.f16273a;

    /* renamed from: a  reason: collision with root package name */
    private final int f10693a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10694b;

    /* renamed from: c  reason: collision with root package name */
    private final y f10695c;

    /* renamed from: d  reason: collision with root package name */
    private final u.a f10696d;

    /* renamed from: e  reason: collision with root package name */
    private final k4.u f10697e;

    /* renamed from: f  reason: collision with root package name */
    private final v f10698f;

    /* renamed from: g  reason: collision with root package name */
    private final b0 f10699g;

    /* renamed from: h  reason: collision with root package name */
    private k f10700h;

    /* renamed from: i  reason: collision with root package name */
    private b0 f10701i;

    /* renamed from: j  reason: collision with root package name */
    private b0 f10702j;

    /* renamed from: k  reason: collision with root package name */
    private int f10703k;

    /* renamed from: l  reason: collision with root package name */
    private a f10704l;

    /* renamed from: m  reason: collision with root package name */
    private long f10705m;

    /* renamed from: n  reason: collision with root package name */
    private long f10706n;

    /* renamed from: o  reason: collision with root package name */
    private long f10707o;

    /* renamed from: p  reason: collision with root package name */
    private int f10708p;

    /* renamed from: q  reason: collision with root package name */
    private g f10709q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10710r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10711s;

    /* renamed from: t  reason: collision with root package name */
    private long f10712t;

    public f() {
        this(0);
    }

    private void f() {
        a6.a.h(this.f10701i);
        m0.j(this.f10700h);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: q4.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: q4.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: q4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: q4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: q4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: q4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: q4.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private q4.g h(k4.j r12) {
        /*
            r11 = this;
            q4.g r0 = r11.r(r12)
            x4.a r1 = r11.f10704l
            long r2 = r12.getPosition()
            q4.c r1 = q(r1, r2)
            boolean r2 = r11.f10710r
            if (r2 == 0) goto L_0x0018
            q4.g$a r12 = new q4.g$a
            r12.<init>()
            return r12
        L_0x0018:
            r2 = 0
            int r3 = r11.f10693a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x004c
            r2 = -1
            if (r1 == 0) goto L_0x002e
            long r2 = r1.i()
            long r0 = r1.e()
        L_0x002b:
            r9 = r0
            r5 = r2
            goto L_0x0041
        L_0x002e:
            if (r0 == 0) goto L_0x0039
            long r2 = r0.i()
            long r0 = r0.e()
            goto L_0x002b
        L_0x0039:
            x4.a r0 = r11.f10704l
            long r0 = l(r0)
            r5 = r0
            r9 = r2
        L_0x0041:
            q4.b r0 = new q4.b
            long r7 = r12.getPosition()
            r4 = r0
            r4.<init>(r5, r7, r9)
            goto L_0x0054
        L_0x004c:
            if (r1 == 0) goto L_0x0050
            r0 = r1
            goto L_0x0054
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0066
            int r1 = r11.f10693a
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0066
        L_0x0062:
            q4.g r0 = r11.k(r12)
        L_0x0066:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.f.h(k4.j):q4.g");
    }

    private long i(long j10) {
        return this.f10705m + ((j10 * 1000000) / ((long) this.f10696d.f8877d));
    }

    private g k(j jVar) {
        jVar.o(this.f10695c.d(), 0, 4);
        this.f10695c.O(0);
        this.f10696d.a(this.f10695c.m());
        return new a(jVar.a(), jVar.getPosition(), this.f10696d);
    }

    private static long l(a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof m) {
                m mVar = (m) d10;
                if (mVar.f5254h.equals("TLEN")) {
                    return c.d(Long.parseLong(mVar.f5266j));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int m(y yVar, int i10) {
        if (yVar.f() >= i10 + 4) {
            yVar.O(i10);
            int m10 = yVar.m();
            if (m10 == 1483304551 || m10 == 1231971951) {
                return m10;
            }
        }
        if (yVar.f() < 40) {
            return 0;
        }
        yVar.O(36);
        return yVar.m() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean n(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] o() {
        return new i[]{new f()};
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c q(a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof c5.k) {
                return c.b(j10, (c5.k) d10, l(aVar));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private q4.g r(k4.j r11) {
        /*
            r10 = this;
            a6.y r5 = new a6.y
            g4.u$a r0 = r10.f10696d
            int r0 = r0.f8876c
            r5.<init>((int) r0)
            byte[] r0 = r5.d()
            g4.u$a r1 = r10.f10696d
            int r1 = r1.f8876c
            r6 = 0
            r11.o(r0, r6, r1)
            g4.u$a r0 = r10.f10696d
            int r1 = r0.f8874a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            if (r1 == 0) goto L_0x0028
            int r0 = r0.f8878e
            if (r0 == r2) goto L_0x002c
            r3 = 36
            r7 = 36
            goto L_0x0033
        L_0x0028:
            int r0 = r0.f8878e
            if (r0 == r2) goto L_0x002f
        L_0x002c:
            r7 = 21
            goto L_0x0033
        L_0x002f:
            r3 = 13
            r7 = 13
        L_0x0033:
            int r8 = m(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x0062
            if (r8 != r9) goto L_0x0042
            goto L_0x0062
        L_0x0042:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x005d
            long r0 = r11.a()
            long r2 = r11.getPosition()
            g4.u$a r4 = r10.f10696d
            q4.h r0 = q4.h.b(r0, r2, r4, r5)
            g4.u$a r1 = r10.f10696d
            int r1 = r1.f8876c
            r11.l(r1)
            goto L_0x00b2
        L_0x005d:
            r0 = 0
            r11.k()
            goto L_0x00b2
        L_0x0062:
            long r0 = r11.a()
            long r2 = r11.getPosition()
            g4.u$a r4 = r10.f10696d
            q4.i r0 = q4.i.b(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x009c
            k4.u r1 = r10.f10697e
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x009c
            r11.k()
            int r7 = r7 + 141
            r11.f(r7)
            a6.y r1 = r10.f10695c
            byte[] r1 = r1.d()
            r2 = 3
            r11.o(r1, r6, r2)
            a6.y r1 = r10.f10695c
            r1.O(r6)
            k4.u r1 = r10.f10697e
            a6.y r2 = r10.f10695c
            int r2 = r2.F()
            r1.d(r2)
        L_0x009c:
            g4.u$a r1 = r10.f10696d
            int r1 = r1.f8876c
            r11.l(r1)
            if (r0 == 0) goto L_0x00b2
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x00b2
            if (r8 != r9) goto L_0x00b2
            q4.g r11 = r10.k(r11)
            return r11
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.f.r(k4.j):q4.g");
    }

    private boolean s(j jVar) {
        g gVar = this.f10709q;
        if (gVar != null) {
            long e10 = gVar.e();
            if (e10 != -1 && jVar.e() > e10 - 4) {
                return true;
            }
        }
        try {
            return !jVar.d(this.f10695c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(j jVar) {
        if (this.f10703k == 0) {
            try {
                v(jVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f10709q == null) {
            g h10 = h(jVar);
            this.f10709q = h10;
            this.f10700h.i(h10);
            this.f10702j.d(new j.b().e0(this.f10696d.f8875b).W(4096).H(this.f10696d.f8878e).f0(this.f10696d.f8877d).M(this.f10697e.f9620a).N(this.f10697e.f9621b).X((this.f10693a & 4) != 0 ? null : this.f10704l).E());
            this.f10707o = jVar.getPosition();
        } else if (this.f10707o != 0) {
            long position = jVar.getPosition();
            long j10 = this.f10707o;
            if (position < j10) {
                jVar.l((int) (j10 - position));
            }
        }
        return u(jVar);
    }

    private int u(k4.j jVar) {
        if (this.f10708p == 0) {
            jVar.k();
            if (s(jVar)) {
                return -1;
            }
            this.f10695c.O(0);
            int m10 = this.f10695c.m();
            if (!n(m10, (long) this.f10703k) || u.j(m10) == -1) {
                jVar.l(1);
                this.f10703k = 0;
                return 0;
            }
            this.f10696d.a(m10);
            if (this.f10705m == -9223372036854775807L) {
                this.f10705m = this.f10709q.a(jVar.getPosition());
                if (this.f10694b != -9223372036854775807L) {
                    this.f10705m += this.f10694b - this.f10709q.a(0);
                }
            }
            u.a aVar = this.f10696d;
            this.f10708p = aVar.f8876c;
            g gVar = this.f10709q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(i(this.f10706n + ((long) aVar.f8880g)), jVar.getPosition() + ((long) this.f10696d.f8876c));
                if (this.f10711s && bVar.b(this.f10712t)) {
                    this.f10711s = false;
                    this.f10702j = this.f10701i;
                }
            }
        }
        int c10 = this.f10702j.c(jVar, this.f10708p, true);
        if (c10 == -1) {
            return -1;
        }
        int i10 = this.f10708p - c10;
        this.f10708p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f10702j.e(i(this.f10706n), 1, this.f10696d.f8876c, 0, (b0.a) null);
        this.f10706n += (long) this.f10696d.f8880g;
        this.f10708p = 0;
        return 0;
    }

    private boolean v(k4.j jVar, boolean z10) {
        int i10;
        int i11;
        int j10;
        h.a aVar;
        int i12 = z10 ? 32768 : 131072;
        jVar.k();
        if (jVar.getPosition() == 0) {
            if ((this.f10693a & 4) == 0) {
                aVar = null;
            } else {
                aVar = f10692v;
            }
            a a10 = this.f10698f.a(jVar, aVar);
            this.f10704l = a10;
            if (a10 != null) {
                this.f10697e.c(a10);
            }
            i10 = (int) jVar.e();
            if (!z10) {
                jVar.l(i10);
            }
            i11 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!s(jVar)) {
                this.f10695c.O(0);
                int m10 = this.f10695c.m();
                if ((i11 == 0 || n(m10, (long) i11)) && (j10 = u.j(m10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f10696d.a(m10);
                        i11 = m10;
                    }
                    jVar.f(j10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 != i12) {
                        if (z10) {
                            jVar.k();
                            jVar.f(i10 + i15);
                        } else {
                            jVar.l(1);
                        }
                        i14 = i15;
                        i11 = 0;
                        i13 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw ParserException.a("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            jVar.l(i10 + i14);
        } else {
            jVar.k();
        }
        this.f10703k = i11;
        return true;
    }

    public void b(long j10, long j11) {
        this.f10703k = 0;
        this.f10705m = -9223372036854775807L;
        this.f10706n = 0;
        this.f10708p = 0;
        this.f10712t = j11;
        g gVar = this.f10709q;
        if ((gVar instanceof b) && !((b) gVar).b(j11)) {
            this.f10711s = true;
            this.f10702j = this.f10699g;
        }
    }

    public void c(k kVar) {
        this.f10700h = kVar;
        b0 e10 = kVar.e(0, 1);
        this.f10701i = e10;
        this.f10702j = e10;
        this.f10700h.o();
    }

    public boolean d(k4.j jVar) {
        return v(jVar, true);
    }

    public int g(k4.j jVar, x xVar) {
        f();
        int t10 = t(jVar);
        if (t10 == -1 && (this.f10709q instanceof b)) {
            long i10 = i(this.f10706n);
            if (this.f10709q.i() != i10) {
                ((b) this.f10709q).d(i10);
                this.f10700h.i(this.f10709q);
            }
        }
        return t10;
    }

    public void j() {
        this.f10710r = true;
    }

    public void release() {
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f10693a = i10;
        this.f10694b = j10;
        this.f10695c = new y(10);
        this.f10696d = new u.a();
        this.f10697e = new k4.u();
        this.f10705m = -9223372036854775807L;
        this.f10698f = new v();
        k4.h hVar = new k4.h();
        this.f10699g = hVar;
        this.f10702j = hVar;
    }
}
