package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgai extends zzgaf implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    zzgai(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgas zze = zzgas.zze(runnable, (Object) null);
        return new zzgag(zze, scheduledExecutorService.schedule(zze, j10, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgah zzgah = new zzgah(runnable);
        return new zzgag(zzgah, this.zza.scheduleAtFixedRate(zzgah, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgah zzgah = new zzgah(runnable);
        return new zzgag(zzgah, this.zza.scheduleWithFixedDelay(zzgah, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzgas zzgas = new zzgas(callable);
        return new zzgag(zzgas, this.zza.schedule(zzgas, j10, timeUnit));
    }
}
