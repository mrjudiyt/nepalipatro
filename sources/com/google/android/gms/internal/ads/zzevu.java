package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzevu implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;

    public zzevu(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
    }

    public static zzevs zza(String str, zzawy zzawy, zzcac zzcac, ScheduledExecutorService scheduledExecutorService, zzgad zzgad) {
        return new zzevs(str, zzawy, zzcac, scheduledExecutorService, zzgad);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzevs(((zzewx) this.zza).zza(), new zzawy(), (zzcac) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzgad);
    }
}
