package t6;

import java.util.Objects;

/* compiled from: $Gson$Preconditions */
public final class a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }
}
