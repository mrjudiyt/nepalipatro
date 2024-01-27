package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzbra implements MediationAdLoadCallback {
    final /* synthetic */ zzbqj zza;
    final /* synthetic */ zzbpd zzb;

    zzbra(zzbrh zzbrh, zzbqj zzbqj, zzbpd zzbpd) {
        this.zza = zzbqj;
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
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd == null) {
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
                this.zza.zzg(ObjectWrapper.wrap(mediationBannerAd.getView()));
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
