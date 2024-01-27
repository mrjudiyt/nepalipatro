package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcca implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzccg zzc;

    zzcca(zzccg zzccg, String str, String str2) {
        this.zzc = zzccg;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        zzccg zzccg = this.zzc;
        if (zzccg.zzq != null) {
            zzccg.zzq.zzb(this.zza, this.zzb);
        }
    }
}
