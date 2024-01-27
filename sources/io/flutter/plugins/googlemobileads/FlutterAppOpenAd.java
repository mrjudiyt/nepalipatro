package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.util.Preconditions;
import java.lang.ref.WeakReference;

class FlutterAppOpenAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterAppOpenAd";
    private AppOpenAd ad;
    private final FlutterAdManagerAdRequest adManagerAdRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final int orientation;
    private final FlutterAdRequest request;

    private static final class DelegatingAppOpenAdLoadCallback extends AppOpenAd.AppOpenAdLoadCallback {
        private final WeakReference<FlutterAppOpenAd> delegate;

        DelegatingAppOpenAdLoadCallback(FlutterAppOpenAd flutterAppOpenAd) {
            this.delegate = new WeakReference<>(flutterAppOpenAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterAppOpenAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onAdLoaded(AppOpenAd appOpenAd) {
            if (this.delegate.get() != null) {
                ((FlutterAppOpenAd) this.delegate.get()).onAdLoaded(appOpenAd);
            }
        }
    }

    FlutterAppOpenAd(int i10, int i11, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        Preconditions.checkState((flutterAdRequest == null && flutterAdManagerAdRequest == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.manager = adInstanceManager;
        this.orientation = i11;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerAdRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader2;
    }

    private int getOrientation() {
        int i10 = this.orientation;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Passed unknown app open orientation: ");
        sb.append(this.orientation);
        return 1;
    }

    /* access modifiers changed from: private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    /* access modifiers changed from: private */
    public void onAdLoaded(AppOpenAd appOpenAd) {
        this.ad = appOpenAd;
        appOpenAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, appOpenAd.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.ad = null;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader2.loadAppOpen(str, flutterAdRequest.asAdRequest(str), getOrientation(), new DelegatingAppOpenAdLoadCallback(this));
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerAdRequest;
        if (flutterAdManagerAdRequest != null) {
            FlutterAdLoader flutterAdLoader3 = this.flutterAdLoader;
            String str2 = this.adUnitId;
            flutterAdLoader3.loadAdManagerAppOpen(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), getOrientation(), new DelegatingAppOpenAdLoadCallback(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void setImmersiveMode(boolean z10) {
        AppOpenAd appOpenAd = this.ad;
        if (appOpenAd != null) {
            appOpenAd.setImmersiveMode(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void show() {
        if (this.ad != null && this.manager.getActivity() != null) {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }
}
