package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcya implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzcya(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcxx zza2 = ((zzcxz) this.zza).zzb();
        Set zzc2 = ((zzhbn) this.zzb).zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzcxy(zza2, zzc2, zzgad, (ScheduledExecutorService) this.zzd.zzb());
    }
}
