package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbxz implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzbxz(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbxy((Clock) this.zza.zzb(), (zzg) this.zzb.zzb(), (zzbyy) this.zzc.zzb());
    }
}
