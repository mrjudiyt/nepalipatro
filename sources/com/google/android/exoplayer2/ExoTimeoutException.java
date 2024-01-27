package com.google.android.exoplayer2;

public final class ExoTimeoutException extends RuntimeException {

    /* renamed from: h  reason: collision with root package name */
    public final int f6218h;

    public ExoTimeoutException(int i10) {
        super(a(i10));
        this.f6218h = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
