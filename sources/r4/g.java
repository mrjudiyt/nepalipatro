package r4;

import a6.i0;
import a6.m0;
import a6.p;
import a6.u;
import a6.y;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.h;
import com.google.android.gms.common.api.Api;
import e4.j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.b0;
import k4.d;
import k4.i;
import k4.k;
import k4.o;
import k4.x;
import k4.y;
import r4.a;
import z4.c;

/* compiled from: FragmentedMp4Extractor */
public class g implements i {
    public static final o I = e.f16311b;
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final j K = new j.b().e0("application/x-emsg").E();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private k E;
    private b0[] F;
    private b0[] G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final int f11058a;

    /* renamed from: b  reason: collision with root package name */
    private final o f11059b;

    /* renamed from: c  reason: collision with root package name */
    private final List<j> f11060c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<b> f11061d;

    /* renamed from: e  reason: collision with root package name */
    private final y f11062e;

    /* renamed from: f  reason: collision with root package name */
    private final y f11063f;

    /* renamed from: g  reason: collision with root package name */
    private final y f11064g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f11065h;

    /* renamed from: i  reason: collision with root package name */
    private final y f11066i;

    /* renamed from: j  reason: collision with root package name */
    private final i0 f11067j;

    /* renamed from: k  reason: collision with root package name */
    private final c f11068k;

    /* renamed from: l  reason: collision with root package name */
    private final y f11069l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<a.C0191a> f11070m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque<a> f11071n;

    /* renamed from: o  reason: collision with root package name */
    private final b0 f11072o;

    /* renamed from: p  reason: collision with root package name */
    private int f11073p;

    /* renamed from: q  reason: collision with root package name */
    private int f11074q;

    /* renamed from: r  reason: collision with root package name */
    private long f11075r;

    /* renamed from: s  reason: collision with root package name */
    private int f11076s;

    /* renamed from: t  reason: collision with root package name */
    private y f11077t;

    /* renamed from: u  reason: collision with root package name */
    private long f11078u;

    /* renamed from: v  reason: collision with root package name */
    private int f11079v;

    /* renamed from: w  reason: collision with root package name */
    private long f11080w;

    /* renamed from: x  reason: collision with root package name */
    private long f11081x;

    /* renamed from: y  reason: collision with root package name */
    private long f11082y;

    /* renamed from: z  reason: collision with root package name */
    private b f11083z;

    /* compiled from: FragmentedMp4Extractor */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f11084a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11085b;

        public a(long j10, int i10) {
            this.f11084a = j10;
            this.f11085b = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f11086a;

        /* renamed from: b  reason: collision with root package name */
        public final q f11087b = new q();

        /* renamed from: c  reason: collision with root package name */
        public final y f11088c = new y();

        /* renamed from: d  reason: collision with root package name */
        public r f11089d;

        /* renamed from: e  reason: collision with root package name */
        public c f11090e;

        /* renamed from: f  reason: collision with root package name */
        public int f11091f;

        /* renamed from: g  reason: collision with root package name */
        public int f11092g;

        /* renamed from: h  reason: collision with root package name */
        public int f11093h;

        /* renamed from: i  reason: collision with root package name */
        public int f11094i;

        /* renamed from: j  reason: collision with root package name */
        private final y f11095j = new y(1);

        /* renamed from: k  reason: collision with root package name */
        private final y f11096k = new y();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f11097l;

        public b(b0 b0Var, r rVar, c cVar) {
            this.f11086a = b0Var;
            this.f11089d = rVar;
            this.f11090e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f11097l) {
                i10 = this.f11089d.f11181g[this.f11091f];
            } else {
                i10 = this.f11087b.f11167l[this.f11091f] ? 1 : 0;
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            if (!this.f11097l) {
                return this.f11089d.f11177c[this.f11091f];
            }
            return this.f11087b.f11162g[this.f11093h];
        }

        public long e() {
            if (!this.f11097l) {
                return this.f11089d.f11180f[this.f11091f];
            }
            return this.f11087b.c(this.f11091f);
        }

        public int f() {
            if (!this.f11097l) {
                return this.f11089d.f11178d[this.f11091f];
            }
            return this.f11087b.f11164i[this.f11091f];
        }

        public p g() {
            if (!this.f11097l) {
                return null;
            }
            int i10 = ((c) m0.j(this.f11087b.f11156a)).f11048a;
            p pVar = this.f11087b.f11170o;
            if (pVar == null) {
                pVar = this.f11089d.f11175a.a(i10);
            }
            if (pVar == null || !pVar.f11151a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f11091f++;
            if (!this.f11097l) {
                return false;
            }
            int i10 = this.f11092g + 1;
            this.f11092g = i10;
            int[] iArr = this.f11087b.f11163h;
            int i11 = this.f11093h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f11093h = i11 + 1;
            this.f11092g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            y yVar;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f11154d;
            if (i12 != 0) {
                yVar = this.f11087b.f11171p;
            } else {
                byte[] bArr = (byte[]) m0.j(g10.f11155e);
                this.f11096k.M(bArr, bArr.length);
                y yVar2 = this.f11096k;
                i12 = bArr.length;
                yVar = yVar2;
            }
            boolean g11 = this.f11087b.g(this.f11091f);
            boolean z10 = g11 || i11 != 0;
            this.f11095j.d()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f11095j.O(0);
            this.f11086a.f(this.f11095j, 1, 1);
            this.f11086a.f(yVar, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f11088c.K(8);
                byte[] d10 = this.f11088c.d();
                d10[0] = 0;
                d10[1] = 1;
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                d10[4] = (byte) ((i10 >> 24) & 255);
                d10[5] = (byte) ((i10 >> 16) & 255);
                d10[6] = (byte) ((i10 >> 8) & 255);
                d10[7] = (byte) (i10 & 255);
                this.f11086a.f(this.f11088c, 8, 1);
                return i12 + 1 + 8;
            }
            y yVar3 = this.f11087b.f11171p;
            int I = yVar3.I();
            yVar3.P(-2);
            int i13 = (I * 6) + 2;
            if (i11 != 0) {
                this.f11088c.K(i13);
                byte[] d11 = this.f11088c.d();
                yVar3.j(d11, 0, i13);
                int i14 = (((d11[2] & 255) << 8) | (d11[3] & 255)) + i11;
                d11[2] = (byte) ((i14 >> 8) & 255);
                d11[3] = (byte) (i14 & 255);
                yVar3 = this.f11088c;
            }
            this.f11086a.f(yVar3, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(r rVar, c cVar) {
            this.f11089d = rVar;
            this.f11090e = cVar;
            this.f11086a.d(rVar.f11175a.f11145f);
            k();
        }

        public void k() {
            this.f11087b.f();
            this.f11091f = 0;
            this.f11093h = 0;
            this.f11092g = 0;
            this.f11094i = 0;
            this.f11097l = false;
        }

        public void l(long j10) {
            int i10 = this.f11091f;
            while (true) {
                q qVar = this.f11087b;
                if (i10 < qVar.f11161f && qVar.c(i10) < j10) {
                    if (this.f11087b.f11167l[i10]) {
                        this.f11094i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            p g10 = g();
            if (g10 != null) {
                y yVar = this.f11087b.f11171p;
                int i10 = g10.f11154d;
                if (i10 != 0) {
                    yVar.P(i10);
                }
                if (this.f11087b.g(this.f11091f)) {
                    yVar.P(yVar.I() * 6);
                }
            }
        }

        public void n(h hVar) {
            p a10 = this.f11089d.f11175a.a(((c) m0.j(this.f11087b.f11156a)).f11048a);
            this.f11086a.d(this.f11089d.f11175a.f11145f.b().L(hVar.d(a10 != null ? a10.f11152b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    private static Pair<Long, d> A(y yVar, long j10) {
        long j11;
        long j12;
        y yVar2 = yVar;
        yVar2.O(8);
        int c10 = a.c(yVar.m());
        yVar2.P(4);
        long E2 = yVar.E();
        if (c10 == 0) {
            j12 = yVar.E();
            j11 = yVar.E();
        } else {
            j12 = yVar.H();
            j11 = yVar.H();
        }
        long j13 = j12;
        long j14 = j10 + j11;
        long C0 = m0.C0(j13, 1000000, E2);
        yVar2.P(2);
        int I2 = yVar.I();
        int[] iArr = new int[I2];
        long[] jArr = new long[I2];
        long[] jArr2 = new long[I2];
        long[] jArr3 = new long[I2];
        long j15 = j13;
        long j16 = C0;
        int i10 = 0;
        while (i10 < I2) {
            int m10 = yVar.m();
            if ((m10 & Integer.MIN_VALUE) == 0) {
                long E3 = yVar.E();
                iArr[i10] = m10 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i10] = j14;
                jArr3[i10] = j16;
                long j17 = j15 + E3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = I2;
                int[] iArr2 = iArr;
                long C02 = m0.C0(j17, 1000000, E2);
                jArr4[i10] = C02 - jArr5[i10];
                yVar2.P(4);
                j14 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                I2 = i11;
                long j18 = C02;
                j15 = j17;
                j16 = j18;
            } else {
                throw ParserException.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(C0), new d(iArr, jArr, jArr2, jArr3));
    }

    private static long B(y yVar) {
        yVar.O(8);
        return a.c(yVar.m()) == 1 ? yVar.H() : yVar.E();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<r4.g$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static r4.g.b C(a6.y r4, android.util.SparseArray<r4.g.b> r5, boolean r6) {
        /*
            r0 = 8
            r4.O(r0)
            int r0 = r4.m()
            int r0 = r4.a.b(r0)
            int r1 = r4.m()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            r4.g$b r5 = (r4.g.b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0031
            long r1 = r4.H()
            r4.q r6 = r5.f11087b
            r6.f11158c = r1
            r6.f11159d = r1
        L_0x0031:
            r4.c r6 = r5.f11090e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x003e
            int r1 = r4.m()
            int r1 = r1 + -1
            goto L_0x0040
        L_0x003e:
            int r1 = r6.f11048a
        L_0x0040:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0049
            int r2 = r4.m()
            goto L_0x004b
        L_0x0049:
            int r2 = r6.f11049b
        L_0x004b:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0054
            int r3 = r4.m()
            goto L_0x0056
        L_0x0054:
            int r3 = r6.f11050c
        L_0x0056:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005f
            int r4 = r4.m()
            goto L_0x0061
        L_0x005f:
            int r4 = r6.f11051d
        L_0x0061:
            r4.q r6 = r5.f11087b
            r4.c r0 = new r4.c
            r0.<init>(r1, r2, r3, r4)
            r6.f11156a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.g.C(a6.y, android.util.SparseArray, boolean):r4.g$b");
    }

    private static void D(a.C0191a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b C2 = C(((a.b) a6.a.e(aVar.g(1952868452))).f11022b, sparseArray, z10);
        if (C2 != null) {
            q qVar = C2.f11087b;
            long j10 = qVar.f11173r;
            boolean z11 = qVar.f11174s;
            C2.k();
            boolean unused = C2.f11097l = true;
            a.b g10 = aVar.g(1952867444);
            if (g10 == null || (i10 & 2) != 0) {
                qVar.f11173r = j10;
                qVar.f11174s = z11;
            } else {
                qVar.f11173r = B(g10.f11022b);
                qVar.f11174s = true;
            }
            G(aVar, C2, i10);
            p a10 = C2.f11089d.f11175a.a(((c) a6.a.e(qVar.f11156a)).f11048a);
            a.b g11 = aVar.g(1935763834);
            if (g11 != null) {
                w((p) a6.a.e(a10), g11.f11022b, qVar);
            }
            a.b g12 = aVar.g(1935763823);
            if (g12 != null) {
                v(g12.f11022b, qVar);
            }
            a.b g13 = aVar.g(1936027235);
            if (g13 != null) {
                z(g13.f11022b, qVar);
            }
            x(aVar, a10 != null ? a10.f11152b : null, qVar);
            int size = aVar.f11020c.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f11020c.get(i11);
                if (bVar.f11018a == 1970628964) {
                    H(bVar.f11022b, qVar, bArr);
                }
            }
        }
    }

    private static Pair<Integer, c> E(y yVar) {
        yVar.O(12);
        return Pair.create(Integer.valueOf(yVar.m()), new c(yVar.m() - 1, yVar.m(), yVar.m(), yVar.m()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int F(r4.g.b r36, int r37, int r38, a6.y r39, int r40) {
        /*
            r0 = r36
            r1 = 8
            r2 = r39
            r2.O(r1)
            int r1 = r39.m()
            int r1 = r4.a.b(r1)
            r4.r r3 = r0.f11089d
            r4.o r3 = r3.f11175a
            r4.q r4 = r0.f11087b
            r4.c r5 = r4.f11156a
            java.lang.Object r5 = a6.m0.j(r5)
            r4.c r5 = (r4.c) r5
            int[] r6 = r4.f11163h
            int r7 = r39.G()
            r6[r37] = r7
            long[] r6 = r4.f11162g
            long r7 = r4.f11158c
            r6[r37] = r7
            r7 = r1 & 1
            if (r7 == 0) goto L_0x003b
            r7 = r6[r37]
            int r9 = r39.m()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r37] = r7
        L_0x003b:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            int r9 = r5.f11051d
            if (r6 == 0) goto L_0x004c
            int r9 = r39.m()
        L_0x004c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0059
            r11 = 1
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            long[] r13 = r3.f11147h
            if (r13 == 0) goto L_0x008d
            int r14 = r13.length
            if (r14 != r8) goto L_0x008d
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x008f
            long[] r13 = r3.f11148i
            java.lang.Object r13 = a6.m0.j(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3.f11142c
            r18 = r7
            long r14 = a6.m0.C0(r14, r16, r18)
            goto L_0x0091
        L_0x008d:
            r16 = 0
        L_0x008f:
            r14 = r16
        L_0x0091:
            int[] r7 = r4.f11164i
            int[] r8 = r4.f11165j
            long[] r13 = r4.f11166k
            boolean[] r2 = r4.f11167l
            r17 = r9
            int r9 = r3.f11141b
            r18 = r2
            r2 = 2
            if (r9 != r2) goto L_0x00a9
            r2 = 1
            r9 = r38 & 1
            if (r9 == 0) goto L_0x00a9
            r2 = 1
            goto L_0x00aa
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            int[] r9 = r4.f11163h
            r9 = r9[r37]
            int r9 = r40 + r9
            r38 = r2
            long r2 = r3.f11142c
            r27 = r14
            r15 = r13
            long r13 = r4.f11173r
            r29 = r13
            r13 = r40
        L_0x00bd:
            if (r13 >= r9) goto L_0x0162
            if (r10 == 0) goto L_0x00c6
            int r14 = r39.m()
            goto L_0x00c8
        L_0x00c6:
            int r14 = r5.f11049b
        L_0x00c8:
            int r14 = e(r14)
            if (r11 == 0) goto L_0x00d9
            int r19 = r39.m()
            r35 = r19
            r19 = r10
            r10 = r35
            goto L_0x00dd
        L_0x00d9:
            r19 = r10
            int r10 = r5.f11050c
        L_0x00dd:
            int r10 = e(r10)
            if (r12 == 0) goto L_0x00ec
            int r21 = r39.m()
            r31 = r6
            r6 = r21
            goto L_0x00f9
        L_0x00ec:
            if (r13 != 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
            r31 = r6
            r6 = r17
            goto L_0x00f9
        L_0x00f5:
            r31 = r6
            int r6 = r5.f11051d
        L_0x00f9:
            if (r1 == 0) goto L_0x0112
            r32 = r1
            int r1 = r39.m()
            r33 = r11
            r34 = r12
            long r11 = (long) r1
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r21
            long r11 = r11 / r2
            int r1 = (int) r11
            r8[r13] = r1
            r16 = 0
            goto L_0x011c
        L_0x0112:
            r32 = r1
            r33 = r11
            r34 = r12
            r16 = 0
            r8[r13] = r16
        L_0x011c:
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r29
            r25 = r2
            long r11 = a6.m0.C0(r21, r23, r25)
            long r11 = r11 - r27
            r15[r13] = r11
            boolean r1 = r4.f11174s
            if (r1 != 0) goto L_0x0138
            r11 = r15[r13]
            r4.r r1 = r0.f11089d
            long r0 = r1.f11182h
            long r11 = r11 + r0
            r15[r13] = r11
        L_0x0138:
            r7[r13] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0146
            if (r38 == 0) goto L_0x0144
            if (r13 != 0) goto L_0x0146
        L_0x0144:
            r0 = 1
            goto L_0x0147
        L_0x0146:
            r0 = 0
        L_0x0147:
            r18[r13] = r0
            long r10 = (long) r14
            r20 = r2
            r1 = r29
            long r29 = r1 + r10
            int r13 = r13 + 1
            r0 = r36
            r10 = r19
            r2 = r20
            r6 = r31
            r1 = r32
            r11 = r33
            r12 = r34
            goto L_0x00bd
        L_0x0162:
            r1 = r29
            r4.f11173r = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.g.F(r4.g$b, int, int, a6.y, int):int");
    }

    private static void G(a.C0191a aVar, b bVar, int i10) {
        List<a.b> list = aVar.f11020c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f11018a == 1953658222) {
                y yVar = bVar2.f11022b;
                yVar.O(12);
                int G2 = yVar.G();
                if (G2 > 0) {
                    i12 += G2;
                    i11++;
                }
            }
        }
        bVar.f11093h = 0;
        bVar.f11092g = 0;
        bVar.f11091f = 0;
        bVar.f11087b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f11018a == 1953658222) {
                i15 = F(bVar, i14, i10, bVar3.f11022b, i15);
                i14++;
            }
        }
    }

    private static void H(y yVar, q qVar, byte[] bArr) {
        yVar.O(8);
        yVar.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            y(yVar, 16, qVar);
        }
    }

    private void I(long j10) {
        while (!this.f11070m.isEmpty() && this.f11070m.peek().f11019b == j10) {
            n(this.f11070m.pop());
        }
        f();
    }

    private boolean J(k4.j jVar) {
        if (this.f11076s == 0) {
            if (!jVar.b(this.f11069l.d(), 0, 8, true)) {
                return false;
            }
            this.f11076s = 8;
            this.f11069l.O(0);
            this.f11075r = this.f11069l.E();
            this.f11074q = this.f11069l.m();
        }
        long j10 = this.f11075r;
        if (j10 == 1) {
            jVar.readFully(this.f11069l.d(), 8, 8);
            this.f11076s += 8;
            this.f11075r = this.f11069l.H();
        } else if (j10 == 0) {
            long a10 = jVar.a();
            if (a10 == -1 && !this.f11070m.isEmpty()) {
                a10 = this.f11070m.peek().f11019b;
            }
            if (a10 != -1) {
                this.f11075r = (a10 - jVar.getPosition()) + ((long) this.f11076s);
            }
        }
        if (this.f11075r >= ((long) this.f11076s)) {
            long position = jVar.getPosition() - ((long) this.f11076s);
            int i10 = this.f11074q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.H) {
                this.E.i(new y.b(this.f11081x, position));
                this.H = true;
            }
            if (this.f11074q == 1836019558) {
                int size = this.f11061d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar = this.f11061d.valueAt(i11).f11087b;
                    qVar.f11157b = position;
                    qVar.f11159d = position;
                    qVar.f11158c = position;
                }
            }
            int i12 = this.f11074q;
            if (i12 == 1835295092) {
                this.f11083z = null;
                this.f11078u = position + this.f11075r;
                this.f11073p = 2;
                return true;
            }
            if (N(i12)) {
                long position2 = (jVar.getPosition() + this.f11075r) - 8;
                this.f11070m.push(new a.C0191a(this.f11074q, position2));
                if (this.f11075r == ((long) this.f11076s)) {
                    I(position2);
                } else {
                    f();
                }
            } else if (O(this.f11074q)) {
                if (this.f11076s == 8) {
                    long j11 = this.f11075r;
                    if (j11 <= 2147483647L) {
                        a6.y yVar = new a6.y((int) j11);
                        System.arraycopy(this.f11069l.d(), 0, yVar.d(), 0, 8);
                        this.f11077t = yVar;
                        this.f11073p = 1;
                    } else {
                        throw ParserException.d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ParserException.d("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f11075r <= 2147483647L) {
                this.f11077t = null;
                this.f11073p = 1;
            } else {
                throw ParserException.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ParserException.d("Atom size less than header length (unsupported).");
    }

    private void K(k4.j jVar) {
        int i10 = ((int) this.f11075r) - this.f11076s;
        a6.y yVar = this.f11077t;
        if (yVar != null) {
            jVar.readFully(yVar.d(), 8, i10);
            p(new a.b(this.f11074q, yVar), jVar.getPosition());
        } else {
            jVar.l(i10);
        }
        I(jVar.getPosition());
    }

    private void L(k4.j jVar) {
        int size = this.f11061d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f11061d.valueAt(i10).f11087b;
            if (qVar.f11172q) {
                long j11 = qVar.f11159d;
                if (j11 < j10) {
                    bVar = this.f11061d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f11073p = 3;
            return;
        }
        int position = (int) (j10 - jVar.getPosition());
        if (position >= 0) {
            jVar.l(position);
            bVar.f11087b.b(jVar);
            return;
        }
        throw ParserException.a("Offset to encryption data was negative.", (Throwable) null);
    }

    private boolean M(k4.j jVar) {
        int i10;
        k4.j jVar2 = jVar;
        b bVar = this.f11083z;
        Throwable th = null;
        if (bVar == null) {
            bVar = j(this.f11061d);
            if (bVar == null) {
                int position = (int) (this.f11078u - jVar.getPosition());
                if (position >= 0) {
                    jVar2.l(position);
                    f();
                    return false;
                }
                throw ParserException.a("Offset to end of mdat was negative.", (Throwable) null);
            }
            int d10 = (int) (bVar.d() - jVar.getPosition());
            if (d10 < 0) {
                p.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            jVar2.l(d10);
            this.f11083z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f11073p == 3) {
            int f10 = bVar.f();
            this.A = f10;
            if (bVar.f11091f < bVar.f11094i) {
                jVar2.l(f10);
                bVar.m();
                if (!bVar.h()) {
                    this.f11083z = null;
                }
                this.f11073p = 3;
                return true;
            }
            if (bVar.f11089d.f11175a.f11146g == 1) {
                this.A = f10 - 8;
                jVar2.l(8);
            }
            if ("audio/ac4".equals(bVar.f11089d.f11175a.f11145f.f8096s)) {
                this.B = bVar.i(this.A, 7);
                g4.c.a(this.A, this.f11066i);
                bVar.f11086a.a(this.f11066i, 7);
                this.B += 7;
            } else {
                this.B = bVar.i(this.A, 0);
            }
            this.A += this.B;
            this.f11073p = 4;
            this.C = 0;
        }
        o oVar = bVar.f11089d.f11175a;
        b0 b0Var = bVar.f11086a;
        long e10 = bVar.e();
        i0 i0Var = this.f11067j;
        if (i0Var != null) {
            e10 = i0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f11149j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += b0Var.c(jVar2, i14 - i13, false);
            }
        } else {
            byte[] d11 = this.f11063f.d();
            d11[0] = 0;
            d11[1] = 0;
            d11[2] = 0;
            int i15 = oVar.f11149j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    jVar2.readFully(d11, i17, i16);
                    this.f11063f.O(0);
                    int m10 = this.f11063f.m();
                    if (m10 >= i12) {
                        this.C = m10 - 1;
                        this.f11062e.O(0);
                        b0Var.a(this.f11062e, i11);
                        b0Var.a(this.f11063f, i12);
                        this.D = this.G.length > 0 && u.g(oVar.f11145f.f8096s, d11[i11]);
                        this.B += 5;
                        this.A += i17;
                    } else {
                        throw ParserException.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f11064g.K(i18);
                        jVar2.readFully(this.f11064g.d(), 0, this.C);
                        b0Var.a(this.f11064g, this.C);
                        i10 = this.C;
                        int k10 = u.k(this.f11064g.d(), this.f11064g.f());
                        this.f11064g.O("video/hevc".equals(oVar.f11145f.f8096s) ? 1 : 0);
                        this.f11064g.N(k10);
                        k4.c.a(j10, this.f11064g, this.G);
                    } else {
                        i10 = b0Var.c(jVar2, i18, false);
                    }
                    this.B += i10;
                    this.C -= i10;
                    th = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c10 = bVar.c();
        p g10 = bVar.g();
        b0Var.e(j10, c10, this.A, 0, g10 != null ? g10.f11153c : null);
        s(j10);
        if (!bVar.h()) {
            this.f11083z = null;
        }
        this.f11073p = 3;
        return true;
    }

    private static boolean N(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean O(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int e(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i10);
        throw ParserException.a(sb.toString(), (Throwable) null);
    }

    private void f() {
        this.f11073p = 0;
        this.f11076s = 0;
    }

    private c h(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) a6.a.e(sparseArray.get(i10));
    }

    private static h i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f11018a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f11022b.d();
                UUID f10 = l.f(d10);
                if (f10 == null) {
                    p.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new h.b(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new h((List<h.b>) arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f11097l || valueAt.f11091f != valueAt.f11089d.f11176b) && (!valueAt.f11097l || valueAt.f11093h != valueAt.f11087b.f11160e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i10;
        b0[] b0VarArr = new b0[2];
        this.F = b0VarArr;
        b0 b0Var = this.f11072o;
        int i11 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f11058a & 4) != 0) {
            b0VarArr[i10] = this.E.e(100, 5);
            i10++;
            i12 = 101;
        }
        b0[] b0VarArr2 = (b0[]) m0.v0(this.F, i10);
        this.F = b0VarArr2;
        for (b0 d10 : b0VarArr2) {
            d10.d(K);
        }
        this.G = new b0[this.f11060c.size()];
        while (i11 < this.G.length) {
            b0 e10 = this.E.e(i12, 3);
            e10.d(this.f11060c.get(i11));
            this.G[i11] = e10;
            i11++;
            i12++;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] l() {
        return new i[]{new g()};
    }

    private void n(a.C0191a aVar) {
        int i10 = aVar.f11018a;
        if (i10 == 1836019574) {
            r(aVar);
        } else if (i10 == 1836019558) {
            q(aVar);
        } else if (!this.f11070m.isEmpty()) {
            this.f11070m.peek().d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(a6.y r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            k4.b0[] r2 = r0.F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.O(r2)
            int r2 = r27.m()
            int r2 = r4.a.c(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0076
            r5 = 1
            if (r2 == r5) goto L_0x003a
            r1 = 46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Skipping unsupported emsg version: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            a6.p.h(r2, r1)
            return
        L_0x003a:
            long r11 = r27.E()
            long r5 = r27.H()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r11
            long r13 = a6.m0.C0(r5, r7, r9)
            long r5 = r27.E()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = a6.m0.C0(r5, r7, r9)
            long r7 = r27.E()
            java.lang.String r2 = r27.w()
            java.lang.Object r2 = a6.a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = r27.w()
            java.lang.Object r9 = a6.a.e(r9)
            java.lang.String r9 = (java.lang.String) r9
            r19 = r2
            r21 = r5
            r23 = r7
            r20 = r9
            r7 = r3
            goto L_0x00c0
        L_0x0076:
            java.lang.String r2 = r27.w()
            java.lang.Object r2 = a6.a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r27.w()
            java.lang.Object r5 = a6.a.e(r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            long r5 = r27.E()
            long r10 = r27.E()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r5
            long r7 = a6.m0.C0(r10, r12, r14)
            long r10 = r0.f11082y
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00a5
            long r10 = r10 + r7
            r16 = r10
            goto L_0x00a7
        L_0x00a5:
            r16 = r3
        L_0x00a7:
            long r10 = r27.E()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = r5
            long r5 = a6.m0.C0(r10, r12, r14)
            long r10 = r27.E()
            r19 = r2
            r21 = r5
            r20 = r9
            r23 = r10
            r13 = r16
        L_0x00c0:
            int r2 = r27.a()
            byte[] r2 = new byte[r2]
            int r5 = r27.a()
            r6 = 0
            r1.j(r2, r6, r5)
            z4.a r1 = new z4.a
            r18 = r1
            r25 = r2
            r18.<init>(r19, r20, r21, r23, r25)
            a6.y r2 = new a6.y
            z4.c r5 = r0.f11068k
            byte[] r1 = r5.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            k4.b0[] r5 = r0.F
            int r9 = r5.length
            r10 = 0
        L_0x00ea:
            if (r10 >= r9) goto L_0x00f7
            r11 = r5[r10]
            r2.O(r6)
            r11.a(r2, r1)
            int r10 = r10 + 1
            goto L_0x00ea
        L_0x00f7:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010b
            java.util.ArrayDeque<r4.g$a> r2 = r0.f11071n
            r4.g$a r3 = new r4.g$a
            r3.<init>(r7, r1)
            r2.addLast(r3)
            int r2 = r0.f11079v
            int r2 = r2 + r1
            r0.f11079v = r2
            goto L_0x012a
        L_0x010b:
            a6.i0 r2 = r0.f11067j
            if (r2 == 0) goto L_0x0113
            long r13 = r2.a(r13)
        L_0x0113:
            k4.b0[] r2 = r0.F
            int r3 = r2.length
        L_0x0116:
            if (r6 >= r3) goto L_0x012a
            r15 = r2[r6]
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r13
            r19 = r1
            r15.e(r16, r18, r19, r20, r21)
            int r6 = r6 + 1
            goto L_0x0116
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.g.o(a6.y):void");
    }

    private void p(a.b bVar, long j10) {
        if (!this.f11070m.isEmpty()) {
            this.f11070m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f11018a;
        if (i10 == 1936286840) {
            Pair<Long, d> A2 = A(bVar.f11022b, j10);
            this.f11082y = ((Long) A2.first).longValue();
            this.E.i((k4.y) A2.second);
            this.H = true;
        } else if (i10 == 1701671783) {
            o(bVar.f11022b);
        }
    }

    private void q(a.C0191a aVar) {
        u(aVar, this.f11061d, this.f11059b != null, this.f11058a, this.f11065h);
        h i10 = i(aVar.f11020c);
        if (i10 != null) {
            int size = this.f11061d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f11061d.valueAt(i11).n(i10);
            }
        }
        if (this.f11080w != -9223372036854775807L) {
            int size2 = this.f11061d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f11061d.valueAt(i12).l(this.f11080w);
            }
            this.f11080w = -9223372036854775807L;
        }
    }

    private void r(a.C0191a aVar) {
        boolean z10 = true;
        int i10 = 0;
        a6.a.g(this.f11059b == null, "Unexpected moov box.");
        h i11 = i(aVar.f11020c);
        a.C0191a aVar2 = (a.C0191a) a6.a.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f11020c.size();
        long j10 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = aVar2.f11020c.get(i12);
            int i13 = bVar.f11018a;
            if (i13 == 1953654136) {
                Pair<Integer, c> E2 = E(bVar.f11022b);
                sparseArray.put(((Integer) E2.first).intValue(), (c) E2.second);
            } else if (i13 == 1835362404) {
                j10 = t(bVar.f11022b);
            }
        }
        List<r> z11 = b.z(aVar, new k4.u(), j10, i11, (this.f11058a & 16) != 0, false, new f(this));
        int size2 = z11.size();
        if (this.f11061d.size() == 0) {
            while (i10 < size2) {
                r rVar = z11.get(i10);
                o oVar = rVar.f11175a;
                this.f11061d.put(oVar.f11140a, new b(this.E.e(i10, oVar.f11141b), rVar, h(sparseArray, oVar.f11140a)));
                this.f11081x = Math.max(this.f11081x, oVar.f11144e);
                i10++;
            }
            this.E.o();
            return;
        }
        if (this.f11061d.size() != size2) {
            z10 = false;
        }
        a6.a.f(z10);
        while (i10 < size2) {
            r rVar2 = z11.get(i10);
            o oVar2 = rVar2.f11175a;
            this.f11061d.get(oVar2.f11140a).j(rVar2, h(sparseArray, oVar2.f11140a));
            i10++;
        }
    }

    private void s(long j10) {
        while (!this.f11071n.isEmpty()) {
            a removeFirst = this.f11071n.removeFirst();
            this.f11079v -= removeFirst.f11085b;
            long j11 = removeFirst.f11084a + j10;
            i0 i0Var = this.f11067j;
            if (i0Var != null) {
                j11 = i0Var.a(j11);
            }
            for (b0 e10 : this.F) {
                e10.e(j11, 1, removeFirst.f11085b, this.f11079v, (b0.a) null);
            }
        }
    }

    private static long t(a6.y yVar) {
        yVar.O(8);
        return a.c(yVar.m()) == 0 ? yVar.E() : yVar.H();
    }

    private static void u(a.C0191a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f11021d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0191a aVar2 = aVar.f11021d.get(i11);
            if (aVar2.f11018a == 1953653094) {
                D(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void v(a6.y yVar, q qVar) {
        yVar.O(8);
        int m10 = yVar.m();
        if ((a.b(m10) & 1) == 1) {
            yVar.P(8);
        }
        int G2 = yVar.G();
        if (G2 == 1) {
            qVar.f11159d += a.c(m10) == 0 ? yVar.E() : yVar.H();
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Unexpected saio entry count: ");
        sb.append(G2);
        throw ParserException.a(sb.toString(), (Throwable) null);
    }

    private static void w(p pVar, a6.y yVar, q qVar) {
        int i10;
        int i11 = pVar.f11154d;
        yVar.O(8);
        boolean z10 = true;
        if ((a.b(yVar.m()) & 1) == 1) {
            yVar.P(8);
        }
        int C2 = yVar.C();
        int G2 = yVar.G();
        int i12 = qVar.f11161f;
        if (G2 <= i12) {
            if (C2 == 0) {
                boolean[] zArr = qVar.f11169n;
                i10 = 0;
                for (int i13 = 0; i13 < G2; i13++) {
                    int C3 = yVar.C();
                    i10 += C3;
                    zArr[i13] = C3 > i11;
                }
            } else {
                if (C2 <= i11) {
                    z10 = false;
                }
                i10 = (C2 * G2) + 0;
                Arrays.fill(qVar.f11169n, 0, G2, z10);
            }
            Arrays.fill(qVar.f11169n, G2, qVar.f11161f, false);
            if (i10 > 0) {
                qVar.d(i10);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(78);
        sb.append("Saiz sample count ");
        sb.append(G2);
        sb.append(" is greater than fragment sample count");
        sb.append(i12);
        throw ParserException.a(sb.toString(), (Throwable) null);
    }

    private static void x(a.C0191a aVar, String str, q qVar) {
        a.C0191a aVar2 = aVar;
        q qVar2 = qVar;
        byte[] bArr = null;
        a6.y yVar = null;
        a6.y yVar2 = null;
        for (int i10 = 0; i10 < aVar2.f11020c.size(); i10++) {
            a.b bVar = aVar2.f11020c.get(i10);
            a6.y yVar3 = bVar.f11022b;
            int i11 = bVar.f11018a;
            if (i11 == 1935828848) {
                yVar3.O(12);
                if (yVar3.m() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (i11 == 1936158820) {
                yVar3.O(12);
                if (yVar3.m() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar != null && yVar2 != null) {
            yVar.O(8);
            int c10 = a.c(yVar.m());
            yVar.P(4);
            if (c10 == 1) {
                yVar.P(4);
            }
            if (yVar.m() == 1) {
                yVar2.O(8);
                int c11 = a.c(yVar2.m());
                yVar2.P(4);
                if (c11 == 1) {
                    if (yVar2.E() == 0) {
                        throw ParserException.d("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    yVar2.P(4);
                }
                if (yVar2.E() == 1) {
                    yVar2.P(1);
                    int C2 = yVar2.C();
                    int i12 = (C2 & 240) >> 4;
                    int i13 = C2 & 15;
                    boolean z10 = yVar2.C() == 1;
                    if (z10) {
                        int C3 = yVar2.C();
                        byte[] bArr2 = new byte[16];
                        yVar2.j(bArr2, 0, 16);
                        if (C3 == 0) {
                            int C4 = yVar2.C();
                            bArr = new byte[C4];
                            yVar2.j(bArr, 0, C4);
                        }
                        qVar2.f11168m = true;
                        qVar2.f11170o = new p(z10, str, C3, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw ParserException.d("Entry count in sgpd != 1 (unsupported).");
            }
            throw ParserException.d("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void y(a6.y yVar, int i10, q qVar) {
        yVar.O(i10 + 8);
        int b10 = a.b(yVar.m());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int G2 = yVar.G();
            if (G2 == 0) {
                Arrays.fill(qVar.f11169n, 0, qVar.f11161f, false);
                return;
            }
            int i11 = qVar.f11161f;
            if (G2 == i11) {
                Arrays.fill(qVar.f11169n, 0, G2, z10);
                qVar.d(yVar.a());
                qVar.a(yVar);
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(G2);
            sb.append(" is different from fragment sample count");
            sb.append(i11);
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
        throw ParserException.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void z(a6.y yVar, q qVar) {
        y(yVar, 0, qVar);
    }

    public void b(long j10, long j11) {
        int size = this.f11061d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11061d.valueAt(i10).k();
        }
        this.f11071n.clear();
        this.f11079v = 0;
        this.f11080w = j11;
        this.f11070m.clear();
        f();
    }

    public void c(k kVar) {
        this.E = kVar;
        f();
        k();
        o oVar = this.f11059b;
        if (oVar != null) {
            this.f11061d.put(0, new b(kVar.e(0, oVar.f11141b), new r(this.f11059b, new long[0], new int[0], 0, new long[0], new int[0], 0), new c(0, 0, 0, 0)));
            this.E.o();
        }
    }

    public boolean d(k4.j jVar) {
        return n.b(jVar);
    }

    public int g(k4.j jVar, x xVar) {
        while (true) {
            int i10 = this.f11073p;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(jVar);
                } else if (i10 == 2) {
                    L(jVar);
                } else if (M(jVar)) {
                    return 0;
                }
            } else if (!J(jVar)) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public o m(o oVar) {
        return oVar;
    }

    public void release() {
    }

    public g(int i10) {
        this(i10, (i0) null);
    }

    public g(int i10, i0 i0Var) {
        this(i10, i0Var, (o) null, Collections.emptyList());
    }

    public g(int i10, i0 i0Var, o oVar, List<j> list) {
        this(i10, i0Var, oVar, list, (b0) null);
    }

    public g(int i10, i0 i0Var, o oVar, List<j> list, b0 b0Var) {
        this.f11058a = i10;
        this.f11067j = i0Var;
        this.f11059b = oVar;
        this.f11060c = Collections.unmodifiableList(list);
        this.f11072o = b0Var;
        this.f11068k = new c();
        this.f11069l = new a6.y(16);
        this.f11062e = new a6.y(u.f244a);
        this.f11063f = new a6.y(5);
        this.f11064g = new a6.y();
        byte[] bArr = new byte[16];
        this.f11065h = bArr;
        this.f11066i = new a6.y(bArr);
        this.f11070m = new ArrayDeque<>();
        this.f11071n = new ArrayDeque<>();
        this.f11061d = new SparseArray<>();
        this.f11081x = -9223372036854775807L;
        this.f11080w = -9223372036854775807L;
        this.f11082y = -9223372036854775807L;
        this.E = k.f9598e;
        this.F = new b0[0];
        this.G = new b0[0];
    }
}
