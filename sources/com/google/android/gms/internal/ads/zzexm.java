package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexm implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;

    public zzexm(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzexa) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzexb) this.zzc).zzb().booleanValue();
        zzbzr zzbzr = new zzbzr();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzexk((zzcac) this.zza.zzb(), booleanValue, booleanValue2, zzbzr, zzgad, ((zzewx) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb());
    }
}
