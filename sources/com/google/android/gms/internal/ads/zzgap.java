package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgap extends zzfzj {
    /* access modifiers changed from: private */
    public e zza;
    /* access modifiers changed from: private */
    public ScheduledFuture zzb;

    private zzgap(e eVar) {
        Objects.requireNonNull(eVar);
        this.zza = eVar;
    }

    static e zzf(e eVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgap zzgap = new zzgap(eVar);
        zzgam zzgam = new zzgam(zzgap);
        zzgap.zzb = scheduledExecutorService.schedule(zzgam, j10, timeUnit);
        eVar.addListener(zzgam, zzfzh.INSTANCE);
        return zzgap;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        e eVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (eVar == null) {
            return null;
        }
        String str = "inputFuture=[" + eVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
