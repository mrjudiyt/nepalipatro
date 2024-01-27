package io.flutter.plugins.googlemobileads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.flutter.plugin.platform.PlatformView;
import java.util.Collections;

final class FluidAdManagerBannerAd extends FlutterAdManagerBannerAd {
    private static final String TAG = "FluidAdManagerBannerAd";
    private ViewGroup containerView;
    /* access modifiers changed from: private */
    public int height = -1;

    FluidAdManagerBannerAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i10, adInstanceManager, str, Collections.singletonList(new FlutterAdSize(AdSize.FLUID)), flutterAdManagerAdRequest, bannerAdCreator);
    }

    /* access modifiers changed from: package-private */
    public ScrollView createContainerView() {
        if (this.manager.getActivity() == null) {
            return null;
        }
        return new ScrollView(this.manager.getActivity());
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }

    /* access modifiers changed from: package-private */
    public PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            return new FlutterPlatformView(viewGroup);
        }
        ScrollView createContainerView = createContainerView();
        if (createContainerView == null) {
            return null;
        }
        createContainerView.setClipChildren(false);
        createContainerView.setVerticalScrollBarEnabled(false);
        createContainerView.setHorizontalScrollBarEnabled(false);
        this.containerView = createContainerView;
        createContainerView.addView(this.adView);
        return new FlutterPlatformView(this.adView);
    }

    public void onAdLoaded() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                        FluidAdManagerBannerAd fluidAdManagerBannerAd = FluidAdManagerBannerAd.this;
                        fluidAdManagerBannerAd.manager.onFluidAdHeightChanged(fluidAdManagerBannerAd.adId, measuredHeight);
                    }
                    int unused = FluidAdManagerBannerAd.this.height = measuredHeight;
                }
            });
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }
}
