package g4;

import a6.m0;
import a6.x;
import a6.y;
import com.google.android.exoplayer2.drm.h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e4.j;
import java.nio.ByteBuffer;

/* compiled from: Ac3Util */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8828a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8829b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8830c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8831d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f8832e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f8833f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g4.b$b  reason: collision with other inner class name */
    /* compiled from: Ac3Util */
    public static final class C0141b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8834a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8835b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8836c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8837d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8838e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8839f;

        private C0141b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f8834a = str;
            this.f8835b = i10;
            this.f8837d = i11;
            this.f8836c = i12;
            this.f8838e = i13;
            this.f8839f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((m0.G(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f8829b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f8833f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f8832e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static j c(y yVar, String str, String str2, h hVar) {
        int i10 = f8829b[(yVar.C() & 192) >> 6];
        int C = yVar.C();
        int i11 = f8831d[(C & 56) >> 3];
        if ((C & 4) != 0) {
            i11++;
        }
        return new j.b().S(str).e0("audio/ac3").H(i11).f0(i10).L(hVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f8828a[i10] * UserVerificationMethods.USER_VERIFY_HANDPRINT;
    }

    public static C0141b e(x xVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        x xVar2 = xVar;
        int e10 = xVar.e();
        xVar2.r(40);
        boolean z10 = xVar2.h(5) > 10;
        xVar2.p(e10);
        int i21 = -1;
        if (z10) {
            xVar2.r(16);
            int h10 = xVar2.h(2);
            if (h10 == 0) {
                i21 = 0;
            } else if (h10 == 1) {
                i21 = 1;
            } else if (h10 == 2) {
                i21 = 2;
            }
            xVar2.r(3);
            int h11 = (xVar2.h(11) + 1) * 2;
            int h12 = xVar2.h(2);
            if (h12 == 3) {
                i15 = f8830c[xVar2.h(2)];
                i17 = 3;
                i16 = 6;
            } else {
                i17 = xVar2.h(2);
                i16 = f8828a[i17];
                i15 = f8829b[h12];
            }
            int i22 = i16 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
            int h13 = xVar2.h(3);
            boolean g10 = xVar.g();
            int i23 = f8831d[h13] + (g10 ? 1 : 0);
            xVar2.r(10);
            if (xVar.g()) {
                xVar2.r(8);
            }
            if (h13 == 0) {
                xVar2.r(5);
                if (xVar.g()) {
                    xVar2.r(8);
                }
            }
            if (i21 == 1 && xVar.g()) {
                xVar2.r(16);
            }
            if (xVar.g()) {
                if (h13 > 2) {
                    xVar2.r(2);
                }
                if ((h13 & 1) == 0 || h13 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    xVar2.r(6);
                }
                if ((h13 & 4) != 0) {
                    xVar2.r(i19);
                }
                if (g10 && xVar.g()) {
                    xVar2.r(5);
                }
                if (i21 == 0) {
                    if (xVar.g()) {
                        i20 = 6;
                        xVar2.r(6);
                    } else {
                        i20 = 6;
                    }
                    if (h13 == 0 && xVar.g()) {
                        xVar2.r(i20);
                    }
                    if (xVar.g()) {
                        xVar2.r(i20);
                    }
                    int h14 = xVar2.h(2);
                    if (h14 == 1) {
                        xVar2.r(5);
                    } else if (h14 == 2) {
                        xVar2.r(12);
                    } else if (h14 == 3) {
                        int h15 = xVar2.h(5);
                        if (xVar.g()) {
                            xVar2.r(5);
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                xVar2.r(4);
                            }
                            if (xVar.g()) {
                                if (xVar.g()) {
                                    xVar2.r(4);
                                }
                                if (xVar.g()) {
                                    xVar2.r(4);
                                }
                            }
                        }
                        if (xVar.g()) {
                            xVar2.r(5);
                            if (xVar.g()) {
                                xVar2.r(7);
                                if (xVar.g()) {
                                    xVar2.r(8);
                                }
                            }
                        }
                        xVar2.r((h15 + 2) * 8);
                        xVar.c();
                    }
                    if (h13 < 2) {
                        if (xVar.g()) {
                            xVar2.r(14);
                        }
                        if (h13 == 0 && xVar.g()) {
                            xVar2.r(14);
                        }
                    }
                    if (xVar.g()) {
                        if (i17 == 0) {
                            xVar2.r(5);
                        } else {
                            for (int i24 = 0; i24 < i16; i24++) {
                                if (xVar.g()) {
                                    xVar2.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.g()) {
                xVar2.r(5);
                if (h13 == 2) {
                    xVar2.r(4);
                }
                if (h13 >= 6) {
                    xVar2.r(2);
                }
                if (xVar.g()) {
                    xVar2.r(8);
                }
                if (h13 == 0 && xVar.g()) {
                    xVar2.r(8);
                }
                if (h12 < 3) {
                    xVar.q();
                }
            }
            if (i21 == 0 && i17 != 3) {
                xVar.q();
            }
            if (i21 != 2 || (i17 != 3 && !xVar.g())) {
                i18 = 6;
            } else {
                i18 = 6;
                xVar2.r(6);
            }
            str = (xVar.g() && xVar2.h(i18) == 1 && xVar2.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i21;
            i10 = i22;
            i11 = h11;
            i12 = i15;
            i13 = i23;
        } else {
            xVar2.r(32);
            int h16 = xVar2.h(2);
            String str2 = h16 == 3 ? null : "audio/ac3";
            int b10 = b(h16, xVar2.h(6));
            xVar2.r(8);
            int h17 = xVar2.h(3);
            if (!((h17 & 1) == 0 || h17 == 1)) {
                xVar2.r(2);
            }
            if ((h17 & 4) != 0) {
                xVar2.r(2);
            }
            if (h17 == 2) {
                xVar2.r(2);
            }
            int[] iArr = f8829b;
            str = str2;
            i11 = b10;
            i12 = h16 < iArr.length ? iArr[h16] : -1;
            i13 = f8831d[h17] + (xVar.g() ? 1 : 0);
            i14 = -1;
            i10 = 1536;
        }
        return new C0141b(str, i14, i13, i12, i11, i10);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static j g(y yVar, String str, String str2, h hVar) {
        yVar.P(2);
        int i10 = f8829b[(yVar.C() & 192) >> 6];
        int C = yVar.C();
        int i11 = f8831d[(C & 14) >> 1];
        if ((C & 1) != 0) {
            i11++;
        }
        if (((yVar.C() & 30) >> 1) > 0 && (2 & yVar.C()) != 0) {
            i11 += 2;
        }
        return new j.b().S(str).e0((yVar.a() <= 0 || (yVar.C() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).L(hVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z10 = true;
        }
        return 40 << ((bArr[z10 ? (char) 9 : 8] >> 4) & 7);
    }
}
