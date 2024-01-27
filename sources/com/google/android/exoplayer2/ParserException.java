package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6222h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6223i;

    protected ParserException(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f6222h = z10;
        this.f6223i = i10;
    }

    public static ParserException a(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException b(String str, Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException c(String str, Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException d(String str) {
        return new ParserException(str, (Throwable) null, false, 1);
    }
}
