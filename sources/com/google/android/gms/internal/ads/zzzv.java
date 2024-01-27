package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzv implements Runnable {
    public final /* synthetic */ zzaac zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzzv(zzaac zzaac, Object obj, long j10) {
        this.zza = zzaac;
        this.zzb = obj;
        this.zzc = j10;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
