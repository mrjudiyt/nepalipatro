package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;

/* compiled from: FlutterAdListener */
class FlutterNativeAdLoadedListener implements NativeAd.OnNativeAdLoadedListener {
    private final WeakReference<FlutterNativeAd> nativeAdWeakReference;

    FlutterNativeAdLoadedListener(FlutterNativeAd flutterNativeAd) {
        this.nativeAdWeakReference = new WeakReference<>(flutterNativeAd);
    }

    public void onNativeAdLoaded(NativeAd nativeAd) {
        if (this.nativeAdWeakReference.get() != null) {
            ((FlutterNativeAd) this.nativeAdWeakReference.get()).onNativeAdLoaded(nativeAd);
        }
    }
}
