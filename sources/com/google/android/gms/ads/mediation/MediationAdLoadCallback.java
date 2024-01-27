package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(AdError adError);

    @Deprecated
    void onFailure(String str);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
