package g4;

/* compiled from: MpegAudioUtil */
public final class u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f8867a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8868b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8869c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8870d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f8871e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f8872f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f8873g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f8874a;

        /* renamed from: b  reason: collision with root package name */
        public String f8875b;

        /* renamed from: c  reason: collision with root package name */
        public int f8876c;

        /* renamed from: d  reason: collision with root package name */
        public int f8877d;

        /* renamed from: e  reason: collision with root package name */
        public int f8878e;

        /* renamed from: f  reason: collision with root package name */
        public int f8879f;

        /* renamed from: g  reason: collision with root package name */
        public int f8880g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!u.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f8874a = i11;
            this.f8875b = u.f8867a[3 - i12];
            int i15 = u.f8868b[i14];
            this.f8877d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f8877d = i15 / 2;
            } else if (i11 == 0) {
                this.f8877d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            this.f8880g = u.k(i11, i12);
            if (i12 == 3) {
                int i18 = i11 == 3 ? u.f8869c[i13 - 1] : u.f8870d[i13 - 1];
                this.f8879f = i18;
                this.f8876c = (((i18 * 12) / this.f8877d) + i17) * 4;
            } else {
                int i19 = 144;
                if (i11 == 3) {
                    int i20 = i12 == 2 ? u.f8871e[i13 - 1] : u.f8872f[i13 - 1];
                    this.f8879f = i20;
                    this.f8876c = ((i20 * 144) / this.f8877d) + i17;
                } else {
                    int i21 = u.f8873g[i13 - 1];
                    this.f8879f = i21;
                    if (i12 == 1) {
                        i19 = 72;
                    }
                    this.f8876c = ((i19 * i21) / this.f8877d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f8878e = i16;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f8868b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f8869c[i13 - 1] : f8870d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f8871e[i13 - 1] : f8872f[i13 - 1];
        } else {
            i15 = f8873g[i13 - 1];
        }
        int i18 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return ((i18 * i15) / i16) + i17;
    }

    /* access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & -2097152) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
