package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzbm implements Runnable {
    final /* synthetic */ zzex zza;
    final /* synthetic */ zzbq zzb;

    zzbm(zzbq zzbq, zzex zzex) {
        this.zzb = zzbq;
        this.zza = zzex;
    }

    public final void run() {
        this.zzb.zza.zzj(this.zza);
    }
}
