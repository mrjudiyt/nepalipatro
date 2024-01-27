package com.google.android.exoplayer2.drm;

public final class UnsupportedDrmException extends Exception {

    /* renamed from: h  reason: collision with root package name */
    public final int f6553h;

    public UnsupportedDrmException(int i10) {
        this.f6553h = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f6553h = i10;
    }
}
