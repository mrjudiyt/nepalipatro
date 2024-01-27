package f7;

import b7.b;
import com.google.zxing.a;
import com.google.zxing.c;
import java.util.Map;

/* compiled from: ITFWriter */
public final class l extends n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f14613a = {1, 1, 1, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f14614b = {3, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[][] f14615c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public b a(String str, a aVar, int i10, int i11, Map<c, ?> map) {
        if (aVar == a.ITF) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    public boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b10 = n.b(zArr, 0, f14613a, true);
            for (int i10 = 0; i10 < length; i10 += 2) {
                int digit = Character.digit(str.charAt(i10), 10);
                int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                int[] iArr = new int[10];
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = i11 * 2;
                    int[][] iArr2 = f14615c;
                    iArr[i12] = iArr2[digit][i11];
                    iArr[i12 + 1] = iArr2[digit2][i11];
                }
                b10 += n.b(zArr, b10, iArr, true);
            }
            n.b(zArr, b10, f14614b, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
