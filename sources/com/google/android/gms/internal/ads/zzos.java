package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzos implements Runnable {
    public final /* synthetic */ zzpb zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzos(zzpb zzpb, int i10, long j10, long j11) {
        this.zza = zzpb;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}
