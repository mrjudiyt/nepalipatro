package com.google.android.exoplayer2;

import b6.y;
import e4.b;

public class PlaybackException extends Exception {

    /* renamed from: j  reason: collision with root package name */
    public static final b<PlaybackException> f6224j = y.f5134a;

    /* renamed from: h  reason: collision with root package name */
    public final int f6225h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6226i;

    protected PlaybackException(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f6225h = i10;
        this.f6226i = j10;
    }
}
