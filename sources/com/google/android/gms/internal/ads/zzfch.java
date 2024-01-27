package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfch implements zzemz {
    final /* synthetic */ zzfci zza;

    zzfch(zzfci zzfci) {
        this.zza = zzfci;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzi = (zzdox) obj;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzdn)).booleanValue()) {
                ((zzdox) obj).zzd().zza = this.zza.zzd;
            }
            this.zza.zzi.zzj();
        }
    }
}
