package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbyb implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzbyb(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    /* renamed from: zza */
    public final zzbya zzb() {
        return new zzbya((Clock) this.zza.zzb(), (zzbxy) this.zzb.zzb());
    }
}
