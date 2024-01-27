package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.VideoOptions;

class FlutterVideoOptions {
    final Boolean clickToExpandRequested;
    final Boolean customControlsRequested;
    final Boolean startMuted;

    FlutterVideoOptions(Boolean bool, Boolean bool2, Boolean bool3) {
        this.clickToExpandRequested = bool;
        this.customControlsRequested = bool2;
        this.startMuted = bool3;
    }

    /* access modifiers changed from: package-private */
    public VideoOptions asVideoOptions() {
        VideoOptions.Builder builder = new VideoOptions.Builder();
        Boolean bool = this.clickToExpandRequested;
        if (bool != null) {
            builder.setClickToExpandRequested(bool.booleanValue());
        }
        Boolean bool2 = this.customControlsRequested;
        if (bool2 != null) {
            builder.setCustomControlsRequested(bool2.booleanValue());
        }
        Boolean bool3 = this.startMuted;
        if (bool3 != null) {
            builder.setStartMuted(bool3.booleanValue());
        }
        return builder.build();
    }
}
