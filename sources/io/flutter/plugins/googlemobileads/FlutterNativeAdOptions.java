package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.NativeAdOptions;

class FlutterNativeAdOptions {
    final Integer adChoicesPlacement;
    final Integer mediaAspectRatio;
    final Boolean requestCustomMuteThisAd;
    final Boolean shouldRequestMultipleImages;
    final Boolean shouldReturnUrlsForImageAssets;
    final FlutterVideoOptions videoOptions;

    FlutterNativeAdOptions(Integer num, Integer num2, FlutterVideoOptions flutterVideoOptions, Boolean bool, Boolean bool2, Boolean bool3) {
        this.adChoicesPlacement = num;
        this.mediaAspectRatio = num2;
        this.videoOptions = flutterVideoOptions;
        this.requestCustomMuteThisAd = bool;
        this.shouldRequestMultipleImages = bool2;
        this.shouldReturnUrlsForImageAssets = bool3;
    }

    /* access modifiers changed from: package-private */
    public NativeAdOptions asNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        Integer num = this.adChoicesPlacement;
        if (num != null) {
            builder.setAdChoicesPlacement(num.intValue());
        }
        Integer num2 = this.mediaAspectRatio;
        if (num2 != null) {
            builder.setMediaAspectRatio(num2.intValue());
        }
        FlutterVideoOptions flutterVideoOptions = this.videoOptions;
        if (flutterVideoOptions != null) {
            builder.setVideoOptions(flutterVideoOptions.asVideoOptions());
        }
        Boolean bool = this.requestCustomMuteThisAd;
        if (bool != null) {
            builder.setRequestCustomMuteThisAd(bool.booleanValue());
        }
        Boolean bool2 = this.shouldRequestMultipleImages;
        if (bool2 != null) {
            builder.setRequestMultipleImages(bool2.booleanValue());
        }
        Boolean bool3 = this.shouldReturnUrlsForImageAssets;
        if (bool3 != null) {
            builder.setReturnUrlsForImageAssets(bool3.booleanValue());
        }
        return builder.build();
    }
}
