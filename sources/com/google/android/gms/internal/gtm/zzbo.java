package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzbo implements Runnable {
    final /* synthetic */ zzcz zza;
    final /* synthetic */ zzbq zzb;

    zzbo(zzbq zzbq, zzcz zzcz) {
        this.zzb = zzbq;
        this.zza = zzcz;
    }

    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
