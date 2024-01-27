package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;

class FlutterBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    private AdView adView;
    private final BannerAdCreator bannerAdCreator;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    private final FlutterAdSize size;

    public FlutterBannerAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdSize flutterAdSize, BannerAdCreator bannerAdCreator2) {
        super(i10);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(flutterAdRequest);
        Preconditions.checkNotNull(flutterAdSize);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.size = flutterAdSize;
        this.bannerAdCreator = bannerAdCreator2;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.destroy();
            this.adView = null;
        }
    }

    /* access modifiers changed from: package-private */
    public FlutterAdSize getAdSize() {
        AdView adView2 = this.adView;
        if (adView2 == null || adView2.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    public PlatformView getPlatformView() {
        AdView adView2 = this.adView;
        if (adView2 == null) {
            return null;
        }
        return new FlutterPlatformView(adView2);
    }

    /* access modifiers changed from: package-private */
    public void load() {
        AdView createAdView = this.bannerAdCreator.createAdView();
        this.adView = createAdView;
        createAdView.setAdUnitId(this.adUnitId);
        this.adView.setAdSize(this.size.getAdSize());
        this.adView.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.loadAd(this.request.asAdRequest(this.adUnitId));
    }

    public void onAdLoaded() {
        AdView adView2 = this.adView;
        if (adView2 != null) {
            this.manager.onAdLoaded(this.adId, adView2.getResponseInfo());
        }
    }
}
