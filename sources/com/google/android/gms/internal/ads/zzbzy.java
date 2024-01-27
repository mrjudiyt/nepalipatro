package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbzy extends zzb {
    final /* synthetic */ zzcac zza;

    zzbzy(zzcac zzcac) {
        this.zza = zzcac;
    }

    public final void zza() {
        zzcac zzcac = this.zza;
        zzbco zzbco = new zzbco(zzcac.zze, zzcac.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                zzt.zze();
                zzbcr.zza(this.zza.zzh, zzbco);
            } catch (IllegalArgumentException e10) {
                zzcat.zzk("Cannot config CSI reporter.", e10);
            }
        }
    }
}
