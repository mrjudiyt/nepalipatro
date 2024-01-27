package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeik extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzddc zzc;
    private final zzeio zzd;
    private final zzfdf zze;
    private final zzeez zzf;

    public zzeik(zzchw zzchw, zzcwt zzcwt, zzddc zzddc, zzfdf zzfdf, zzeio zzeio, zzeez zzeez) {
        this.zza = zzchw;
        this.zzb = zzcwt;
        this.zzc = zzddc;
        this.zze = zzfdf;
        this.zzd = zzeio;
        this.zzf = zzeez;
    }

    /* access modifiers changed from: protected */
    public final e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde) {
        zzfdf zzfdf;
        zzcwt zzcwt = this.zzb;
        zzcwt.zzi(zzfdn);
        zzcwt.zzf(bundle);
        zzcwt.zzg(new zzcwn(zzfde, zzfcr, this.zzd));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdo)).booleanValue() && (zzfdf = this.zze) != null) {
            this.zzb.zzh(zzfdf);
        }
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchw zzchw = this.zza;
        zzcwt zzcwt2 = this.zzb;
        zzdpb zzi = zzchw.zzi();
        zzi.zzd(zzcwt2.zzj());
        zzi.zzc(this.zzc);
        zzcue zzb2 = zzi.zze().zzb();
        return zzb2.zzi(zzb2.zzj());
    }
}
