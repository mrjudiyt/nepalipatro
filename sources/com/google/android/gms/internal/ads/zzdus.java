package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdus implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;

    public zzdus(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7, zzhbp zzhbp8, zzhbp zzhbp9, zzhbp zzhbp10) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
        this.zzg = zzhbp7;
        this.zzh = zzhbp8;
        this.zzi = zzhbp9;
        this.zzj = zzhbp10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcic) this.zzb).zza();
        WeakReference zza3 = ((zzcid) this.zzc).zza();
        zzgad zzgad = zzcbg.zza;
        zzhbk.zzb(zzgad);
        return new zzdur((Executor) this.zza.zzb(), zza2, zza3, zzgad, (zzdqj) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdsy) this.zzg.zzb(), ((zzcio) this.zzh).zza(), ((zzdeh) this.zzi).zzb(), (zzfjh) this.zzj.zzb());
    }
}
