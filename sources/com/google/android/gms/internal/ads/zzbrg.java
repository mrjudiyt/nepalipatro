package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbrg implements MediationAdLoadCallback {
    final /* synthetic */ zzbqs zza;
    final /* synthetic */ zzbpd zzb;
    final /* synthetic */ zzbrh zzc;

    zzbrg(zzbrh zzbrh, zzbqs zzbqs, zzbpd zzbpd) {
        this.zzc = zzbrh;
        this.zza = zzbqs;
        this.zzb = zzbpd;
    }

    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e10) {
            zzcat.zzh("", e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
            zzcat.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
                return null;
            } catch (RemoteException e10) {
                zzcat.zzh("", e10);
                return null;
            }
        } else {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException e11) {
                zzcat.zzh("", e11);
            }
            return new zzbri(this.zzb);
        }
    }

    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
