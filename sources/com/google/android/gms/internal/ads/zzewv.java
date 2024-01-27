package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewv implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzewv(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewt(new zzbsz(), (ScheduledExecutorService) this.zzb.zzb(), ((zzcic) this.zzc).zza());
    }
}
