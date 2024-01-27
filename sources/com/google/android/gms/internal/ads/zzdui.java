package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdui implements Runnable {
    public final /* synthetic */ zzdur zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcbl zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfit zzf;

    public /* synthetic */ zzdui(zzdur zzdur, Object obj, zzcbl zzcbl, String str, long j10, zzfit zzfit) {
        this.zza = zzdur;
        this.zzb = obj;
        this.zzc = zzcbl;
        this.zzd = str;
        this.zze = j10;
        this.zzf = zzfit;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
