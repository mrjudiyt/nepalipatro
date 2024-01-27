package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzzs implements Runnable {
    public final /* synthetic */ zzaac zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzzs(zzaac zzaac, String str, long j10, long j11) {
        this.zza = zzaac;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = j11;
    }

    public final void run() {
        this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}
