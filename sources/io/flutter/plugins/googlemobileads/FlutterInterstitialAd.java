package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

class FlutterInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterInterstitialAd";
    private InterstitialAd ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;

    private static final class DelegatingInterstitialAdLoadCallback extends InterstitialAdLoadCallback {
        private final WeakReference<FlutterInterstitialAd> delegate;

        DelegatingInterstitialAdLoadCallback(FlutterInterstitialAd flutterInterstitialAd) {
            this.delegate = new WeakReference<>(flutterInterstitialAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterInterstitialAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onAdLoaded(InterstitialAd interstitialAd) {
            if (this.delegate.get() != null) {
                ((FlutterInterstitialAd) this.delegate.get()).onAdLoaded(interstitialAd);
            }
        }
    }

    public FlutterInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader2;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.ad = null;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        String str;
        FlutterAdRequest flutterAdRequest;
        if (this.manager != null && (str = this.adUnitId) != null && (flutterAdRequest = this.request) != null) {
            this.flutterAdLoader.loadInterstitial(str, flutterAdRequest.asAdRequest(str), new DelegatingInterstitialAdLoadCallback(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(InterstitialAd interstitialAd) {
        this.ad = interstitialAd;
        interstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, interstitialAd.getResponseInfo());
    }

    public void setImmersiveMode(boolean z10) {
        InterstitialAd interstitialAd = this.ad;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z10);
        }
    }

    public void show() {
        if (this.ad != null && this.manager.getActivity() != null) {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }
}
