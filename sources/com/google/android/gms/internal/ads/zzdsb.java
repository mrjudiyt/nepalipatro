package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdsb implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdsb(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdrz zzdrz = (zzdrz) this.zza.zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return ((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue() ? new zzdev((zzebr) this.zzc.zzb(), zzgad) : new zzdev(zzdrz, zzgad);
    }
}
