package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcqu(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    /* renamed from: zza */
    public final zzdaa zzb() {
        return new zzdaa((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
