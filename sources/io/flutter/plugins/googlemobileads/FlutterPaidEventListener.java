package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

public class FlutterPaidEventListener implements OnPaidEventListener {
    private final FlutterAd ad;
    private final AdInstanceManager manager;

    FlutterPaidEventListener(AdInstanceManager adInstanceManager, FlutterAd flutterAd) {
        this.manager = adInstanceManager;
        this.ad = flutterAd;
    }

    public void onPaidEvent(AdValue adValue) {
        this.manager.onPaidEvent(this.ad, new FlutterAdValue(adValue.getPrecisionType(), adValue.getCurrencyCode(), adValue.getValueMicros()));
    }
}
