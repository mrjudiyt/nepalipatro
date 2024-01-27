package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: j  reason: collision with root package name */
    private static final NotFoundException f14063j;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f14063j = notFoundException;
        notFoundException.setStackTrace(ReaderException.f14065i);
    }

    private NotFoundException() {
    }
}
