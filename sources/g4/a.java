package g4;

import a6.p;
import a6.x;
import com.google.android.exoplayer2.ParserException;

/* compiled from: AacUtil */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8823a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8824b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8825a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8826b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8827c;

        private b(int i10, int i11, String str) {
            this.f8825a = i10;
            this.f8826b = i11;
            this.f8827c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int b(x xVar) {
        int h10 = xVar.h(5);
        return h10 == 31 ? xVar.h(6) + 32 : h10;
    }

    public static int c(int i10) {
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    private static int d(x xVar) {
        int h10 = xVar.h(4);
        if (h10 == 15) {
            return xVar.h(24);
        }
        if (h10 < 13) {
            return f8823a[h10];
        }
        throw ParserException.a((String) null, (Throwable) null);
    }

    public static b e(x xVar, boolean z10) {
        int b10 = b(xVar);
        int d10 = d(xVar);
        int h10 = xVar.h(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append("mp4a.40.");
        sb.append(b10);
        String sb2 = sb.toString();
        if (b10 == 5 || b10 == 29) {
            d10 = d(xVar);
            b10 = b(xVar);
            if (b10 == 22) {
                h10 = xVar.h(4);
            }
        }
        if (z10) {
            if (!(b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 6 || b10 == 7 || b10 == 17)) {
                switch (b10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb3 = new StringBuilder(42);
                        sb3.append("Unsupported audio object type: ");
                        sb3.append(b10);
                        throw ParserException.d(sb3.toString());
                }
            }
            g(xVar, b10, h10);
            switch (b10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = xVar.h(2);
                    if (h11 == 2 || h11 == 3) {
                        StringBuilder sb4 = new StringBuilder(33);
                        sb4.append("Unsupported epConfig: ");
                        sb4.append(h11);
                        throw ParserException.d(sb4.toString());
                    }
            }
        }
        int i10 = f8824b[h10];
        if (i10 != -1) {
            return new b(d10, i10, sb2);
        }
        throw ParserException.a((String) null, (Throwable) null);
    }

    public static b f(byte[] bArr) {
        return e(new x(bArr), false);
    }

    private static void g(x xVar, int i10, int i11) {
        if (xVar.g()) {
            p.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.g()) {
            xVar.r(14);
        }
        boolean g10 = xVar.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                xVar.r(3);
            }
            if (g10) {
                if (i10 == 22) {
                    xVar.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    xVar.r(3);
                }
                xVar.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
