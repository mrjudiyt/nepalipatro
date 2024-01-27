package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzelp implements zzemz {
    final /* synthetic */ zzelq zza;

    zzelp(zzelq zzelq) {
        this.zza = zzelq;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqv zzcqv = (zzcqv) obj;
        synchronized (this.zza) {
            zzelq zzelq = this.zza;
            if (zzelq.zzi != null) {
                zzelq.zzi.zzb();
            }
            this.zza.zzi = zzcqv;
            this.zza.zzi.zzj();
        }
    }
}
