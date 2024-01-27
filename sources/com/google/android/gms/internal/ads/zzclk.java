package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzclk implements zzfax {
    private final zzcjs zza;
    private final zzclk zzb = this;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;

    /* synthetic */ zzclk(zzcjs zzcjs, Context context, String str, zzq zzq, zzclj zzclj) {
        this.zza = zzcjs;
        zzhbc zza2 = zzhbd.zza(context);
        this.zzc = zza2;
        zzhbc zza3 = zzhbd.zza(zzq);
        this.zzd = zza3;
        zzhbc zza4 = zzhbd.zza(str);
        this.zze = zza4;
        zzhbp zzc2 = zzhbb.zzc(new zzeml(zzcjs.zzn));
        this.zzf = zzc2;
        zzhbp zzc3 = zzhbb.zzc(new zzfbv(zzcjs.zzaG));
        this.zzg = zzc3;
        zzhbp zzhbp = zzc2;
        zzhbp zzhbp2 = zzc3;
        zzhbp zzc4 = zzhbb.zzc(new zzfav(zza2, zzcjs.zzo, zzcjs.zzU, zzhbp, zzhbp2, zzfdp.zza()));
        this.zzh = zzc4;
        this.zzi = zzhbb.zzc(new zzemt(zza2, zza3, zza4, zzc4, zzhbp, zzhbp2, zzcjs.zzh, zzcjs.zzV, zzcjs.zzZ));
    }

    public final zzems zza() {
        return (zzems) this.zzi.zzb();
    }
}
