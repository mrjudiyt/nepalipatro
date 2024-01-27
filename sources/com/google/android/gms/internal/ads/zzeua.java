package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeua implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzeua(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
    }

    /* renamed from: zza */
    public final zzetz zzb() {
        Context zza2 = ((zzcic) this.zza).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzetz(zza2, zzgad, ((zzhbn) this.zzc).zzb(), (zzfje) this.zzd.zzb(), (zzdso) this.zze.zzb());
    }
}
