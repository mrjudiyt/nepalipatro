package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcvt implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzcvt(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdrx zzdrx = (zzdrx) this.zza.zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return ((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue() ? new zzdev((zzebp) this.zzc.zzb(), zzgad) : new zzdev(zzdrx, zzgad);
    }
}
