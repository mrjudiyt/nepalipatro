package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzemr implements zzemz {
    final /* synthetic */ zzems zza;

    zzemr(zzems zzems) {
        this.zza = zzems;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdfw zzdfw = (zzdfw) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdfw;
            this.zza.zzj.zzj();
        }
    }
}
