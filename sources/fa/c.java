package fa;

import ea.w;
import kotlin.jvm.internal.m;

/* compiled from: SegmentedByteString.kt */
public final class c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        m.g(iArr, "$this$binarySearch");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 <= i10) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(w wVar, int i10) {
        m.g(wVar, "$this$segment");
        int a10 = a(wVar.z(), i10 + 1, 0, wVar.A().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
