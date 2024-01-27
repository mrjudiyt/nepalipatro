package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdrz implements zzdag, zzcyz, zzcxo {
    private final zzdsj zza;
    private final zzdst zzb;

    public zzdrz(zzdsj zzdsj, zzdst zzdst) {
        this.zza = zzdsj;
        this.zzb = zzdst;
    }

    public final void zzbF(zze zze) {
        this.zza.zza().put(NativeProtocol.WEB_DIALOG_ACTION, "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze.zza));
        this.zza.zza().put("ed", zze.zzc);
        this.zzb.zzf(this.zza.zza());
    }

    public final void zzbr(zzbvg zzbvg) {
        this.zza.zzc(zzbvg.zza);
    }

    public final void zzbs(zzfde zzfde) {
        this.zza.zzb(zzfde);
    }

    public final void zzr() {
        this.zza.zza().put(NativeProtocol.WEB_DIALOG_ACTION, "loaded");
        this.zzb.zzf(this.zza.zza());
    }
}
