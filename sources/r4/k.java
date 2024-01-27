package r4;

import a6.m0;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import d5.b;
import e4.j;
import g4.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k4.b0;
import k4.i;
import k4.j;
import k4.o;
import k4.u;
import k4.x;
import k4.y;
import k4.z;
import r4.a;
import x4.a;

/* compiled from: Mp4Extractor */
public final class k implements i, y {

    /* renamed from: y  reason: collision with root package name */
    public static final o f11099y = i.f16313b;

    /* renamed from: a  reason: collision with root package name */
    private final int f11100a;

    /* renamed from: b  reason: collision with root package name */
    private final a6.y f11101b;

    /* renamed from: c  reason: collision with root package name */
    private final a6.y f11102c;

    /* renamed from: d  reason: collision with root package name */
    private final a6.y f11103d;

    /* renamed from: e  reason: collision with root package name */
    private final a6.y f11104e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<a.C0191a> f11105f;

    /* renamed from: g  reason: collision with root package name */
    private final m f11106g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a.b> f11107h;

    /* renamed from: i  reason: collision with root package name */
    private int f11108i;

    /* renamed from: j  reason: collision with root package name */
    private int f11109j;

    /* renamed from: k  reason: collision with root package name */
    private long f11110k;

    /* renamed from: l  reason: collision with root package name */
    private int f11111l;

    /* renamed from: m  reason: collision with root package name */
    private a6.y f11112m;

    /* renamed from: n  reason: collision with root package name */
    private int f11113n;

    /* renamed from: o  reason: collision with root package name */
    private int f11114o;

    /* renamed from: p  reason: collision with root package name */
    private int f11115p;

    /* renamed from: q  reason: collision with root package name */
    private int f11116q;

    /* renamed from: r  reason: collision with root package name */
    private k4.k f11117r;

    /* renamed from: s  reason: collision with root package name */
    private a[] f11118s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f11119t;

    /* renamed from: u  reason: collision with root package name */
    private int f11120u;

    /* renamed from: v  reason: collision with root package name */
    private long f11121v;

    /* renamed from: w  reason: collision with root package name */
    private int f11122w;

    /* renamed from: x  reason: collision with root package name */
    private b f11123x;

    /* compiled from: Mp4Extractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f11124a;

        /* renamed from: b  reason: collision with root package name */
        public final r f11125b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f11126c;

        /* renamed from: d  reason: collision with root package name */
        public int f11127d;

        public a(o oVar, r rVar, b0 b0Var) {
            this.f11124a = oVar;
            this.f11125b = rVar;
            this.f11126c = b0Var;
        }
    }

    public k() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A(k4.j r10, k4.x r11) {
        /*
            r9 = this;
            long r0 = r9.f11110k
            int r2 = r9.f11111l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            a6.y r4 = r9.f11112m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.d()
            int r7 = r9.f11111l
            int r1 = (int) r0
            r10.readFully(r11, r7, r1)
            int r10 = r9.f11109j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = w(r4)
            r9.f11122w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<r4.a$a> r10 = r9.f11105f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<r4.a$a> r10 = r9.f11105f
            java.lang.Object r10 = r10.peek()
            r4.a$a r10 = (r4.a.C0191a) r10
            r4.a$b r11 = new r4.a$b
            int r0 = r9.f11109j
            r11.<init>(r0, r4)
            r10.e(r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.l(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f9627a = r7
            r10 = 1
        L_0x0059:
            r9.u(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f11108i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.k.A(k4.j, k4.x):boolean");
    }

    private int B(j jVar, x xVar) {
        long position = jVar.getPosition();
        if (this.f11113n == -1) {
            int p10 = p(position);
            this.f11113n = p10;
            if (p10 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) m0.j(this.f11118s))[this.f11113n];
        b0 b0Var = aVar.f11126c;
        int i10 = aVar.f11127d;
        r rVar = aVar.f11125b;
        long j10 = rVar.f11177c[i10];
        int i11 = rVar.f11178d[i10];
        long j11 = (j10 - position) + ((long) this.f11114o);
        if (j11 < 0 || j11 >= 262144) {
            xVar.f9627a = j10;
            return 1;
        }
        if (aVar.f11124a.f11146g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        jVar.l((int) j11);
        o oVar = aVar.f11124a;
        if (oVar.f11149j == 0) {
            if ("audio/ac4".equals(oVar.f11145f.f8096s)) {
                if (this.f11115p == 0) {
                    c.a(i11, this.f11103d);
                    b0Var.a(this.f11103d, 7);
                    this.f11115p += 7;
                }
                i11 += 7;
            }
            while (true) {
                int i12 = this.f11115p;
                if (i12 >= i11) {
                    break;
                }
                int c10 = b0Var.c(jVar, i11 - i12, false);
                this.f11114o += c10;
                this.f11115p += c10;
                this.f11116q -= c10;
            }
        } else {
            byte[] d10 = this.f11102c.d();
            d10[0] = 0;
            d10[1] = 0;
            d10[2] = 0;
            int i13 = aVar.f11124a.f11149j;
            int i14 = 4 - i13;
            while (this.f11115p < i11) {
                int i15 = this.f11116q;
                if (i15 == 0) {
                    jVar.readFully(d10, i14, i13);
                    this.f11114o += i13;
                    this.f11102c.O(0);
                    int m10 = this.f11102c.m();
                    if (m10 >= 0) {
                        this.f11116q = m10;
                        this.f11101b.O(0);
                        b0Var.a(this.f11101b, 4);
                        this.f11115p += 4;
                        i11 += i14;
                    } else {
                        throw ParserException.a("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    int c11 = b0Var.c(jVar, i15, false);
                    this.f11114o += c11;
                    this.f11115p += c11;
                    this.f11116q -= c11;
                }
            }
        }
        r rVar2 = aVar.f11125b;
        b0Var.e(rVar2.f11180f[i10], rVar2.f11181g[i10], i11, 0, (b0.a) null);
        aVar.f11127d++;
        this.f11113n = -1;
        this.f11114o = 0;
        this.f11115p = 0;
        this.f11116q = 0;
        return 0;
    }

    private int C(j jVar, x xVar) {
        int c10 = this.f11106g.c(jVar, xVar, this.f11107h);
        if (c10 == 1 && xVar.f9627a == 0) {
            n();
        }
        return c10;
    }

    private static boolean D(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean E(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void F(long j10) {
        for (a aVar : this.f11118s) {
            r rVar = aVar.f11125b;
            int a10 = rVar.a(j10);
            if (a10 == -1) {
                a10 = rVar.b(j10);
            }
            aVar.f11127d = a10;
        }
    }

    private static int l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f11125b.f11176b];
            jArr2[i10] = aVarArr[i10].f11125b.f11180f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += (long) aVarArr[i12].f11125b.f11178d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f11125b.f11180f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f11108i = 0;
        this.f11111l = 0;
    }

    private static int o(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    private int p(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) m0.j(this.f11118s)).length; i12++) {
            a aVar = this.f11118s[i12];
            int i13 = aVar.f11127d;
            r rVar = aVar.f11125b;
            if (i13 != rVar.f11176b) {
                long j14 = rVar.f11177c[i13];
                long j15 = ((long[][]) m0.j(this.f11119t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o q(o oVar) {
        return oVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] r() {
        return new i[]{new k()};
    }

    private static long s(r rVar, long j10, long j11) {
        int o10 = o(rVar, j10);
        if (o10 == -1) {
            return j11;
        }
        return Math.min(rVar.f11177c[o10], j11);
    }

    private void t(j jVar) {
        this.f11103d.K(8);
        jVar.o(this.f11103d.d(), 0, 8);
        b.d(this.f11103d);
        jVar.l(this.f11103d.e());
        jVar.k();
    }

    private void u(long j10) {
        while (!this.f11105f.isEmpty() && this.f11105f.peek().f11019b == j10) {
            a.C0191a pop = this.f11105f.pop();
            if (pop.f11018a == 1836019574) {
                x(pop);
                this.f11105f.clear();
                this.f11108i = 2;
            } else if (!this.f11105f.isEmpty()) {
                this.f11105f.peek().d(pop);
            }
        }
        if (this.f11108i != 2) {
            n();
        }
    }

    private void v() {
        x4.a aVar;
        if (this.f11122w == 2 && (this.f11100a & 2) != 0) {
            k4.k kVar = (k4.k) a6.a.e(this.f11117r);
            b0 e10 = kVar.e(0, 4);
            if (this.f11123x == null) {
                aVar = null;
            } else {
                aVar = new x4.a(this.f11123x);
            }
            e10.d(new j.b().X(aVar).E());
            kVar.o();
            kVar.i(new y.b(-9223372036854775807L));
        }
    }

    private static int w(a6.y yVar) {
        yVar.O(8);
        int l10 = l(yVar.m());
        if (l10 != 0) {
            return l10;
        }
        yVar.P(4);
        while (yVar.a() > 0) {
            int l11 = l(yVar.m());
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    private void x(a.C0191a aVar) {
        x4.a aVar2;
        x4.a aVar3;
        int i10;
        List<r> list;
        ArrayList arrayList;
        int i11;
        a.C0191a aVar4 = aVar;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f11122w == 1;
        u uVar = new u();
        a.b g10 = aVar4.g(1969517665);
        if (g10 != null) {
            Pair<x4.a, x4.a> A = b.A(g10);
            x4.a aVar5 = (x4.a) A.first;
            x4.a aVar6 = (x4.a) A.second;
            if (aVar5 != null) {
                uVar.c(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        a.C0191a f10 = aVar4.f(1835365473);
        x4.a m10 = f10 != null ? b.m(f10) : null;
        List<r> z11 = b.z(aVar, uVar, -9223372036854775807L, (h) null, (this.f11100a & 1) != 0, z10, j.f16314h);
        k4.k kVar = (k4.k) a6.a.e(this.f11117r);
        int size = z11.size();
        int i12 = 0;
        int i13 = -1;
        long j10 = -9223372036854775807L;
        while (i12 < size) {
            r rVar = z11.get(i12);
            if (rVar.f11176b == 0) {
                list = z11;
                i10 = size;
                arrayList = arrayList2;
            } else {
                o oVar = rVar.f11175a;
                int i14 = i13;
                arrayList = arrayList2;
                long j11 = oVar.f11144e;
                if (j11 == -9223372036854775807L) {
                    j11 = rVar.f11182h;
                }
                long max = Math.max(j10, j11);
                list = z11;
                i10 = size;
                a aVar7 = new a(oVar, rVar, kVar.e(i12, oVar.f11141b));
                long j12 = max;
                j.b b10 = oVar.f11145f.b();
                b10.W(rVar.f11179e + 30);
                if (oVar.f11141b == 2 && j11 > 0 && (i11 = rVar.f11176b) > 1) {
                    b10.P(((float) i11) / (((float) j11) / 1000000.0f));
                }
                h.k(oVar.f11141b, uVar, b10);
                int i15 = oVar.f11141b;
                x4.a[] aVarArr = new x4.a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f11107h.isEmpty() ? null : new x4.a((List<? extends a.b>) this.f11107h);
                h.l(i15, aVar2, m10, b10, aVarArr);
                aVar7.f11126c.d(b10.E());
                int i16 = i14;
                if (oVar.f11141b == 2) {
                    if (i16 == -1) {
                        i13 = arrayList.size();
                        arrayList.add(aVar7);
                        j10 = j12;
                    }
                }
                i13 = i16;
                arrayList.add(aVar7);
                j10 = j12;
            }
            i12++;
            arrayList2 = arrayList;
            z11 = list;
            size = i10;
        }
        this.f11120u = i13;
        this.f11121v = j10;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.f11118s = aVarArr2;
        this.f11119t = m(aVarArr2);
        kVar.o();
        kVar.i(this);
    }

    private void y(long j10) {
        if (this.f11109j == 1836086884) {
            int i10 = this.f11111l;
            this.f11123x = new b(0, j10, -9223372036854775807L, j10 + ((long) i10), this.f11110k - ((long) i10));
        }
    }

    private boolean z(k4.j jVar) {
        a.C0191a peek;
        if (this.f11111l == 0) {
            if (!jVar.b(this.f11104e.d(), 0, 8, true)) {
                v();
                return false;
            }
            this.f11111l = 8;
            this.f11104e.O(0);
            this.f11110k = this.f11104e.E();
            this.f11109j = this.f11104e.m();
        }
        long j10 = this.f11110k;
        if (j10 == 1) {
            jVar.readFully(this.f11104e.d(), 8, 8);
            this.f11111l += 8;
            this.f11110k = this.f11104e.H();
        } else if (j10 == 0) {
            long a10 = jVar.a();
            if (a10 == -1 && (peek = this.f11105f.peek()) != null) {
                a10 = peek.f11019b;
            }
            if (a10 != -1) {
                this.f11110k = (a10 - jVar.getPosition()) + ((long) this.f11111l);
            }
        }
        if (this.f11110k >= ((long) this.f11111l)) {
            if (D(this.f11109j)) {
                long position = jVar.getPosition();
                long j11 = this.f11110k;
                int i10 = this.f11111l;
                long j12 = (position + j11) - ((long) i10);
                if (j11 != ((long) i10) && this.f11109j == 1835365473) {
                    t(jVar);
                }
                this.f11105f.push(new a.C0191a(this.f11109j, j12));
                if (this.f11110k == ((long) this.f11111l)) {
                    u(j12);
                } else {
                    n();
                }
            } else if (E(this.f11109j)) {
                a6.a.f(this.f11111l == 8);
                a6.a.f(this.f11110k <= 2147483647L);
                a6.y yVar = new a6.y((int) this.f11110k);
                System.arraycopy(this.f11104e.d(), 0, yVar.d(), 0, 8);
                this.f11112m = yVar;
                this.f11108i = 1;
            } else {
                y(jVar.getPosition() - ((long) this.f11111l));
                this.f11112m = null;
                this.f11108i = 1;
            }
            return true;
        }
        throw ParserException.d("Atom size less than header length (unsupported).");
    }

    public void b(long j10, long j11) {
        this.f11105f.clear();
        this.f11111l = 0;
        this.f11113n = -1;
        this.f11114o = 0;
        this.f11115p = 0;
        this.f11116q = 0;
        if (j10 == 0) {
            if (this.f11108i != 3) {
                n();
                return;
            }
            this.f11106g.g();
            this.f11107h.clear();
        } else if (this.f11118s != null) {
            F(j11);
        }
    }

    public void c(k4.k kVar) {
        this.f11117r = kVar;
    }

    public boolean d(k4.j jVar) {
        return n.d(jVar, (this.f11100a & 2) != 0);
    }

    public boolean f() {
        return true;
    }

    public int g(k4.j jVar, x xVar) {
        while (true) {
            int i10 = this.f11108i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return B(jVar, xVar);
                    }
                    if (i10 == 3) {
                        return C(jVar, xVar);
                    }
                    throw new IllegalStateException();
                } else if (A(jVar, xVar)) {
                    return 1;
                }
            } else if (!z(jVar)) {
                return -1;
            }
        }
    }

    public y.a h(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        if (((a[]) a6.a.e(this.f11118s)).length == 0) {
            return new y.a(z.f9632c);
        }
        int i10 = this.f11120u;
        if (i10 != -1) {
            r rVar = this.f11118s[i10].f11125b;
            int o10 = o(rVar, j10);
            if (o10 == -1) {
                return new y.a(z.f9632c);
            }
            long j15 = rVar.f11180f[o10];
            j11 = rVar.f11177c[o10];
            if (j15 >= j10 || o10 >= rVar.f11176b - 1 || (b10 = rVar.b(j10)) == -1 || b10 == o10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = rVar.f11180f[b10];
                j14 = rVar.f11177c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f11118s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f11120u) {
                r rVar2 = aVarArr[i11].f11125b;
                long s10 = s(rVar2, j10, j11);
                if (j13 != -9223372036854775807L) {
                    j12 = s(rVar2, j13, j12);
                }
                j11 = s10;
            }
            i11++;
        }
        z zVar = new z(j10, j11);
        if (j13 == -9223372036854775807L) {
            return new y.a(zVar);
        }
        return new y.a(zVar, new z(j13, j12));
    }

    public long i() {
        return this.f11121v;
    }

    public void release() {
    }

    public k(int i10) {
        this.f11100a = i10;
        this.f11108i = (i10 & 4) != 0 ? 3 : 0;
        this.f11106g = new m();
        this.f11107h = new ArrayList();
        this.f11104e = new a6.y(16);
        this.f11105f = new ArrayDeque<>();
        this.f11101b = new a6.y(a6.u.f244a);
        this.f11102c = new a6.y(4);
        this.f11103d = new a6.y();
        this.f11113n = -1;
    }
}
