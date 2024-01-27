package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: j  reason: collision with root package name */
    private static final FormatException f14062j;

    static {
        FormatException formatException = new FormatException();
        f14062j = formatException;
        formatException.setStackTrace(ReaderException.f14065i);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f14064h ? new FormatException() : f14062j;
    }
}
