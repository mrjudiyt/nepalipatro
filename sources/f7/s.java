package f7;

import b7.b;
import com.google.zxing.FormatException;
import com.google.zxing.a;
import com.google.zxing.c;
import java.util.Map;

/* compiled from: UPCEWriter */
public final class s extends q {
    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == a.UPC_E) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(r.c(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i10 = r.f14623g[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b10 = n.b(zArr, 0, p.f14617a, true) + 0;
            for (int i11 = 1; i11 <= 6; i11++) {
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (((i10 >> (6 - i11)) & 1) == 1) {
                    digit2 += 10;
                }
                b10 += n.b(zArr, b10, p.f14621e[digit2], false);
            }
            n.b(zArr, b10, p.f14619c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
