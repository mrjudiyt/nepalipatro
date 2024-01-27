package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class d extends FullScreenContentCallback {

    /* renamed from: a  reason: collision with root package name */
    final AbstractAdViewAdapter f6171a;

    /* renamed from: b  reason: collision with root package name */
    final MediationInterstitialListener f6172b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f6171a = abstractAdViewAdapter;
        this.f6172b = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        this.f6172b.onAdClosed(this.f6171a);
    }

    public final void onAdShowedFullScreenContent() {
        this.f6172b.onAdOpened(this.f6171a);
    }
}
