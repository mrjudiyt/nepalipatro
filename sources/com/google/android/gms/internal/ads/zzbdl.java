package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbdl implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzbdl(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
    }

    public final /* synthetic */ Object zzb() {
        return new zzbdk(((zzcic) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), new zzbdm(), (zzfje) this.zzd.zzb());
    }
}
