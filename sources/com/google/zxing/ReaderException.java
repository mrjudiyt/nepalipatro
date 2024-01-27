package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: h  reason: collision with root package name */
    protected static final boolean f14064h = (System.getProperty("surefire.test.class.path") != null);

    /* renamed from: i  reason: collision with root package name */
    protected static final StackTraceElement[] f14065i = new StackTraceElement[0];

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
