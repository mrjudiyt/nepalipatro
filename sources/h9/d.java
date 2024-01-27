package h9;

import java.util.concurrent.TimeUnit;

/* compiled from: DurationUnitJvm.kt */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: h  reason: collision with root package name */
    private final TimeUnit f14855h;

    private d(TimeUnit timeUnit) {
        this.f14855h = timeUnit;
    }

    public final TimeUnit d() {
        return this.f14855h;
    }
}
