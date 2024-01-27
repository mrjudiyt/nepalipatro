package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzame implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzamg zzc;

    zzame(zzamg zzamg, String str, long j10) {
        this.zzc = zzamg;
        this.zza = str;
        this.zzb = j10;
    }

    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzamg zzamg = this.zzc;
        zzamg.zza.zzb(zzamg.toString());
    }
}
