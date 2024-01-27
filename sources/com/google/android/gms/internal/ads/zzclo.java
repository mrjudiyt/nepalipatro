package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzclo implements zzfcl {
    private final zzcjs zza;
    private final zzclo zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;

    /* synthetic */ zzclo(zzcjs zzcjs, Context context, String str, zzcln zzcln) {
        this.zza = zzcjs;
        zzhbc zza2 = zzhbd.zza(context);
        this.zzc = zza2;
        zzfal zzfal = new zzfal(zza2, zzcjs.zzaG, zzcjs.zzaH);
        this.zzd = zzfal;
        zzhbp zzc2 = zzhbb.zzc(new zzfbv(zzcjs.zzaG));
        this.zze = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzfdk.zza());
        this.zzf = zzc3;
        zzhbp zzc4 = zzhbb.zzc(new zzfcf(zza2, zzcjs.zzo, zzcjs.zzU, zzfal, zzc2, zzfdp.zza(), zzc3));
        this.zzg = zzc4;
        this.zzh = zzhbb.zzc(new zzfcp(zzc4, zzc2, zzc3));
        zzhbc zzc5 = zzhbd.zzc(str);
        this.zzi = zzc5;
        this.zzj = zzhbb.zzc(new zzfcj(zzc5, zzc4, zza2, zzc2, zzc3, zzcjs.zzh, zzcjs.zzV, zzcjs.zzZ));
    }

    public final zzfci zza() {
        return (zzfci) this.zzj.zzb();
    }

    public final zzfco zzb() {
        return (zzfco) this.zzh.zzb();
    }
}
