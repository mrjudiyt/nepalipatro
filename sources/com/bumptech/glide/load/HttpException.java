package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    private final int f5633h;

    public HttpException(int i10) {
        this("Http request failed with status code: " + i10, i10);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i10) {
        this(str, i10, (Throwable) null);
    }

    public HttpException(String str, int i10, Throwable th) {
        super(str, th);
        this.f5633h = i10;
    }
}
