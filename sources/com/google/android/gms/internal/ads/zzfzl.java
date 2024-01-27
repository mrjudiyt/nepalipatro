package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfzl extends zzfzk {
    private final e zza;

    zzfzl(e eVar) {
        Objects.requireNonNull(eVar);
        this.zza = eVar;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    public final Object get() {
        return this.zza.get();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        return this.zza.get(j10, timeUnit);
    }
}
