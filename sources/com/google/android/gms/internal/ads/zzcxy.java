package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcxy extends zzdcz implements zzcxp {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzcxy(zzcxx zzcxx, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        zzo(zzcxx, executor);
    }

    public final void zza(zze zze) {
        zzt(new zzcxq(zze));
    }

    public final void zzb() {
        zzt(zzcxr.zza);
    }

    public final void zzc(zzdhe zzdhe) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzt(new zzcxt(zzdhe));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcat.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdhe("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        int intValue = ((Integer) zzba.zzc().zzb(zzbci.zzjR)).intValue();
        this.zzc = this.zzb.schedule(new zzcxs(this), (long) intValue, TimeUnit.MILLISECONDS);
    }
}
