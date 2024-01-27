package e7;

import com.google.android.gms.common.api.Api;
import com.google.zxing.b;
import java.util.Arrays;

/* compiled from: HighLevelEncoder */
public final class j {
    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char charAt = charSequence.charAt(i10);
            while (f(charAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    charAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static String b(String str, l lVar, b bVar, b bVar2) {
        int i10 = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(lVar);
        hVar.l(bVar, bVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r(236);
            hVar.m(2);
            hVar.f14302f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r(237);
            hVar.m(2);
            hVar.f14302f += 7;
        }
        while (hVar.i()) {
            gVarArr[i10].a(hVar);
            if (hVar.e() >= 0) {
                i10 = hVar.e();
                hVar.j();
            }
        }
        int a10 = hVar.a();
        hVar.p();
        int a11 = hVar.g().a();
        if (!(a10 >= a11 || i10 == 0 || i10 == 5 || i10 == 4)) {
            hVar.r(254);
        }
        StringBuilder b10 = hVar.b();
        if (b10.length() < a11) {
            b10.append(129);
        }
        while (b10.length() < a11) {
            b10.append(o(129, b10.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = (int) Math.ceil((double) fArr[i11]);
            int i12 = iArr[i11];
            if (i10 > i12) {
                Arrays.fill(bArr, (byte) 0);
                i10 = i12;
            }
            if (i10 == i12) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    private static boolean h(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    private static boolean j(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean k(char c10) {
        if (m(c10) || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean l(char c10) {
        return false;
    }

    private static boolean m(char c10) {
        return c10 == 13 || c10 == '*' || c10 == '>';
    }

    static int n(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        char c10;
        CharSequence charSequence2 = charSequence;
        int i12 = i10;
        if (i12 >= charSequence.length()) {
            return i11;
        }
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i12 + i13;
            if (i14 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int c11 = c(fArr, iArr, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
                int d10 = d(bArr);
                if (iArr[0] == c11) {
                    return 0;
                }
                if (d10 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d10 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (d10 != 1 || bArr[2] <= 0) {
                    return (d10 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i14);
            i13++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                c10 = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c10 = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i13 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                c(fArr, iArr2, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr2);
                int d11 = d(bArr2);
                if (iArr2[0] < iArr2[c10] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (d11 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (d11 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (d11 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i15 = i12 + i13 + 1;
                        while (i15 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i15);
                            if (!m(charAt2)) {
                                if (!k(charAt2)) {
                                    break;
                                }
                                i15++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static char o(char c10, int i10) {
        int i11 = c10 + ((i10 * 149) % 253) + 1;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
