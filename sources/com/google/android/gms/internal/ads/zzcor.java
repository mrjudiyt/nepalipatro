package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcor implements Runnable {
    public final /* synthetic */ zzcot zza;
    public final /* synthetic */ Throwable zzb;
    public final /* synthetic */ zzfjx zzc;
    public final /* synthetic */ String zzd;

    public /* synthetic */ zzcor(zzcot zzcot, Throwable th, zzfjx zzfjx, String str) {
        this.zza = zzcot;
        this.zzb = th;
        this.zzc = zzfjx;
        this.zzd = str;
    }

    public final void run() {
        zzcot zzcot = this.zza;
        zzcou zzcou = zzcot.zzc;
        zzcou.zzh = zzbty.zza(zzcou.zza);
        zzcot.zzc.zzh.zzf(this.zzb, "AttributionReporting.registerSourceAndPingClickUrl");
        this.zzc.zzc(this.zzd, (zzfje) null);
    }
}
