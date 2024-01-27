package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeig extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzekt zzc;
    private final zzddc zzd;
    private final zzdho zze;
    private final zzdaa zzf;
    private final ViewGroup zzg;
    private final zzdch zzh;
    private final zzeio zzi;
    private final zzeez zzj;

    public zzeig(zzchw zzchw, zzcwt zzcwt, zzekt zzekt, zzddc zzddc, zzdho zzdho, zzdaa zzdaa, ViewGroup viewGroup, zzdch zzdch, zzeio zzeio, zzeez zzeez) {
        this.zza = zzchw;
        this.zzb = zzcwt;
        this.zzc = zzekt;
        this.zzd = zzddc;
        this.zze = zzdho;
        this.zzf = zzdaa;
        this.zzg = viewGroup;
        this.zzh = zzdch;
        this.zzi = zzeio;
        this.zzj = zzeez;
    }

    /* access modifiers changed from: protected */
    public final e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde) {
        zzcwt zzcwt = this.zzb;
        zzcwt.zzi(zzfdn);
        zzcwt.zzf(bundle);
        zzcwt.zzg(new zzcwn(zzfde, zzfcr, this.zzi));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzchw zzchw = this.zza;
        zzcwt zzcwt2 = this.zzb;
        zzcrr zze2 = zzchw.zze();
        zze2.zzi(zzcwt2.zzj());
        zze2.zzf(this.zzd);
        zze2.zze(this.zzc);
        zze2.zzd(this.zze);
        zze2.zzg(new zzcsp(this.zzf, this.zzh));
        zze2.zzc(new zzcqs(this.zzg));
        zzcue zzd2 = zze2.zzk().zzd();
        return zzd2.zzi(zzd2.zzj());
    }
}
