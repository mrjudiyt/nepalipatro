package com.google.firebase.sessions;

import android.os.SystemClock;
import h9.a;
import h9.c;
import h9.d;

/* compiled from: TimeProvider.kt */
public final class WallClock implements TimeProvider {
    public static final WallClock INSTANCE = new WallClock();
    private static final long US_PER_MILLIS = 1000;

    private WallClock() {
    }

    public long currentTimeUs() {
        return System.currentTimeMillis() * US_PER_MILLIS;
    }

    /* renamed from: elapsedRealtime-UwyO8pc  reason: not valid java name */
    public long m167elapsedRealtimeUwyO8pc() {
        a.C0251a aVar = a.f14840i;
        return c.i(SystemClock.elapsedRealtime(), d.MILLISECONDS);
    }
}
