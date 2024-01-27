package g9;

import d9.f;

/* compiled from: CharJVM.kt */
class b {
    public static int a(int i10) {
        if (new f(2, 36).f(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new f(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit(c10, i10);
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
