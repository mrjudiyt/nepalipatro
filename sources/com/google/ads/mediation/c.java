package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class c extends InterstitialAdLoadCallback {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f6169a;

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f6170b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f6169a = abstractAdViewAdapter;
        this.f6170b = mediationInterstitialListener;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6170b.onAdFailedToLoad((MediationInterstitialAdapter) this.f6169a, (AdError) loadAdError);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f6169a;
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        interstitialAd.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.f6170b));
        this.f6170b.onAdLoaded(this.f6169a);
    }
}
