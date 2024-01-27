package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcqz implements zzhbc {
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

    public zzcqz(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6, zzhbp zzhbp7, zzhbp zzhbp8, zzhbp zzhbp9, zzhbp zzhbp10) {
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

    public static zzcqy zzc(zzcsw zzcsw, Context context, zzfcs zzfcs, View view, zzcgb zzcgb, zzcsv zzcsv, zzdju zzdju, zzdff zzdff, zzhaw zzhaw, Executor executor) {
        return new zzcqy(zzcsw, context, zzfcs, view, zzcgb, zzcsv, zzdju, zzdff, zzhaw, executor);
    }

    /* renamed from: zza */
    public final zzcqy zzb() {
        return new zzcqy(((zzcvf) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcrf) this.zzc).zza(), ((zzcre) this.zzd).zza(), ((zzcrq) this.zze).zza(), ((zzcrg) this.zzf).zza(), ((zzdhr) this.zzg).zza(), (zzdff) this.zzh.zzb(), zzhbb.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
