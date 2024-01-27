package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeaa implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzeaa(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    /* renamed from: zza */
    public final zzdzz zzb() {
        return new zzdzz(((zzcic) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
