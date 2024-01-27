package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsa implements zzhbc {
    private final zzhbp zza;

    public zzcsa(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzcxc) this.zza).zza().zza() == null) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzfv)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
