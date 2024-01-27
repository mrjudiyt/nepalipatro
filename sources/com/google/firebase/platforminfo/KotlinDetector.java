package com.google.firebase.platforminfo;

import o8.e;

public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return e.f16175m.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
