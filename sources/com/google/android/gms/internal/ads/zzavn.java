package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavn implements Runnable {
    final /* synthetic */ zzavo zza;

    zzavn(zzavo zzavo) {
        this.zza = zzavo;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzavo zzavo = this.zza;
            if (!zzavo.zzd || !zzavo.zze) {
                zzcat.zze("App is still foreground");
            } else {
                zzavo.zzd = false;
                zzcat.zze("App went background");
                for (zzavp zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e10) {
                        zzcat.zzh("", e10);
                    }
                }
            }
        }
    }
}
