package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;

public class BannerAdCreator {
    private final Context context;

    public BannerAdCreator(Context context2) {
        this.context = context2;
    }

    public AdManagerAdView createAdManagerAdView() {
        return new AdManagerAdView(this.context);
    }

    public AdView createAdView() {
        return new AdView(this.context);
    }
}
