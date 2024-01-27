package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public class DataSourceException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    public final int f7648h;

    public DataSourceException(int i10) {
        this.f7648h = i10;
    }

    public DataSourceException(Throwable th, int i10) {
        super(th);
        this.f7648h = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f7648h = i10;
    }

    public DataSourceException(String str, Throwable th, int i10) {
        super(str, th);
        this.f7648h = i10;
    }
}
