package f7;

import b7.b;
import com.google.zxing.FormatException;
import com.google.zxing.a;
import com.google.zxing.c;
import java.util.Map;

/* compiled from: EAN8Writer */
public final class k extends q {
    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == a.EAN_8) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b10 = n.b(zArr, 0, p.f14617a, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            b10 += n.b(zArr, b10, p.f14620d[Character.digit(str.charAt(i10), 10)], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f14618b, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            b11 += n.b(zArr, b11, p.f14620d[Character.digit(str.charAt(i11), 10)], true);
        }
        n.b(zArr, b11, p.f14617a, true);
        return zArr;
    }
}
