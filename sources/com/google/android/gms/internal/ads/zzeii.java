package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeii extends zzeid {
    private final zzchw zza;
    private final zzcwt zzb;
    private final zzekt zzc;
    private final zzddc zzd;
    private final zzeio zze;
    private final zzeez zzf;

    public zzeii(zzchw zzchw, zzcwt zzcwt, zzekt zzekt, zzddc zzddc, zzeio zzeio, zzeez zzeez) {
        this.zza = zzchw;
        this.zzb = zzcwt;
        this.zzc = zzekt;
        this.zzd = zzddc;
        this.zze = zzeio;
        this.zzf = zzeez;
    }

    /* access modifiers changed from: protected */
    public final e zzc(zzfdn zzfdn, Bundle bundle, zzfcr zzfcr, zzfde zzfde) {
        zzcwt zzcwt = this.zzb;
        zzcwt.zzi(zzfdn);
        zzcwt.zzf(bundle);
        zzcwt.zzg(new zzcwn(zzfde, zzfcr, this.zze));
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdp)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchw zzchw = this.zza;
        zzcwt zzcwt2 = this.zzb;
        zzdgw zzg = zzchw.zzg();
        zzg.zze(zzcwt2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcue zza2 = zzg.zzf().zza();
        return zza2.zzi(zza2.zzj());
    }
}
