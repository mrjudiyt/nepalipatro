package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzgaf extends zzfym {
    private final ExecutorService zza;

    zzgaf(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.zza = executorService;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.zza.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    public final void shutdown() {
        this.zza.shutdown();
    }

    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.zza;
        String obj = super.toString();
        String valueOf = String.valueOf(executorService);
        return obj + "[" + valueOf + "]";
    }
}
