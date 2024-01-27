package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

class FlutterFullScreenContentCallback extends FullScreenContentCallback {
    protected final int adId;
    protected final AdInstanceManager manager;

    public FlutterFullScreenContentCallback(AdInstanceManager adInstanceManager, int i10) {
        this.manager = adInstanceManager;
        this.adId = i10;
    }

    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    public void onAdDismissedFullScreenContent() {
        this.manager.onAdDismissedFullScreenContent(this.adId);
    }

    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.manager.onFailedToShowFullScreenContent(this.adId, adError);
    }

    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    public void onAdShowedFullScreenContent() {
        this.manager.onAdShowedFullScreenContent(this.adId);
    }
}
