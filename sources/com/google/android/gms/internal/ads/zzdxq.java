package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdxq implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;

    public zzdxq(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcic) this.zza).zza();
        zzfdn zza3 = ((zzcxc) this.zzb).zza();
        zzdwq zza4 = ((zzdwr) this.zzc).zzb();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzdxp(zza2, zza3, zza4, zzgad, (ScheduledExecutorService) this.zze.zzb(), (zzecl) this.zzf.zzb(), (zzfje) this.zzg.zzb());
    }
}
