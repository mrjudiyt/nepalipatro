package androidx.window.core;

import kotlin.jvm.internal.m;

/* compiled from: SpecificationComputer.kt */
public final class WindowStrictModeException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowStrictModeException(String str) {
        super(str);
        m.f(str, "message");
    }
}
