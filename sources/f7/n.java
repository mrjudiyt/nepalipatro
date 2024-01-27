package f7;

import b7.b;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.e;
import java.util.Map;

/* compiled from: OneDimensionalCodeWriter */
public abstract class n implements e {
    protected static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    private static b e(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        b bVar = new b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.i(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        } else {
            int d10 = d();
            if (map != null) {
                c cVar = c.MARGIN;
                if (map.containsKey(cVar)) {
                    d10 = Integer.parseInt(map.get(cVar).toString());
                }
            }
            return e(c(str), i10, i11, d10);
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
