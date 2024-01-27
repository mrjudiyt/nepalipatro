package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcce implements Runnable {
    final /* synthetic */ zzccg zza;

    zzcce(zzccg zzccg) {
        this.zza = zzccg;
    }

    public final void run() {
        zzccg zzccg = this.zza;
        if (zzccg.zzq != null) {
            if (!zzccg.zzr) {
                zzccg.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
