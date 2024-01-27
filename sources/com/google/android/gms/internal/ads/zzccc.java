package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzccc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzccg zzc;

    zzccc(zzccg zzccg, int i10, int i11) {
        this.zzc = zzccg;
        this.zza = i10;
        this.zzb = i11;
    }

    public final void run() {
        zzccg zzccg = this.zzc;
        if (zzccg.zzq != null) {
            zzccg.zzq.zzj(this.zza, this.zzb);
        }
    }
}
