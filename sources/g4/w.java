package g4;

import a6.m0;

/* compiled from: WavUtil */
public final class w {
    public static int a(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                return 0;
            }
        }
        return m0.W(i11);
    }
}
