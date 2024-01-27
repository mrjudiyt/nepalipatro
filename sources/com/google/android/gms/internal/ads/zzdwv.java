package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdwv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdwv(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcic) this.zzb).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        e zzb2 = zzgad.zzb(new zzdws((zzaro) this.zza.zzb(), zza2));
        zzhbk.zzb(zzb2);
        return zzb2;
    }
}
