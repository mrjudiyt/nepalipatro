package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzbk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzbq zzc;

    zzbk(zzbq zzbq, String str, Runnable runnable) {
        this.zzc = zzbq;
        this.zza = str;
        this.zzb = runnable;
    }

    public final void run() {
        this.zzc.zza.zzn(this.zza);
        this.zzb.run();
    }
}
