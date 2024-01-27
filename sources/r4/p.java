package r4;

import a6.a;
import k4.b0;

/* compiled from: TrackEncryptionBox */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11152b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.a f11153c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11154d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f11155e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11 = true;
        a.a((bArr2 != null ? false : z11) ^ (i10 == 0));
        this.f11151a = z10;
        this.f11152b = str;
        this.f11154d = i10;
        this.f11155e = bArr2;
        this.f11153c = new b0.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 68);
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                a6.p.h("TrackEncryptionBox", sb.toString());
                break;
        }
        return 1;
    }
}
