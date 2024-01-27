package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzccd implements Runnable {
    final /* synthetic */ zzccg zza;

    zzccd(zzccg zzccg) {
        this.zza = zzccg;
    }

    public final void run() {
        zzccg zzccg = this.zza;
        if (zzccg.zzq != null) {
            zzccg.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}
