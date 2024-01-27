package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeib extends zzeid {
    private final zzchw zza;
    private final zzdho zzb;
    private final zzcwt zzc;
    private final zzddc zzd;
    private final zzeio zze;
    private final zzeez zzf;

    public zzeib(zzchw zzchw, zzdho zzdho, zzcwt zzcwt, zzddc zzddc, zzeio zzeio, zzeez zzeez) {
        this.zza = zzchw;
        this.zzb = zzdho;
        this.zzc = zzcwt;
        this.zzd = zzddc;
        this.zze = zzeio;
        this.zzf = zzeez;
    }

    /* access modifiers changed from: protected */
    public final e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde) {
        zzcwt zzcwt = this.zzc;
        zzcwt.zzi(zzfdn);
        zzcwt.zzf(bundle);
        zzcwt.zzg(new zzcwn(zzfde, zzfcr, this.zze));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzchw zzchw = this.zza;
        zzcwt zzcwt2 = this.zzc;
        zzdhs zzh = zzchw.zzh();
        zzh.zzf(zzcwt2.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcqs((ViewGroup) null));
        zzcue zza2 = zzh.zzg().zza();
        return zza2.zzi(zza2.zzj());
    }
}
