package v4;

import a6.m0;
import a6.y;
import android.util.Pair;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.ParserException;
import e4.j;
import g4.w;
import k4.b0;
import k4.i;
import k4.k;
import k4.o;
import k4.x;

/* compiled from: WavExtractor */
public final class b implements i {

    /* renamed from: f  reason: collision with root package name */
    public static final o f12367f = a.f16737b;

    /* renamed from: a  reason: collision with root package name */
    private k f12368a;

    /* renamed from: b  reason: collision with root package name */
    private b0 f12369b;

    /* renamed from: c  reason: collision with root package name */
    private C0204b f12370c;

    /* renamed from: d  reason: collision with root package name */
    private int f12371d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f12372e = -1;

    /* compiled from: WavExtractor */
    private static final class a implements C0204b {

        /* renamed from: m  reason: collision with root package name */
        private static final int[] f12373m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n  reason: collision with root package name */
        private static final int[] f12374n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a  reason: collision with root package name */
        private final k f12375a;

        /* renamed from: b  reason: collision with root package name */
        private final b0 f12376b;

        /* renamed from: c  reason: collision with root package name */
        private final c f12377c;

        /* renamed from: d  reason: collision with root package name */
        private final int f12378d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f12379e;

        /* renamed from: f  reason: collision with root package name */
        private final y f12380f;

        /* renamed from: g  reason: collision with root package name */
        private final int f12381g;

        /* renamed from: h  reason: collision with root package name */
        private final j f12382h;

        /* renamed from: i  reason: collision with root package name */
        private int f12383i;

        /* renamed from: j  reason: collision with root package name */
        private long f12384j;

        /* renamed from: k  reason: collision with root package name */
        private int f12385k;

        /* renamed from: l  reason: collision with root package name */
        private long f12386l;

        public a(k kVar, b0 b0Var, c cVar) {
            this.f12375a = kVar;
            this.f12376b = b0Var;
            this.f12377c = cVar;
            int max = Math.max(1, cVar.f12397c / 10);
            this.f12381g = max;
            y yVar = new y(cVar.f12401g);
            yVar.u();
            int u10 = yVar.u();
            this.f12378d = u10;
            int i10 = cVar.f12396b;
            int i11 = (((cVar.f12399e - (i10 * 4)) * 8) / (cVar.f12400f * i10)) + 1;
            if (u10 == i11) {
                int l10 = m0.l(max, u10);
                this.f12379e = new byte[(cVar.f12399e * l10)];
                this.f12380f = new y(l10 * h(u10, i10));
                int i12 = ((cVar.f12397c * cVar.f12399e) * 8) / u10;
                this.f12382h = new j.b().e0("audio/raw").G(i12).Z(i12).W(h(max, i10)).H(cVar.f12396b).f0(cVar.f12397c).Y(2).E();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i11);
            sb.append("; got: ");
            sb.append(u10);
            throw ParserException.a(sb.toString(), (Throwable) null);
        }

        private void d(byte[] bArr, int i10, y yVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f12377c.f12396b; i12++) {
                    e(bArr, i11, i12, yVar.d());
                }
            }
            int g10 = g(this.f12378d * i10);
            yVar.O(0);
            yVar.N(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            c cVar = this.f12377c;
            int i12 = cVar.f12399e;
            int i13 = cVar.f12396b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f12374n[min];
            int i19 = ((i10 * this.f12378d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                byte b10 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i21 = i20 % 2 == 0 ? b10 & 15 : b10 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i18) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                i17 = m0.r(i17 + i22, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i23 = min + f12373m[i21];
                int[] iArr = f12374n;
                min = m0.r(i23, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f12377c.f12396b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f12377c.f12396b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long C0 = this.f12384j + m0.C0(this.f12386l, 1000000, (long) this.f12377c.f12397c);
            int g10 = g(i10);
            this.f12376b.e(C0, 1, g10, this.f12385k - g10, (b0.a) null);
            this.f12386l += (long) i10;
            this.f12385k -= g10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(k4.j r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f12381g
                int r1 = r6.f12385k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f12378d
                int r0 = a6.m0.l(r0, r1)
                v4.c r1 = r6.f12377c
                int r1 = r1.f12399e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.f12383i
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f12379e
                int r5 = r6.f12383i
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.f12383i
                int r4 = r4 + r3
                r6.f12383i = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.f12383i
                v4.c r8 = r6.f12377c
                int r8 = r8.f12399e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f12379e
                a6.y r9 = r6.f12380f
                r6.d(r8, r7, r9)
                int r8 = r6.f12383i
                v4.c r9 = r6.f12377c
                int r9 = r9.f12399e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f12383i = r8
                a6.y r7 = r6.f12380f
                int r7 = r7.f()
                k4.b0 r8 = r6.f12376b
                a6.y r9 = r6.f12380f
                r8.a(r9, r7)
                int r8 = r6.f12385k
                int r8 = r8 + r7
                r6.f12385k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f12381g
                if (r7 < r8) goto L_0x0077
                r6.i(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.f12385k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0084
                r6.i(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.b.a.a(k4.j, long):boolean");
        }

        public void b(long j10) {
            this.f12383i = 0;
            this.f12384j = j10;
            this.f12385k = 0;
            this.f12386l = 0;
        }

        public void c(int i10, long j10) {
            this.f12375a.i(new e(this.f12377c, this.f12378d, (long) i10, j10));
            this.f12376b.d(this.f12382h);
        }
    }

    /* renamed from: v4.b$b  reason: collision with other inner class name */
    /* compiled from: WavExtractor */
    private interface C0204b {
        boolean a(k4.j jVar, long j10);

        void b(long j10);

        void c(int i10, long j10);
    }

    /* compiled from: WavExtractor */
    private static final class c implements C0204b {

        /* renamed from: a  reason: collision with root package name */
        private final k f12387a;

        /* renamed from: b  reason: collision with root package name */
        private final b0 f12388b;

        /* renamed from: c  reason: collision with root package name */
        private final c f12389c;

        /* renamed from: d  reason: collision with root package name */
        private final j f12390d;

        /* renamed from: e  reason: collision with root package name */
        private final int f12391e;

        /* renamed from: f  reason: collision with root package name */
        private long f12392f;

        /* renamed from: g  reason: collision with root package name */
        private int f12393g;

        /* renamed from: h  reason: collision with root package name */
        private long f12394h;

        public c(k kVar, b0 b0Var, c cVar, String str, int i10) {
            this.f12387a = kVar;
            this.f12388b = b0Var;
            this.f12389c = cVar;
            int i11 = (cVar.f12396b * cVar.f12400f) / 8;
            int i12 = cVar.f12399e;
            if (i12 == i11) {
                int i13 = cVar.f12397c;
                int i14 = i13 * i11 * 8;
                int max = Math.max(i11, (i13 * i11) / 10);
                this.f12391e = max;
                this.f12390d = new j.b().e0(str).G(i14).Z(i14).W(max).H(cVar.f12396b).f0(cVar.f12397c).Y(i10).E();
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i11);
            sb.append("; got: ");
            sb.append(i12);
            throw ParserException.a(sb.toString(), (Throwable) null);
        }

        public boolean a(k4.j jVar, long j10) {
            int i10;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f12393g) >= (i12 = this.f12391e)) {
                    c cVar = this.f12389c;
                    int i13 = cVar.f12399e;
                    int i14 = this.f12393g / i13;
                } else {
                    int c10 = this.f12388b.c(jVar, (int) Math.min((long) (i12 - i11), j11), true);
                    if (c10 == -1) {
                        j11 = 0;
                    } else {
                        this.f12393g += c10;
                        j11 -= (long) c10;
                    }
                }
            }
            c cVar2 = this.f12389c;
            int i132 = cVar2.f12399e;
            int i142 = this.f12393g / i132;
            if (i142 > 0) {
                int i15 = i142 * i132;
                int i16 = this.f12393g - i15;
                this.f12388b.e(this.f12392f + m0.C0(this.f12394h, 1000000, (long) cVar2.f12397c), 1, i15, i16, (b0.a) null);
                this.f12394h += (long) i142;
                this.f12393g = i16;
            }
            if (i10 <= 0) {
                return true;
            }
            return false;
        }

        public void b(long j10) {
            this.f12392f = j10;
            this.f12393g = 0;
            this.f12394h = 0;
        }

        public void c(int i10, long j10) {
            this.f12387a.i(new e(this.f12389c, 1, (long) i10, j10));
            this.f12388b.d(this.f12390d);
        }
    }

    private void e() {
        a6.a.h(this.f12369b);
        m0.j(this.f12368a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i[] f() {
        return new i[]{new b()};
    }

    public void b(long j10, long j11) {
        C0204b bVar = this.f12370c;
        if (bVar != null) {
            bVar.b(j11);
        }
    }

    public void c(k kVar) {
        this.f12368a = kVar;
        this.f12369b = kVar.e(0, 1);
        kVar.o();
    }

    public boolean d(k4.j jVar) {
        return d.a(jVar) != null;
    }

    public int g(k4.j jVar, x xVar) {
        e();
        if (this.f12370c == null) {
            c a10 = d.a(jVar);
            if (a10 != null) {
                int i10 = a10.f12395a;
                if (i10 == 17) {
                    this.f12370c = new a(this.f12368a, this.f12369b, a10);
                } else if (i10 == 6) {
                    this.f12370c = new c(this.f12368a, this.f12369b, a10, "audio/g711-alaw", -1);
                } else if (i10 == 7) {
                    this.f12370c = new c(this.f12368a, this.f12369b, a10, "audio/g711-mlaw", -1);
                } else {
                    int a11 = w.a(i10, a10.f12400f);
                    if (a11 != 0) {
                        this.f12370c = new c(this.f12368a, this.f12369b, a10, "audio/raw", a11);
                    } else {
                        int i11 = a10.f12395a;
                        StringBuilder sb = new StringBuilder(40);
                        sb.append("Unsupported WAV format type: ");
                        sb.append(i11);
                        throw ParserException.d(sb.toString());
                    }
                }
            } else {
                throw ParserException.a("Unsupported or unrecognized wav header.", (Throwable) null);
            }
        }
        if (this.f12371d == -1) {
            Pair<Long, Long> b10 = d.b(jVar);
            this.f12371d = ((Long) b10.first).intValue();
            long longValue = ((Long) b10.second).longValue();
            this.f12372e = longValue;
            this.f12370c.c(this.f12371d, longValue);
        } else if (jVar.getPosition() == 0) {
            jVar.l(this.f12371d);
        }
        a6.a.f(this.f12372e != -1);
        if (this.f12370c.a(jVar, this.f12372e - jVar.getPosition())) {
            return -1;
        }
        return 0;
    }

    public void release() {
    }
}
