package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdse implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdse(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdsr zzdsr = (zzdsr) this.zza.zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return ((Boolean) zzba.zzc().zzb(zzbci.zzir)).booleanValue() ? new zzdev((zzeby) this.zzc.zzb(), zzgad) : new zzdev(zzdsr, zzgad);
    }
}
