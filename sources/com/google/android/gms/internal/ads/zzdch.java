package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdch implements zzdag {
    private int zza = ((Integer) zzba.zzc().zzb(zzbci.zzbf)).intValue();

    public final void zzbr(zzbvg zzbvg) {
    }

    public final synchronized void zzbs(zzfde zzfde) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzbg)).booleanValue()) {
            try {
                this.zza = zzfde.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
