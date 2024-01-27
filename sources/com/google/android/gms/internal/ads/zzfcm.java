package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfcm implements zzemz {
    final /* synthetic */ zzfco zza;

    zzfcm(zzfco zzfco) {
        this.zza = zzfco;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzd = (zzdox) obj;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdn)).booleanValue()) {
                ((zzdox) obj).zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzj();
        }
    }
}
