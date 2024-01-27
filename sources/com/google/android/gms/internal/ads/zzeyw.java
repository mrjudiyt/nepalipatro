package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeyw implements zzemz {
    final /* synthetic */ zzeyx zza;

    zzeyw(zzeyx zzeyx) {
        this.zza = zzeyx;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqp zzcqp = (zzcqp) obj;
        synchronized (this.zza) {
            zzcqp zzcqp2 = this.zza.zza;
            if (zzcqp2 != null) {
                zzcqp2.zzb();
            }
            zzeyx zzeyx = this.zza;
            zzeyx.zza = zzcqp;
            zzcqp.zzc(zzeyx);
            zzeyx zzeyx2 = this.zza;
            zzeyx2.zzg.zzk(new zzcqq(zzcqp, zzeyx2, zzeyx2.zzg, zzeyx2.zzi));
            zzcqp.zzj();
        }
    }
}
