package androidx.core.util;

import java.util.Objects;

/* compiled from: Preconditions */
public final class h {
    public static int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T c(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
