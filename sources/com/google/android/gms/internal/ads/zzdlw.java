package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdlw implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzdlw(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzdlv((zzbq) this.zza.zzb(), (Clock) this.zzb.zzb(), zzgad);
    }
}
