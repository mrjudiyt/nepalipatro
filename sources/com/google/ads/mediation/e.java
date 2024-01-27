package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class e extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {

    /* renamed from: h  reason: collision with root package name */
    final AbstractAdViewAdapter f6173h;

    /* renamed from: i  reason: collision with root package name */
    final MediationNativeListener f6174i;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f6173h = abstractAdViewAdapter;
        this.f6174i = mediationNativeListener;
    }

    public final void onAdClicked() {
        this.f6174i.onAdClicked(this.f6173h);
    }

    public final void onAdClosed() {
        this.f6174i.onAdClosed(this.f6173h);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6174i.onAdFailedToLoad((MediationNativeAdapter) this.f6173h, (AdError) loadAdError);
    }

    public final void onAdImpression() {
        this.f6174i.onAdImpression(this.f6173h);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        this.f6174i.onAdOpened(this.f6173h);
    }

    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f6174i.zze(this.f6173h, nativeCustomTemplateAd, str);
    }

    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f6174i.zzc(this.f6173h, nativeCustomTemplateAd);
    }

    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f6174i.onAdLoaded(this.f6173h, new a(unifiedNativeAd));
    }
}
