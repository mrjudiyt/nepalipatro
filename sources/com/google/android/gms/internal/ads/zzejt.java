package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzejt implements Runnable {
    public final /* synthetic */ zzeju zza;
    public final /* synthetic */ zzfde zzb;
    public final /* synthetic */ zzfcr zzc;
    public final /* synthetic */ zzeex zzd;

    public /* synthetic */ zzejt(zzeju zzeju, zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        this.zza = zzeju;
        this.zzb = zzfde;
        this.zzc = zzfcr;
        this.zzd = zzeex;
    }

    public final void run() {
        zzejw.zze(this.zzb, this.zzc, this.zzd);
    }
}
