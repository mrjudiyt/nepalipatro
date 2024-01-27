package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzw implements Runnable {
    public final /* synthetic */ zzaac zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzzw(zzaac zzaac, long j10, int i10) {
        this.zza = zzaac;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
