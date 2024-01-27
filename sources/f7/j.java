package f7;

import b7.b;
import com.google.zxing.FormatException;
import com.google.zxing.a;
import com.google.zxing.c;
import java.util.Map;

/* compiled from: EAN13Writer */
public final class j extends q {
    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 13) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i10 = i.f14612f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b10 = n.b(zArr, 0, p.f14617a, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            b10 += n.b(zArr, b10, p.f14621e[digit], false);
        }
        int b11 = b10 + n.b(zArr, b10, p.f14618b, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            b11 += n.b(zArr, b11, p.f14620d[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, b11, p.f14617a, true);
        return zArr;
    }
}
