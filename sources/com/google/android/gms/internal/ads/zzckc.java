package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzckc implements zzexs {
    private final zzcjs zza;
    private final zzckc zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;

    /* synthetic */ zzckc(zzcjs zzcjs, Context context, String str, zzckb zzckb) {
        this.zza = zzcjs;
        zzhbc zza2 = zzhbd.zza(context);
        this.zzc = zza2;
        zzhbc zza3 = zzhbd.zza(str);
        this.zzd = zza3;
        zzfak zzfak = new zzfak(zza2, zzcjs.zzaG, zzcjs.zzaH);
        this.zze = zzfak;
        zzhbp zzc2 = zzhbb.zzc(new zzeyq(zzcjs.zzaG));
        this.zzf = zzc2;
        zzhbp zzhbp = zzc2;
        zzhbp zzc3 = zzhbb.zzc(new zzeys(zza2, zzcjs.zzo, zzcjs.zzU, zzfak, zzhbp, zzfdp.zza(), zzcjs.zzh));
        this.zzg = zzc3;
        this.zzh = zzhbb.zzc(new zzeyy(zzcjs.zzU, zza2, zza3, zzc3, zzhbp, zzcjs.zzh, zzcjs.zzZ));
    }

    public final zzeyx zza() {
        return (zzeyx) this.zzh.zzb();
    }
}
