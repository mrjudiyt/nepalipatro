package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbpx implements MediationAdLoadCallback {
    final /* synthetic */ zzbpd zza;
    final /* synthetic */ zzbpy zzb;

    zzbpx(zzbpy zzbpy, zzbpd zzbpd) {
        this.zzb = zzbpy;
        this.zza = zzbpd;
    }

    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzcat.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzj = (MediationAppOpenAd) obj;
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
        return new zzbpo(this.zza);
    }

    public final void onFailure(String str) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            zzcat.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }
}
