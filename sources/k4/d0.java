package k4;

import a6.p;
import a6.y;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;

/* compiled from: VorbisUtil */
public final class d0 {

    /* compiled from: VorbisUtil */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9549a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9550b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f9551c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9552d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9553e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f9549a = i10;
            this.f9550b = i11;
            this.f9551c = jArr;
            this.f9552d = i12;
            this.f9553e = z10;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f9554a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f9555b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9556c;

        public b(String str, String[] strArr, int i10) {
            this.f9554a = str;
            this.f9555b = strArr;
            this.f9556c = i10;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9557a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9558b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9559c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9560d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f9557a = z10;
            this.f9558b = i10;
            this.f9559c = i11;
            this.f9560d = i12;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f9561a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9562b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9563c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9564d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9565e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9566f;

        /* renamed from: g  reason: collision with root package name */
        public final int f9567g;

        /* renamed from: h  reason: collision with root package name */
        public final int f9568h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f9569i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f9570j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f9561a = i10;
            this.f9562b = i11;
            this.f9563c = i12;
            this.f9564d = i13;
            this.f9565e = i14;
            this.f9566f = i15;
            this.f9567g = i16;
            this.f9568h = i17;
            this.f9569i = z10;
            this.f9570j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    private static a c(c0 c0Var) {
        if (c0Var.d(24) == 5653314) {
            int d10 = c0Var.d(16);
            int d11 = c0Var.d(24);
            long[] jArr = new long[d11];
            boolean c10 = c0Var.c();
            long j10 = 0;
            if (!c10) {
                boolean c11 = c0Var.c();
                for (int i10 = 0; i10 < d11; i10++) {
                    if (!c11) {
                        jArr[i10] = (long) (c0Var.d(5) + 1);
                    } else if (c0Var.c()) {
                        jArr[i10] = (long) (c0Var.d(5) + 1);
                    } else {
                        jArr[i10] = 0;
                    }
                }
            } else {
                int d12 = c0Var.d(5) + 1;
                int i11 = 0;
                while (i11 < d11) {
                    int d13 = c0Var.d(a(d11 - i11));
                    for (int i12 = 0; i12 < d13 && i11 < d11; i12++) {
                        jArr[i11] = (long) d12;
                        i11++;
                    }
                    d12++;
                }
            }
            int d14 = c0Var.d(4);
            if (d14 <= 2) {
                if (d14 == 1 || d14 == 2) {
                    c0Var.e(32);
                    c0Var.e(32);
                    int d15 = c0Var.d(4) + 1;
                    c0Var.e(1);
                    if (d14 != 1) {
                        j10 = ((long) d11) * ((long) d10);
                    } else if (d10 != 0) {
                        j10 = b((long) d11, (long) d10);
                    }
                    c0Var.e((int) (j10 * ((long) d15)));
                }
                return new a(d10, d11, jArr, d14, c10);
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(d14);
            throw ParserException.a(sb.toString(), (Throwable) null);
        }
        int b10 = c0Var.b();
        StringBuilder sb2 = new StringBuilder(66);
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(b10);
        throw ParserException.a(sb2.toString(), (Throwable) null);
    }

    private static void d(c0 c0Var) {
        int d10 = c0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = c0Var.d(16);
            if (d11 == 0) {
                c0Var.e(8);
                c0Var.e(16);
                c0Var.e(16);
                c0Var.e(6);
                c0Var.e(8);
                int d12 = c0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    c0Var.e(8);
                }
            } else if (d11 == 1) {
                int d13 = c0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[d13];
                for (int i13 = 0; i13 < d13; i13++) {
                    iArr[i13] = c0Var.d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = c0Var.d(3) + 1;
                    int d14 = c0Var.d(2);
                    if (d14 > 0) {
                        c0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d14); i16++) {
                        c0Var.e(8);
                    }
                }
                c0Var.e(2);
                int d15 = c0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        c0Var.e(d15);
                        i18++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("floor type greater than 1 not decodable: ");
                sb.append(d11);
                throw ParserException.a(sb.toString(), (Throwable) null);
            }
        }
    }

    private static void e(int i10, c0 c0Var) {
        int d10 = c0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = c0Var.d(16);
            if (d11 != 0) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("mapping type other than 0 not supported: ");
                sb.append(d11);
                p.c("VorbisUtil", sb.toString());
            } else {
                int d12 = c0Var.c() ? c0Var.d(4) + 1 : 1;
                if (c0Var.c()) {
                    int d13 = c0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        c0Var.e(a(i13));
                        c0Var.e(a(i13));
                    }
                }
                if (c0Var.d(2) == 0) {
                    if (d12 > 1) {
                        for (int i14 = 0; i14 < i10; i14++) {
                            c0Var.e(4);
                        }
                    }
                    for (int i15 = 0; i15 < d12; i15++) {
                        c0Var.e(8);
                        c0Var.e(8);
                        c0Var.e(8);
                    }
                } else {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    private static c[] f(c0 c0Var) {
        int d10 = c0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(c0Var.c(), c0Var.d(16), c0Var.d(16), c0Var.d(8));
        }
        return cVarArr;
    }

    private static void g(c0 c0Var) {
        int d10 = c0Var.d(6) + 1;
        int i10 = 0;
        while (i10 < d10) {
            if (c0Var.d(16) <= 2) {
                c0Var.e(24);
                c0Var.e(24);
                c0Var.e(24);
                int d11 = c0Var.d(6) + 1;
                c0Var.e(8);
                int[] iArr = new int[d11];
                for (int i11 = 0; i11 < d11; i11++) {
                    iArr[i11] = ((c0Var.c() ? c0Var.d(5) : 0) * 8) + c0Var.d(3);
                }
                for (int i12 = 0; i12 < d11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            c0Var.e(8);
                        }
                    }
                }
                i10++;
            } else {
                throw ParserException.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    public static b h(y yVar) {
        return i(yVar, true, true);
    }

    public static b i(y yVar, boolean z10, boolean z11) {
        if (z10) {
            l(3, yVar, false);
        }
        String z12 = yVar.z((int) yVar.s());
        int length = 11 + z12.length();
        long s10 = yVar.s();
        String[] strArr = new String[((int) s10)];
        int i10 = length + 4;
        for (int i11 = 0; ((long) i11) < s10; i11++) {
            strArr[i11] = yVar.z((int) yVar.s());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (!z11 || (yVar.C() & 1) != 0) {
            return new b(z12, strArr, i10 + 1);
        }
        throw ParserException.a("framing bit expected to be set", (Throwable) null);
    }

    public static d j(y yVar) {
        boolean z10 = true;
        l(1, yVar, false);
        int t10 = yVar.t();
        int C = yVar.C();
        int t11 = yVar.t();
        int p10 = yVar.p();
        if (p10 <= 0) {
            p10 = -1;
        }
        int p11 = yVar.p();
        if (p11 <= 0) {
            p11 = -1;
        }
        int p12 = yVar.p();
        if (p12 <= 0) {
            p12 = -1;
        }
        int C2 = yVar.C();
        int pow = (int) Math.pow(2.0d, (double) (C2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((C2 & 240) >> 4));
        if ((yVar.C() & 1) <= 0) {
            z10 = false;
        }
        return new d(t10, C, t11, p10, p11, p12, pow, pow2, z10, Arrays.copyOf(yVar.d(), yVar.f()));
    }

    public static c[] k(y yVar, int i10) {
        int i11 = 0;
        l(5, yVar, false);
        int C = yVar.C() + 1;
        c0 c0Var = new c0(yVar.d());
        c0Var.e(yVar.e() * 8);
        for (int i12 = 0; i12 < C; i12++) {
            c(c0Var);
        }
        int d10 = c0Var.d(6) + 1;
        while (i11 < d10) {
            if (c0Var.d(16) == 0) {
                i11++;
            } else {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        d(c0Var);
        g(c0Var);
        e(i10, c0Var);
        c[] f10 = f(c0Var);
        if (c0Var.c()) {
            return f10;
        }
        throw ParserException.a("framing bit after modes not set as expected", (Throwable) null);
    }

    public static boolean l(int i10, y yVar, boolean z10) {
        if (yVar.a() < 7) {
            if (z10) {
                return false;
            }
            int a10 = yVar.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(a10);
            throw ParserException.a(sb.toString(), (Throwable) null);
        } else if (yVar.C() != i10) {
            if (z10) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i10));
            throw ParserException.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), (Throwable) null);
        } else if (yVar.C() == 118 && yVar.C() == 111 && yVar.C() == 114 && yVar.C() == 98 && yVar.C() == 105 && yVar.C() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw ParserException.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
