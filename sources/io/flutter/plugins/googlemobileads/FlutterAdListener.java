package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import io.flutter.plugins.googlemobileads.FlutterAd;

class FlutterAdListener extends AdListener {
    protected final int adId;
    protected final AdInstanceManager manager;

    FlutterAdListener(int i10, AdInstanceManager adInstanceManager) {
        this.adId = i10;
        this.manager = adInstanceManager;
    }

    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    public void onAdClosed() {
        this.manager.onAdClosed(this.adId);
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    public void onAdOpened() {
        this.manager.onAdOpened(this.adId);
    }
}
