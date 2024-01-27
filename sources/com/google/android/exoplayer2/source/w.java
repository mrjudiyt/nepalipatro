package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* compiled from: ShuffleOrder */
public interface w {

    /* compiled from: ShuffleOrder */
    public static class a implements w {

        /* renamed from: a  reason: collision with root package name */
        private final Random f7587a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f7588b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f7589c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        public int a() {
            return this.f7588b.length;
        }

        public w b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[(this.f7588b.length - i12)];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f7588b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f7587a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        public int c() {
            int[] iArr = this.f7588b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        public int d(int i10) {
            int i11 = this.f7589c[i10] - 1;
            if (i11 >= 0) {
                return this.f7588b[i11];
            }
            return -1;
        }

        public int e(int i10) {
            int i11 = this.f7589c[i10] + 1;
            int[] iArr = this.f7588b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        public w f(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f7587a.nextInt(this.f7588b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f7587a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f7588b.length + i11)];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f7588b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f7587a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        public int g() {
            int[] iArr = this.f7588b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        public w h() {
            return new a(0, new Random(this.f7587a.nextLong()));
        }

        public a(int[] iArr, long j10) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j10));
        }

        private a(int i10, Random random) {
            this(i(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f7588b = iArr;
            this.f7587a = random;
            this.f7589c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f7589c[iArr[i10]] = i10;
            }
        }
    }

    int a();

    w b(int i10, int i11);

    int c();

    int d(int i10);

    int e(int i10);

    w f(int i10, int i11);

    int g();

    w h();
}
