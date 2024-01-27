package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgam implements Runnable {
    zzgap zza;

    zzgam(zzgap zzgap) {
        this.zza = zzgap;
    }

    public final void run() {
        e zze;
        String str;
        zzgap zzgap = this.zza;
        if (zzgap != null && (zze = zzgap.zza) != null) {
            this.zza = null;
            if (zze.isDone()) {
                zzgap.zzs(zze);
                return;
            }
            try {
                ScheduledFuture zzv = zzgap.zzb;
                zzgap.zzb = null;
                str = "Timed out";
                if (zzv != null) {
                    long abs = Math.abs(zzv.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzgap.zzd(new zzgao(str + ": " + zze.toString(), (zzgan) null));
                zze.cancel(true);
            } catch (Throwable th) {
                zze.cancel(true);
                throw th;
            }
        }
    }
}
