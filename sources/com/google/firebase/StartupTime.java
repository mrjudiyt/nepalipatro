package com.google.firebase;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class StartupTime {
    public static StartupTime create(long j10, long j11, long j12) {
        return new AutoValue_StartupTime(j10, j11, j12);
    }

    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
