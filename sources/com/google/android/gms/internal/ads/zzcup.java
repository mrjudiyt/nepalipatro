package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcup implements zzhbc {
    private final zzhbp zza;

    public zzcup(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzfvx;
        zzcva zzcva = (zzcva) this.zza.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfy)).booleanValue()) {
            zzfvx = zzfvx.zzn(new zzdev(zzcva, zzcbg.zzf));
        } else {
            zzfvx = zzfvx.zzm();
        }
        zzhbk.zzb(zzfvx);
        return zzfvx;
    }
}
