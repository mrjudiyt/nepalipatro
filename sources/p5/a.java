package p5;

import a6.m0;
import a6.p;
import a6.y;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o5.a;
import o5.e;
import o5.h;
import o5.i;

/* compiled from: Cea608Decoder */
public final class a extends e {
    /* access modifiers changed from: private */
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F;

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f10568y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f10569z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g  reason: collision with root package name */
    private final y f10570g = new y();

    /* renamed from: h  reason: collision with root package name */
    private final int f10571h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10572i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10573j;

    /* renamed from: k  reason: collision with root package name */
    private final long f10574k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<C0181a> f10575l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private C0181a f10576m = new C0181a(0, 4);

    /* renamed from: n  reason: collision with root package name */
    private List<o5.a> f10577n;

    /* renamed from: o  reason: collision with root package name */
    private List<o5.a> f10578o;

    /* renamed from: p  reason: collision with root package name */
    private int f10579p;

    /* renamed from: q  reason: collision with root package name */
    private int f10580q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10581r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10582s;

    /* renamed from: t  reason: collision with root package name */
    private byte f10583t;

    /* renamed from: u  reason: collision with root package name */
    private byte f10584u;

    /* renamed from: v  reason: collision with root package name */
    private int f10585v = 0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10586w;

    /* renamed from: x  reason: collision with root package name */
    private long f10587x;

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* compiled from: Cea608Decoder */
    private static final class C0181a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0182a> f10588a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f10589b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f10590c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f10591d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f10592e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f10593f;

        /* renamed from: g  reason: collision with root package name */
        private int f10594g;

        /* renamed from: h  reason: collision with root package name */
        private int f10595h;

        /* renamed from: p5.a$a$a  reason: collision with other inner class name */
        /* compiled from: Cea608Decoder */
        private static class C0182a {

            /* renamed from: a  reason: collision with root package name */
            public final int f10596a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f10597b;

            /* renamed from: c  reason: collision with root package name */
            public int f10598c;

            public C0182a(int i10, boolean z10, int i11) {
                this.f10596a = i10;
                this.f10597b = z10;
                this.f10598c = i11;
            }
        }

        public C0181a(int i10, int i11) {
            j(i10);
            this.f10595h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f10590c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            boolean z10 = false;
            while (i10 < this.f10588a.size()) {
                C0182a aVar = this.f10588a.get(i10);
                boolean z11 = aVar.f10597b;
                int i16 = aVar.f10596a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.A[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f10598c;
                i10++;
                if (i17 != (i10 < this.f10588a.size() ? this.f10588a.get(i10).f10598c : length)) {
                    if (i11 != -1 && !z11) {
                        q(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z11) {
                        i11 = i17;
                    }
                    if (i12 != -1 && !z10) {
                        o(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z10) {
                        i12 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i13, i17, i14);
                        i14 = i15;
                        i13 = i17;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                q(spannableStringBuilder, i11, length);
            }
            if (!(i12 == -1 || i12 == length)) {
                o(spannableStringBuilder, i12, length);
            }
            if (i13 != length) {
                n(spannableStringBuilder, i13, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f10590c.length() < 32) {
                this.f10590c.append(c10);
            }
        }

        public void f() {
            int length = this.f10590c.length();
            if (length > 0) {
                this.f10590c.delete(length - 1, length);
                int size = this.f10588a.size() - 1;
                while (size >= 0) {
                    C0182a aVar = this.f10588a.get(size);
                    int i10 = aVar.f10598c;
                    if (i10 == length) {
                        aVar.f10598c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public o5.a g(int i10) {
            float f10;
            int i11 = this.f10592e + this.f10593f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f10589b.size(); i13++) {
                spannableStringBuilder.append(m0.L0(this.f10589b.get(i13), i12));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(m0.L0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f10594g != 2 || (Math.abs(i14) >= 3 && length >= 0)) {
                    i10 = (this.f10594g != 2 || i14 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((((float) i11) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f10591d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f10594g == 1) {
                i15 -= this.f10595h - 1;
            }
            return new a.b().n(spannableStringBuilder).o(Layout.Alignment.ALIGN_NORMAL).g((float) i15, 1).j(f10).k(i10).a();
        }

        public boolean i() {
            return this.f10588a.isEmpty() && this.f10589b.isEmpty() && this.f10590c.length() == 0;
        }

        public void j(int i10) {
            this.f10594g = i10;
            this.f10588a.clear();
            this.f10589b.clear();
            this.f10590c.setLength(0);
            this.f10591d = 15;
            this.f10592e = 0;
            this.f10593f = 0;
        }

        public void k() {
            this.f10589b.add(h());
            this.f10590c.setLength(0);
            this.f10588a.clear();
            int min = Math.min(this.f10595h, this.f10591d);
            while (this.f10589b.size() >= min) {
                this.f10589b.remove(0);
            }
        }

        public void l(int i10) {
            this.f10594g = i10;
        }

        public void m(int i10) {
            this.f10595h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f10588a.add(new C0182a(i10, z10, this.f10590c.length()));
        }
    }

    static {
        boolean[] zArr = new boolean[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        // fill-array-data instruction
        zArr[0] = 0;
        zArr[1] = 1;
        zArr[2] = 1;
        zArr[3] = 0;
        zArr[4] = 1;
        zArr[5] = 0;
        zArr[6] = 0;
        zArr[7] = 1;
        zArr[8] = 1;
        zArr[9] = 0;
        zArr[10] = 0;
        zArr[11] = 1;
        zArr[12] = 0;
        zArr[13] = 1;
        zArr[14] = 1;
        zArr[15] = 0;
        zArr[16] = 1;
        zArr[17] = 0;
        zArr[18] = 0;
        zArr[19] = 1;
        zArr[20] = 0;
        zArr[21] = 1;
        zArr[22] = 1;
        zArr[23] = 0;
        zArr[24] = 0;
        zArr[25] = 1;
        zArr[26] = 1;
        zArr[27] = 0;
        zArr[28] = 1;
        zArr[29] = 0;
        zArr[30] = 0;
        zArr[31] = 1;
        zArr[32] = 1;
        zArr[33] = 0;
        zArr[34] = 0;
        zArr[35] = 1;
        zArr[36] = 0;
        zArr[37] = 1;
        zArr[38] = 1;
        zArr[39] = 0;
        zArr[40] = 0;
        zArr[41] = 1;
        zArr[42] = 1;
        zArr[43] = 0;
        zArr[44] = 1;
        zArr[45] = 0;
        zArr[46] = 0;
        zArr[47] = 1;
        zArr[48] = 0;
        zArr[49] = 1;
        zArr[50] = 1;
        zArr[51] = 0;
        zArr[52] = 1;
        zArr[53] = 0;
        zArr[54] = 0;
        zArr[55] = 1;
        zArr[56] = 1;
        zArr[57] = 0;
        zArr[58] = 0;
        zArr[59] = 1;
        zArr[60] = 0;
        zArr[61] = 1;
        zArr[62] = 1;
        zArr[63] = 0;
        zArr[64] = 1;
        zArr[65] = 0;
        zArr[66] = 0;
        zArr[67] = 1;
        zArr[68] = 0;
        zArr[69] = 1;
        zArr[70] = 1;
        zArr[71] = 0;
        zArr[72] = 0;
        zArr[73] = 1;
        zArr[74] = 1;
        zArr[75] = 0;
        zArr[76] = 1;
        zArr[77] = 0;
        zArr[78] = 0;
        zArr[79] = 1;
        zArr[80] = 0;
        zArr[81] = 1;
        zArr[82] = 1;
        zArr[83] = 0;
        zArr[84] = 1;
        zArr[85] = 0;
        zArr[86] = 0;
        zArr[87] = 1;
        zArr[88] = 1;
        zArr[89] = 0;
        zArr[90] = 0;
        zArr[91] = 1;
        zArr[92] = 0;
        zArr[93] = 1;
        zArr[94] = 1;
        zArr[95] = 0;
        zArr[96] = 0;
        zArr[97] = 1;
        zArr[98] = 1;
        zArr[99] = 0;
        zArr[100] = 1;
        zArr[101] = 0;
        zArr[102] = 0;
        zArr[103] = 1;
        zArr[104] = 1;
        zArr[105] = 0;
        zArr[106] = 0;
        zArr[107] = 1;
        zArr[108] = 0;
        zArr[109] = 1;
        zArr[110] = 1;
        zArr[111] = 0;
        zArr[112] = 1;
        zArr[113] = 0;
        zArr[114] = 0;
        zArr[115] = 1;
        zArr[116] = 0;
        zArr[117] = 1;
        zArr[118] = 1;
        zArr[119] = 0;
        zArr[120] = 0;
        zArr[121] = 1;
        zArr[122] = 1;
        zArr[123] = 0;
        zArr[124] = 1;
        zArr[125] = 0;
        zArr[126] = 0;
        zArr[127] = 1;
        zArr[128] = 1;
        zArr[129] = 0;
        zArr[130] = 0;
        zArr[131] = 1;
        zArr[132] = 0;
        zArr[133] = 1;
        zArr[134] = 1;
        zArr[135] = 0;
        zArr[136] = 0;
        zArr[137] = 1;
        zArr[138] = 1;
        zArr[139] = 0;
        zArr[140] = 1;
        zArr[141] = 0;
        zArr[142] = 0;
        zArr[143] = 1;
        zArr[144] = 0;
        zArr[145] = 1;
        zArr[146] = 1;
        zArr[147] = 0;
        zArr[148] = 1;
        zArr[149] = 0;
        zArr[150] = 0;
        zArr[151] = 1;
        zArr[152] = 1;
        zArr[153] = 0;
        zArr[154] = 0;
        zArr[155] = 1;
        zArr[156] = 0;
        zArr[157] = 1;
        zArr[158] = 1;
        zArr[159] = 0;
        zArr[160] = 0;
        zArr[161] = 1;
        zArr[162] = 1;
        zArr[163] = 0;
        zArr[164] = 1;
        zArr[165] = 0;
        zArr[166] = 0;
        zArr[167] = 1;
        zArr[168] = 1;
        zArr[169] = 0;
        zArr[170] = 0;
        zArr[171] = 1;
        zArr[172] = 0;
        zArr[173] = 1;
        zArr[174] = 1;
        zArr[175] = 0;
        zArr[176] = 1;
        zArr[177] = 0;
        zArr[178] = 0;
        zArr[179] = 1;
        zArr[180] = 0;
        zArr[181] = 1;
        zArr[182] = 1;
        zArr[183] = 0;
        zArr[184] = 0;
        zArr[185] = 1;
        zArr[186] = 1;
        zArr[187] = 0;
        zArr[188] = 1;
        zArr[189] = 0;
        zArr[190] = 0;
        zArr[191] = 1;
        zArr[192] = 0;
        zArr[193] = 1;
        zArr[194] = 1;
        zArr[195] = 0;
        zArr[196] = 1;
        zArr[197] = 0;
        zArr[198] = 0;
        zArr[199] = 1;
        zArr[200] = 1;
        zArr[201] = 0;
        zArr[202] = 0;
        zArr[203] = 1;
        zArr[204] = 0;
        zArr[205] = 1;
        zArr[206] = 1;
        zArr[207] = 0;
        zArr[208] = 1;
        zArr[209] = 0;
        zArr[210] = 0;
        zArr[211] = 1;
        zArr[212] = 0;
        zArr[213] = 1;
        zArr[214] = 1;
        zArr[215] = 0;
        zArr[216] = 0;
        zArr[217] = 1;
        zArr[218] = 1;
        zArr[219] = 0;
        zArr[220] = 1;
        zArr[221] = 0;
        zArr[222] = 0;
        zArr[223] = 1;
        zArr[224] = 1;
        zArr[225] = 0;
        zArr[226] = 0;
        zArr[227] = 1;
        zArr[228] = 0;
        zArr[229] = 1;
        zArr[230] = 1;
        zArr[231] = 0;
        zArr[232] = 0;
        zArr[233] = 1;
        zArr[234] = 1;
        zArr[235] = 0;
        zArr[236] = 1;
        zArr[237] = 0;
        zArr[238] = 0;
        zArr[239] = 1;
        zArr[240] = 0;
        zArr[241] = 1;
        zArr[242] = 1;
        zArr[243] = 0;
        zArr[244] = 1;
        zArr[245] = 0;
        zArr[246] = 0;
        zArr[247] = 1;
        zArr[248] = 1;
        zArr[249] = 0;
        zArr[250] = 0;
        zArr[251] = 1;
        zArr[252] = 0;
        zArr[253] = 1;
        zArr[254] = 1;
        zArr[255] = 0;
        F = zArr;
    }

    public a(String str, int i10, long j10) {
        this.f10574k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f10571h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f10573j = 0;
            this.f10572i = 0;
        } else if (i10 == 2) {
            this.f10573j = 1;
            this.f10572i = 0;
        } else if (i10 == 3) {
            this.f10573j = 0;
            this.f10572i = 1;
        } else if (i10 != 4) {
            p.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f10573j = 0;
            this.f10572i = 0;
        } else {
            this.f10573j = 1;
            this.f10572i = 1;
        }
        M(0);
        L();
        this.f10586w = true;
        this.f10587x = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean E(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean F(boolean z10, byte b10, byte b11) {
        if (!z10 || !E(b10)) {
            this.f10582s = false;
        } else if (this.f10582s && this.f10583t == b10 && this.f10584u == b11) {
            this.f10582s = false;
            return true;
        } else {
            this.f10582s = true;
            this.f10583t = b10;
            this.f10584u = b11;
        }
        return false;
    }

    private static boolean G(byte b10) {
        return (b10 & 247) == 20;
    }

    private static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void K(byte b10, byte b11) {
        if (J(b10)) {
            this.f10586w = false;
        } else if (G(b10)) {
            if (!(b11 == 32 || b11 == 47)) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f10586w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f10586w = true;
        }
    }

    private void L() {
        this.f10576m.j(this.f10579p);
        this.f10575l.clear();
        this.f10575l.add(this.f10576m);
    }

    private void M(int i10) {
        int i11 = this.f10579p;
        if (i11 != i10) {
            this.f10579p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f10575l.size(); i12++) {
                    this.f10575l.get(i12).l(i10);
                }
                return;
            }
            L();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f10577n = Collections.emptyList();
            }
        }
    }

    private void N(int i10) {
        this.f10580q = i10;
        this.f10576m.m(i10);
    }

    private boolean O() {
        if (this.f10574k == -9223372036854775807L || this.f10587x == -9223372036854775807L || j() - this.f10587x < this.f10574k) {
            return false;
        }
        return true;
    }

    private boolean P(byte b10) {
        if (z(b10)) {
            this.f10585v = q(b10);
        }
        return this.f10585v == this.f10573j;
    }

    private static char p(byte b10) {
        return (char) B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<o5.a> r() {
        int size = this.f10575l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            o5.a g10 = this.f10575l.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f10404i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            o5.a aVar = (o5.a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f10404i != i10) {
                    aVar = (o5.a) a6.a.e(this.f10575l.get(i12).g(i10));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b10) {
        return (char) D[b10 & 31];
    }

    private static char t(byte b10) {
        return (char) E[b10 & 31];
    }

    private static char u(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return s(b11);
        }
        return t(b11);
    }

    private static char v(byte b10) {
        return (char) C[b10 & 15];
    }

    private void w(byte b10) {
        this.f10576m.e(' ');
        this.f10576m.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void x(byte b10) {
        if (b10 == 32) {
            M(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i10 = this.f10579p;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f10577n = Collections.emptyList();
                                    int i11 = this.f10579p;
                                    if (i11 == 1 || i11 == 3) {
                                        L();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f10576m.i()) {
                                        this.f10576m.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    L();
                                    return;
                                case 47:
                                    this.f10577n = r();
                                    L();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f10576m.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            M(3);
        }
    }

    private void y(byte b10, byte b11) {
        int i10 = f10568y[b10 & 7];
        boolean z10 = false;
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f10576m.f10591d) {
            if (this.f10579p != 1 && !this.f10576m.i()) {
                C0181a aVar = new C0181a(this.f10579p, this.f10580q);
                this.f10576m = aVar;
                this.f10575l.add(aVar);
            }
            int unused = this.f10576m.f10591d = i10;
        }
        boolean z11 = (b11 & 16) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f10576m.p(z11 ? 8 : i11, z10);
        if (z11) {
            int unused2 = this.f10576m.f10592e = f10569z[i11];
        }
    }

    private static boolean z(byte b10) {
        return (b10 & 224) == 0;
    }

    public /* bridge */ /* synthetic */ void a(long j10) {
        super.a(j10);
    }

    /* access modifiers changed from: protected */
    public e e() {
        List<o5.a> list = this.f10577n;
        this.f10578o = list;
        return new f((List) a6.a.e(list));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(o5.h r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f6469j
            java.lang.Object r10 = a6.a.e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            a6.y r0 = r9.f10570g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.M(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            a6.y r2 = r9.f10570g
            int r2 = r2.a()
            int r3 = r9.f10571h
            if (r2 < r3) goto L_0x00f6
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            a6.y r2 = r9.f10570g
            int r2 = r2.C()
            byte r2 = (byte) r2
        L_0x002e:
            a6.y r3 = r9.f10570g
            int r3 = r3.C()
            a6.y r4 = r9.f10570g
            int r4 = r4.C()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f10572i
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f10581r
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = F
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.f10581r = r2
            boolean r2 = r9.F(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f10581r
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.L()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.K(r5, r6)
            boolean r2 = r9.f10586w
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.P(r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = z(r5)
            if (r1 == 0) goto L_0x00df
            boolean r1 = H(r5, r6)
            if (r1 == 0) goto L_0x009e
            p5.a$a r1 = r9.f10576m
            char r2 = v(r6)
            r1.e(r2)
            goto L_0x0077
        L_0x009e:
            boolean r1 = A(r5, r6)
            if (r1 == 0) goto L_0x00b3
            p5.a$a r1 = r9.f10576m
            r1.f()
            p5.a$a r1 = r9.f10576m
            char r2 = u(r5, r6)
            r1.e(r2)
            goto L_0x0077
        L_0x00b3:
            boolean r1 = B(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.w(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r1 = D(r5, r6)
            if (r1 == 0) goto L_0x00c7
            r9.y(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r1 = I(r5, r6)
            if (r1 == 0) goto L_0x00d5
            p5.a$a r1 = r9.f10576m
            int r6 = r6 + -32
            int unused = r1.f10593f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r1 = C(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.x(r6)
            goto L_0x0077
        L_0x00df:
            p5.a$a r1 = r9.f10576m
            char r2 = p(r5)
            r1.e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            p5.a$a r1 = r9.f10576m
            char r2 = p(r6)
            r1.e(r2)
            goto L_0x0077
        L_0x00f6:
            if (r1 == 0) goto L_0x010b
            int r10 = r9.f10579p
            if (r10 == r0) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.r()
            r9.f10577n = r10
            long r0 = r9.j()
            r9.f10587x = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.f(o5.h):void");
    }

    public void flush() {
        super.flush();
        this.f10577n = null;
        this.f10578o = null;
        M(0);
        N(4);
        L();
        this.f10581r = false;
        this.f10582s = false;
        this.f10583t = 0;
        this.f10584u = 0;
        this.f10585v = 0;
        this.f10586w = true;
        this.f10587x = -9223372036854775807L;
    }

    public /* bridge */ /* synthetic */ h g() {
        return super.c();
    }

    /* renamed from: h */
    public i b() {
        i i10;
        i h10 = super.b();
        if (h10 != null) {
            return h10;
        }
        if (!O() || (i10 = i()) == null) {
            return null;
        }
        this.f10577n = Collections.emptyList();
        this.f10587x = -9223372036854775807L;
        i iVar = i10;
        iVar.t(j(), e(), Long.MAX_VALUE);
        return i10;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.f10577n != this.f10578o;
    }

    public /* bridge */ /* synthetic */ void l(h hVar) {
        super.d(hVar);
    }

    public void release() {
    }
}
