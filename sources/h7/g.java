package h7;

import b7.c;
import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PDF417HighLevelEncoder */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f14820a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f14821b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f14822c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f14823d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f14824e = StandardCharsets.ISO_8859_1;

    /* compiled from: PDF417HighLevelEncoder */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                h7.c[] r0 = h7.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14825a = r0
                h7.c r1 = h7.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14825a     // Catch:{ NoSuchFieldError -> 0x001d }
                h7.c r1 = h7.c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14825a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h7.c r1 = h7.c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.g.a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        f14822c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f14820a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f14822c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f14823d, (byte) -1);
        while (true) {
            byte[] bArr3 = f14821b;
            if (i10 < bArr3.length) {
                byte b11 = bArr3[i10];
                if (b11 > 0) {
                    f14823d[b11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.g.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char charAt = charSequence.charAt(i10);
            while (k(charAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    charAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    private static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
            if (i12 < 13) {
                if (i12 <= 0) {
                    if (!n(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
            } else {
                return (i11 - i10) - i12;
            }
        }
        return i11 - i10;
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb.append(913);
        } else if (i11 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) ((int) (j10 % 900));
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    static String e(String str, c cVar, Charset charset) {
        c a10;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f14824e;
        } else if (!f14824e.equals(charset) && (a10 = c.a(charset.name())) != null) {
            h(a10.d(), sb);
        }
        int length = str.length();
        int i10 = a.f14825a[cVar.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int b10 = b(str, i11);
                if (b10 >= 13) {
                    sb.append(902);
                    f(str, i11, b10, sb);
                    i11 += b10;
                    i12 = 0;
                    i13 = 2;
                } else {
                    int c10 = c(str, i11);
                    if (c10 >= 5 || b10 == length) {
                        if (i13 != 0) {
                            sb.append(900);
                            i12 = 0;
                            i13 = 0;
                        }
                        i12 = g(str, i11, c10, sb, i12);
                        i11 += c10;
                    } else {
                        int a11 = a(str, i11, charset);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int i14 = a11 + i11;
                        byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i13, sb);
                            i12 = 0;
                            i13 = 1;
                        }
                        i11 = i14;
                    }
                }
            }
        } else {
            sb.append(902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    private static void f(String str, int i10, int i11, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i12 = 0;
        while (i12 < i11) {
            sb2.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb3 = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_YES);
            int i13 = i10 + i12;
            sb3.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x00bc
            if (r7 == r6) goto L_0x0083
            if (r7 == r4) goto L_0x003c
            boolean r9 = m(r10)
            if (r9 == 0) goto L_0x0037
            byte[] r9 = f14823d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0037:
            r3.append(r15)
        L_0x003a:
            r7 = 0
            goto L_0x0011
        L_0x003c:
            boolean r11 = l(r10)
            if (r11 == 0) goto L_0x004c
            byte[] r9 = f14822c
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x004c:
            boolean r11 = j(r10)
            if (r11 == 0) goto L_0x0056
            r3.append(r13)
            goto L_0x003a
        L_0x0056:
            boolean r11 = i(r10)
            if (r11 == 0) goto L_0x0061
            r3.append(r14)
            goto L_0x00d8
        L_0x0061:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0076
            char r9 = r0.charAt(r9)
            boolean r9 = m(r9)
            if (r9 == 0) goto L_0x0076
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x0076:
            r3.append(r15)
            byte[] r9 = f14823d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0083:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x0096
            if (r10 != r12) goto L_0x008f
            r3.append(r11)
            goto L_0x00f2
        L_0x008f:
            int r10 = r10 + -97
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x0096:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x00a6
            r3.append(r14)
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00a6:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x00b0
            r3.append(r13)
            goto L_0x00e4
        L_0x00b0:
            r3.append(r15)
            byte[] r9 = f14823d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x00bc:
            boolean r9 = j(r10)
            if (r9 == 0) goto L_0x00cf
            if (r10 != r12) goto L_0x00c8
            r3.append(r11)
            goto L_0x00f2
        L_0x00c8:
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00cf:
            boolean r9 = i(r10)
            if (r9 == 0) goto L_0x00db
            r3.append(r14)
        L_0x00d8:
            r7 = 1
            goto L_0x0011
        L_0x00db:
            boolean r9 = l(r10)
            if (r9 == 0) goto L_0x00e7
            r3.append(r13)
        L_0x00e4:
            r7 = 2
            goto L_0x0011
        L_0x00e7:
            r3.append(r15)
            byte[] r9 = f14823d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
        L_0x00f2:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        L_0x00fc:
            if (r1 >= r0) goto L_0x011a
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x0104
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = 0
        L_0x0105:
            if (r9 == 0) goto L_0x0113
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x0117
        L_0x0113:
            char r8 = r3.charAt(r1)
        L_0x0117:
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x011a:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0124
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x0124:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i10, StringBuilder sb) {
        if (i10 >= 0 && i10 < 900) {
            sb.append(927);
            sb.append((char) i10);
        } else if (i10 < 810900) {
            sb.append(926);
            sb.append((char) ((i10 / 900) - 1));
            sb.append((char) (i10 % 900));
        } else if (i10 < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i10));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
        }
    }

    private static boolean i(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean k(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean l(char c10) {
        return f14822c[c10] != -1;
    }

    private static boolean m(char c10) {
        return f14823d[c10] != -1;
    }

    private static boolean n(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 13) {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }
}
