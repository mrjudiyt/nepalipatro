package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeuo implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;

    public zzeuo(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzg zza2 = ((zzcia) this.zza).zzb();
        Context zza3 = ((zzcic) this.zzb).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzeul(zza2, zza3, zzgad, (ScheduledExecutorService) this.zzd.zzb(), ((zzeet) this.zze).zzb(), ((zzcxc) this.zzf).zza());
    }
}
