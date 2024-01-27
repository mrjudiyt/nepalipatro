package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeut implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;

    public zzeut(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
    }

    public static zzeur zza(zzbzt zzbzt, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new zzeur(zzbzt, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzeur(new zzbzt(), ((zzcic) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), zzgad, ((zzewy) this.zze).zzb().intValue(), ((zzewz) this.zzf).zzb().booleanValue(), ((zzexb) this.zzg).zzb().booleanValue());
    }
}
