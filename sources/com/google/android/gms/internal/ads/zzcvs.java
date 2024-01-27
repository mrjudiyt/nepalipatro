package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcvs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcvs(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzfvx;
        zzcuy zzcuy = (zzcuy) this.zza.zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        if (((Boolean) zzba.zzc().zzb(zzbci.zzfy)).booleanValue()) {
            zzfvx = zzfvx.zzn(new zzdev(zzcuy, zzgad));
        } else {
            zzfvx = zzfvx.zzm();
        }
        zzhbk.zzb(zzfvx);
        return zzfvx;
    }
}
