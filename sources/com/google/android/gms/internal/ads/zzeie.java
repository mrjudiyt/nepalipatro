package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeie extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzddc zzc;
    private final zzeio zzd;
    private final zzeez zze;

    zzeie(zzchw zzchw, zzcwt zzcwt, zzddc zzddc, zzeio zzeio, zzeez zzeez) {
        this.zza = zzchw;
        this.zzb = zzcwt;
        this.zzc = zzddc;
        this.zzd = zzeio;
        this.zze = zzeez;
    }

    /* access modifiers changed from: protected */
    public final e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde) {
        zzcwt zzcwt = this.zzb;
        zzcwt.zzi(zzfdn);
        zzcwt.zzf(bundle);
        zzcwt.zzg(new zzcwn(zzfde, zzfcr, this.zzd));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzchw zzchw = this.zza;
        zzcwt zzcwt2 = this.zzb;
        zzcqi zzd2 = zzchw.zzd();
        zzd2.zzd(zzcwt2.zzj());
        zzd2.zzc(this.zzc);
        zzcue zzb2 = zzd2.zze().zzb();
        return zzb2.zzi(zzb2.zzj());
    }
}
