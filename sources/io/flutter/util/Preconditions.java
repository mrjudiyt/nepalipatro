package io.flutter.util;

import java.util.Objects;

public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
