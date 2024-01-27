package com.google.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: h  reason: collision with root package name */
    final AbstractAdViewAdapter f6167h;

    /* renamed from: i  reason: collision with root package name */
    final MediationBannerListener f6168i;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f6167h = abstractAdViewAdapter;
        this.f6168i = mediationBannerListener;
    }

    public final void onAdClicked() {
        this.f6168i.onAdClicked(this.f6167h);
    }

    public final void onAdClosed() {
        this.f6168i.onAdClosed(this.f6167h);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f6168i.onAdFailedToLoad((MediationBannerAdapter) this.f6167h, (AdError) loadAdError);
    }

    public final void onAdLoaded() {
        this.f6168i.onAdLoaded(this.f6167h);
    }

    public final void onAdOpened() {
        this.f6168i.onAdOpened(this.f6167h);
    }

    public final void onAppEvent(String str, String str2) {
        this.f6168i.zzd(this.f6167h, str, str2);
    }
}
