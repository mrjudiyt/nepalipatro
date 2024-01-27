package k7;

import com.google.android.gms.common.api.Api;
import com.google.zxing.WriterException;
import j7.b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* compiled from: Encoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f15455a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15456a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                j7.b[] r0 = j7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15456a = r0
                j7.b r1 = j7.b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15456a     // Catch:{ NoSuchFieldError -> 0x001d }
                j7.b r1 = j7.b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15456a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j7.b r1 = j7.b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15456a     // Catch:{ NoSuchFieldError -> 0x0033 }
                j7.b r1 = j7.b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.c.a.<clinit>():void");
        }
    }

    static void a(String str, b7.a aVar, String str2) {
        try {
            for (byte c10 : str.getBytes(str2)) {
                aVar.c(c10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException((Throwable) e10);
        }
    }

    static void b(CharSequence charSequence, b7.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int p11 = p(charSequence.charAt(i11));
                    if (p11 != -1) {
                        aVar.c((p10 * 45) + p11, 11);
                        i10 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.c(p10, 6);
                    i10 = i11;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    static void c(String str, b bVar, b7.a aVar, String str2) {
        int i10 = a.f15456a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else if (i10 == 4) {
            e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    private static void d(b7.c cVar, b7.a aVar) {
        aVar.c(b.ECI.a(), 4);
        aVar.c(cVar.d(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, b7.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.e(java.lang.String, b7.a):void");
    }

    static void f(int i10, j7.c cVar, b bVar, b7.a aVar) {
        int d10 = bVar.d(cVar);
        int i11 = 1 << d10;
        if (i10 < i11) {
            aVar.c(i10, d10);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(b bVar, b7.a aVar) {
        aVar.c(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, b7.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    private static int i(b bVar, b7.a aVar, b7.a aVar2, j7.c cVar) {
        return aVar.g() + bVar.d(cVar) + aVar2.g();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(b7.a aVar, j7.a aVar2, j7.c cVar, b bVar) {
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (p(charAt) == -1) {
                return b.BYTE;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            return b.ALPHANUMERIC;
        }
        if (z11) {
            return b.NUMERIC;
        }
        return b.BYTE;
    }

    private static j7.c m(int i10, j7.a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            j7.c e10 = j7.c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k7.f n(java.lang.String r7, j7.a r8, java.util.Map<com.google.zxing.c, ?> r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            com.google.zxing.c r2 = com.google.zxing.c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            com.google.zxing.c r3 = com.google.zxing.c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            j7.b r4 = l(r7, r3)
            b7.a r5 = new b7.a
            r5.<init>()
            j7.b r6 = j7.b.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            b7.c r2 = b7.c.a(r3)
            if (r2 == 0) goto L_0x0036
            d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            com.google.zxing.c r2 = com.google.zxing.c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x005d
            com.google.zxing.c r0 = com.google.zxing.c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005d
            j7.b r0 = j7.b.FNC1_FIRST_POSITION
            g(r0, r5)
        L_0x005d:
            g(r4, r5)
            b7.a r0 = new b7.a
            r0.<init>()
            c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0095
            com.google.zxing.c r1 = com.google.zxing.c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0095
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            j7.c r9 = j7.c.e(r9)
            int r1 = i(r4, r5, r0, r9)
            boolean r1 = v(r1, r9, r8)
            if (r1 == 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0095:
            j7.c r9 = t(r8, r4, r5, r0)
        L_0x0099:
            b7.a r1 = new b7.a
            r1.<init>()
            r1.b(r5)
            if (r4 != r6) goto L_0x00a8
            int r7 = r0.i()
            goto L_0x00ac
        L_0x00a8:
            int r7 = r7.length()
        L_0x00ac:
            f(r7, r9, r4, r1)
            r1.b(r0)
            j7.c$b r7 = r9.c(r8)
            int r0 = r9.d()
            int r2 = r7.d()
            int r0 = r0 - r2
            u(r0, r1)
            int r2 = r9.d()
            int r7 = r7.c()
            b7.a r7 = r(r1, r2, r0, r7)
            k7.f r0 = new k7.f
            r0.<init>()
            r0.c(r8)
            r0.f(r4)
            r0.g(r9)
            int r1 = r9.b()
            k7.b r2 = new k7.b
            r2.<init>(r1, r1)
            int r1 = k(r7, r8, r9, r2)
            r0.d(r1)
            k7.e.a(r7, r8, r9, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.c.n(java.lang.String, j7.a, java.util.Map):k7.f");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[(length + i10)];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new c7.c(c7.a.f13352l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f15455a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new WriterException("EC bytes mismatch");
            } else if (i12 != i15 + i14) {
                throw new WriterException("RS blocks mismatch");
            } else if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
            } else {
                iArr[0] = i19;
                iArr2[0] = i21;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    static b7.a r(b7.a aVar, int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (aVar.i() == i14) {
            ArrayList<a> arrayList = new ArrayList<>(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i10, i11, i12, i19, iArr, iArr2);
                int i20 = iArr[0];
                byte[] bArr = new byte[i20];
                aVar.l(i16 << 3, bArr, 0, i20);
                byte[] o10 = o(bArr, iArr2[0]);
                arrayList.add(new a(bArr, o10));
                i17 = Math.max(i17, i20);
                i18 = Math.max(i18, o10.length);
                i16 += iArr[0];
            }
            if (i14 == i16) {
                b7.a aVar2 = new b7.a();
                for (int i21 = 0; i21 < i17; i21++) {
                    for (a a10 : arrayList) {
                        byte[] a11 = a10.a();
                        if (i21 < a11.length) {
                            aVar2.c(a11[i21], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i18; i22++) {
                    for (a b10 : arrayList) {
                        byte[] b11 = b10.b();
                        if (i22 < b11.length) {
                            aVar2.c(b11[i22], 8);
                        }
                    }
                }
                if (i13 == aVar2.i()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i13 + " and " + aVar2.i() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                byte b10 = bytes[i10] & 255;
                if ((b10 < 129 || b10 > 159) && (b10 < 224 || b10 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static j7.c t(j7.a aVar, b bVar, b7.a aVar2, b7.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, j7.c.e(1)), aVar)), aVar);
    }

    static void u(int i10, b7.a aVar) {
        int i11 = i10 << 3;
        if (aVar.g() <= i11) {
            for (int i12 = 0; i12 < 4 && aVar.g() < i11; i12++) {
                aVar.a(false);
            }
            int g10 = aVar.g() & 7;
            if (g10 > 0) {
                while (g10 < 8) {
                    aVar.a(false);
                    g10++;
                }
            }
            int i13 = i10 - aVar.i();
            for (int i14 = 0; i14 < i13; i14++) {
                aVar.c((i14 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.g() != i11) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.g() + " > " + i11);
    }

    private static boolean v(int i10, j7.c cVar, j7.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
