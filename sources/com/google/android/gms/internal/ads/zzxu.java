package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzxu implements Runnable {
    public final /* synthetic */ zzxv zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzxu(zzxv zzxv, int i10, long j10, long j11) {
        this.zza = zzxv;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzb.zzV(this.zzb, this.zzc, this.zzd);
    }
}
