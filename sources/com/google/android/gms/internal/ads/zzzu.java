package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzu implements Runnable {
    public final /* synthetic */ zzaac zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzzu(zzaac zzaac, int i10, long j10) {
        this.zza = zzaac;
        this.zzb = i10;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
