package com.google.firebase.components;

import java.util.Objects;

public final class Preconditions {
    public static void checkArgument(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static void checkState(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
