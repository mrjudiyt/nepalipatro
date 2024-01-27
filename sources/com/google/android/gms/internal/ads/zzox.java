package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzox implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzox(zzpb zzpb, String str, long j10, long j11) {
        this.zza = zzpb;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd);
    }
}
