package a6;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: NalUnitUtil */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f244a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f245b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f246c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f247d = new int[10];

    /* compiled from: NalUnitUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f248a;

        /* renamed from: b  reason: collision with root package name */
        public final int f249b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f250c;

        public a(int i10, int i11, boolean z10) {
            this.f248a = i10;
            this.f249b = i11;
            this.f250c = z10;
        }
    }

    /* compiled from: NalUnitUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f251a;

        /* renamed from: b  reason: collision with root package name */
        public final int f252b;

        /* renamed from: c  reason: collision with root package name */
        public final int f253c;

        /* renamed from: d  reason: collision with root package name */
        public final int f254d;

        /* renamed from: e  reason: collision with root package name */
        public final int f255e;

        /* renamed from: f  reason: collision with root package name */
        public final int f256f;

        /* renamed from: g  reason: collision with root package name */
        public final float f257g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f258h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f259i;

        /* renamed from: j  reason: collision with root package name */
        public final int f260j;

        /* renamed from: k  reason: collision with root package name */
        public final int f261k;

        /* renamed from: l  reason: collision with root package name */
        public final int f262l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f263m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f251a = i10;
            this.f252b = i11;
            this.f253c = i12;
            this.f254d = i13;
            this.f255e = i14;
            this.f256f = i15;
            this.f257g = f10;
            this.f258h = z10;
            this.f259i = z11;
            this.f260j = i16;
            this.f261k = i17;
            this.f262l = i18;
            this.f263m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                byte b10 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (b10 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b10 == 0) {
                    i11++;
                }
                if (b10 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        boolean z11 = false;
        a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) : !(bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            zArr[0] = z10;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z11 = true;
            }
            zArr[2] = z11;
            return i11;
        } else {
            a(zArr);
            return i10 - 1;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b10 & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        z zVar = new z(bArr, i10, i11);
        zVar.l(8);
        int h10 = zVar.h();
        int h11 = zVar.h();
        zVar.k();
        return new a(h10, h11, zVar.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a6.u.b i(byte[] r21, int r22, int r23) {
        /*
            a6.z r0 = new a6.z
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.l(r1)
            int r3 = r0.e(r1)
            int r4 = r0.e(r1)
            int r5 = r0.e(r1)
            int r6 = r0.h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.h()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.d()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.h()
            r0.h()
            r0.k()
            boolean r12 = r0.d()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.d()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            j(r0, r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.h()
            int r12 = r12 + 4
            int r13 = r0.h()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.h()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.d()
            r0.g()
            r0.g()
            int r15 = r0.h()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.h()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.h()
            r0.k()
            int r1 = r0.h()
            int r1 = r1 + r9
            int r2 = r0.h()
            int r2 = r2 + r9
            boolean r16 = r0.d()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d9
            r0.k()
        L_0x00d9:
            r0.k()
            r2 = 16
            int r1 = r1 * 16
            int r7 = r7 * 16
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x011c
            int r2 = r0.h()
            int r8 = r0.h()
            int r17 = r0.h()
            int r18 = r0.h()
            if (r10 != 0) goto L_0x00fd
            int r10 = 2 - r16
            goto L_0x0112
        L_0x00fd:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0106
            r9 = 1
            r20 = 1
            goto L_0x0109
        L_0x0106:
            r9 = 1
            r20 = 2
        L_0x0109:
            if (r10 != r9) goto L_0x010c
            r9 = 2
        L_0x010c:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x0112:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x011c:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x016a
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x016a
            r2 = 8
            int r2 = r0.e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0149
            r9 = 16
            int r2 = r0.e(r9)
            int r0 = r0.e(r9)
            if (r2 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0147:
            r9 = r1
            goto L_0x016c
        L_0x0149:
            float[] r0 = f245b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x0152
            r0 = r0[r2]
            r9 = r0
            goto L_0x016c
        L_0x0152:
            r0 = 46
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = r9.toString()
            java.lang.String r2 = "NalUnitUtil"
            a6.p.h(r2, r0)
        L_0x016a:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x016c:
            a6.u$b r0 = new a6.u$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.u.i(byte[], int, int):a6.u$b");
    }

    private static void j(z zVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((zVar.g() + i12) + UserVerificationMethods.USER_VERIFY_HANDPRINT) % UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static int k(byte[] bArr, int i10) {
        int i11;
        synchronized (f246c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f247d;
                        if (iArr.length <= i13) {
                            f247d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f247d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f247d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
