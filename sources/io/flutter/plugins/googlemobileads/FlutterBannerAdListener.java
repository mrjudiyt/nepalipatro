package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* compiled from: FlutterAdListener */
class FlutterBannerAdListener extends FlutterAdListener {
    final WeakReference<FlutterAdLoadedListener> adLoadedListenerWeakReference;

    FlutterBannerAdListener(int i10, AdInstanceManager adInstanceManager, FlutterAdLoadedListener flutterAdLoadedListener) {
        super(i10, adInstanceManager);
        this.adLoadedListenerWeakReference = new WeakReference<>(flutterAdLoadedListener);
    }

    public void onAdLoaded() {
        if (this.adLoadedListenerWeakReference.get() != null) {
            ((FlutterAdLoadedListener) this.adLoadedListenerWeakReference.get()).onAdLoaded();
        }
    }
}
