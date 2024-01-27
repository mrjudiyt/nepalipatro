package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegl implements Runnable {
    public final /* synthetic */ zzego zza;
    public final /* synthetic */ zzfde zzb;
    public final /* synthetic */ zzfcr zzc;

    public /* synthetic */ zzegl(zzego zzego, zzfde zzfde, zzfcr zzfcr) {
        this.zza = zzego;
        this.zzb = zzfde;
        this.zzc = zzfcr;
    }

    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}
