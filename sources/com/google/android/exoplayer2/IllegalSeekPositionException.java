package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {

    /* renamed from: h  reason: collision with root package name */
    public final a1 f6219h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6220i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6221j;

    public IllegalSeekPositionException(a1 a1Var, int i10, long j10) {
        this.f6219h = a1Var;
        this.f6220i = i10;
        this.f6221j = j10;
    }
}
