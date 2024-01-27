package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;
import java.util.List;

class FlutterAdManagerBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    protected AdManagerAdView adView;
    private final BannerAdCreator bannerAdCreator;
    protected final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;
    private final List<FlutterAdSize> sizes;

    public FlutterAdManagerBannerAd(int i10, AdInstanceManager adInstanceManager, String str, List<FlutterAdSize> list, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator2) {
        super(i10);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(flutterAdManagerAdRequest);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.sizes = list;
        this.request = flutterAdManagerAdRequest;
        this.bannerAdCreator = bannerAdCreator2;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
    }

    /* access modifiers changed from: package-private */
    public FlutterAdSize getAdSize() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView == null || adManagerAdView.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    /* access modifiers changed from: package-private */
    public PlatformView getPlatformView() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView == null) {
            return null;
        }
        return new FlutterPlatformView(adManagerAdView);
    }

    /* access modifiers changed from: package-private */
    public void load() {
        AdManagerAdView createAdManagerAdView = this.bannerAdCreator.createAdManagerAdView();
        this.adView = createAdManagerAdView;
        if (this instanceof FluidAdManagerBannerAd) {
            createAdManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.adView.setAdUnitId(this.adUnitId);
        this.adView.setAppEventListener(new AppEventListener() {
            public void onAppEvent(String str, String str2) {
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = FlutterAdManagerBannerAd.this;
                flutterAdManagerBannerAd.manager.onAppEvent(flutterAdManagerBannerAd.adId, str, str2);
            }
        });
        AdSize[] adSizeArr = new AdSize[this.sizes.size()];
        for (int i10 = 0; i10 < this.sizes.size(); i10++) {
            adSizeArr[i10] = this.sizes.get(i10).getAdSize();
        }
        this.adView.setAdSizes(adSizeArr);
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.loadAd(this.request.asAdManagerAdRequest(this.adUnitId));
    }

    public void onAdLoaded() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            this.manager.onAdLoaded(this.adId, adManagerAdView.getResponseInfo());
        }
    }
}
