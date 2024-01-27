package ea;

import ea.h;
import kotlin.jvm.internal.m;

/* compiled from: -Base64.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f14343a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f14344b;

    static {
        h.a aVar = h.f14364l;
        f14343a = aVar.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").g();
        f14344b = aVar.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").g();
    }

    public static final String a(byte[] bArr, byte[] bArr2) {
        m.g(bArr, "$this$encodeBase64");
        m.g(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i19] = b14;
            bArr3[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i22] = bArr2[(b16 & 15) << 2];
            bArr3[i22 + 1] = (byte) 61;
        }
        return b.b(bArr3);
    }

    public static /* synthetic */ String b(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f14343a;
        }
        return a(bArr, bArr2);
    }
}
