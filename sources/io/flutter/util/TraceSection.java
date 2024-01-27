package io.flutter.util;

import h1.a;

public final class TraceSection {
    public static void begin(String str) {
        a.c(cropSectionName(str));
    }

    public static void beginAsyncSection(String str, int i10) {
        a.a(cropSectionName(str), i10);
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
        a.f();
    }

    public static void endAsyncSection(String str, int i10) {
        a.d(cropSectionName(str), i10);
    }
}
