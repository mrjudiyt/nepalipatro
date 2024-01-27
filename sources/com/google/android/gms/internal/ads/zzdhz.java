package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdhz implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;

    public zzdhz(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3, zzhbp zzhbp4, zzhbp zzhbp5, zzhbp zzhbp6) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
        this.zzd = zzhbp4;
        this.zze = zzhbp5;
        this.zzf = zzhbp6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcwt zza2 = ((zzcxd) this.zzb).zza();
        zzddc zza3 = ((zzddv) this.zzc).zza();
        zzdho zza4 = ((zzdhq) this.zzd).zza();
        zzdaa zza5 = ((zzcqu) this.zze).zzb();
        zzeio zzeio = (zzeio) this.zzf.zzb();
        zzcrr zze2 = ((zzchw) this.zza.zzb()).zze();
        zze2.zzi(zza2.zzj());
        zze2.zzf(zza3);
        zze2.zzd(zza4);
        zze2.zze(new zzekt((zzbdg) null));
        zze2.zzg(new zzcsp(zza5, (zzdch) null));
        zze2.zzc(new zzcqs((ViewGroup) null));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzds)).booleanValue()) {
            zze2.zzj(zzeiw.zzb(zzeio));
        }
        zzcta zzc2 = zze2.zzk().zzc();
        zzhbk.zzb(zzc2);
        return zzc2;
    }
}
