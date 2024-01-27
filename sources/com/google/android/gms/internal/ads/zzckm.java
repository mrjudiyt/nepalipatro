package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzckm implements zzezg {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcjs zzd;
    private final zzckm zze = this;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;
    private final zzhbp zzj;
    private final zzhbp zzk;

    /* synthetic */ zzckm(zzcjs zzcjs, Context context, String str, zzq zzq, zzckl zzckl) {
        this.zzd = zzcjs;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        zzhbc zza2 = zzhbd.zza(context);
        this.zzf = zza2;
        zzhbc zza3 = zzhbd.zza(zzq);
        this.zzg = zza3;
        zzhbp zzc2 = zzhbb.zzc(new zzeml(zzcjs.zzn));
        this.zzh = zzc2;
        zzhbp zzc3 = zzhbb.zzc(zzemq.zza());
        this.zzi = zzc3;
        zzhbp zzc4 = zzhbb.zzc(zzdcj.zza());
        this.zzj = zzc4;
        this.zzk = zzhbb.zzc(new zzeze(zza2, zzcjs.zzo, zza3, zzcjs.zzU, zzc2, zzc3, zzfdp.zza(), zzc4));
    }

    public final zzelq zza() {
        zzcaz zzd2 = this.zzd.zza.zzd();
        zzhbk.zzb(zzd2);
        return new zzelq(this.zza, this.zzb, this.zzc, (zzezd) this.zzk.zzb(), (zzemk) this.zzh.zzb(), zzd2, (zzdso) this.zzd.zzZ.zzb());
    }
}
