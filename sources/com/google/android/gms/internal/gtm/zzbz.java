package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzbz implements Runnable {
    final /* synthetic */ zzcb zza;
    final /* synthetic */ zzey zzb;

    zzbz(zzcb zzcb, zzey zzey, byte[] bArr) {
        this.zza = zzcb;
        this.zzb = zzey;
    }

    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzF("Connected to service after a timeout");
            zzcc.zzi(this.zza.zza, this.zzb);
        }
    }
}
