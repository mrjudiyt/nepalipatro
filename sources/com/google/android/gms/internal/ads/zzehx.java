package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzehx implements zzfzp {
    final /* synthetic */ zzfcr zza;
    final /* synthetic */ zzehy zzb;

    zzehx(zzehy zzehy, zzfcr zzfcr) {
        this.zzb = zzehy;
        this.zza = zzfcr;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzb(th, this.zza);
            if (this.zzb.zzh.zze()) {
                zzehy zzehy = this.zzb;
                zzehy.zze(zzehy.zzh.zza());
            }
        }
    }

    public final void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzc(obj, this.zza);
            if (this.zzb.zzh.zze()) {
                zzehy zzehy = this.zzb;
                zzehy.zze(zzehy.zzh.zza());
            }
        }
    }
}
