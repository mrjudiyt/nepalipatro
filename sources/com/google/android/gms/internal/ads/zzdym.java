package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdym implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdym(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    /* renamed from: zza */
    public final zzdyl zzb() {
        Map zzd = ((zzhbj) this.zza).zzd();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzdyl(zzd, zzgad, ((zzdaf) this.zzc).zzb());
    }
}
