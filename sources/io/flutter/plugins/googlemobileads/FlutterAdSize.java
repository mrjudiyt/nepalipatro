package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;

class FlutterAdSize {
    final int height;
    final AdSize size;
    final int width;

    static class AdSizeFactory {
        AdSizeFactory() {
        }

        /* access modifiers changed from: package-private */
        public AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i10);
        }

        /* access modifiers changed from: package-private */
        public AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i10);
        }

        /* access modifiers changed from: package-private */
        public AdSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
            return AdSize.getInlineAdaptiveBannerAdSize(i10, i11);
        }

        /* access modifiers changed from: package-private */
        public AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i10);
        }

        /* access modifiers changed from: package-private */
        public AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i10);
        }

        /* access modifiers changed from: package-private */
        public AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i10);
        }

        /* access modifiers changed from: package-private */
        public AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i10) {
            return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i10);
        }
    }

    static class AnchoredAdaptiveBannerAdSize extends FlutterAdSize {
        final String orientation;

        AnchoredAdaptiveBannerAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i10) {
            super(getAdSize(context, adSizeFactory, str, i10));
            this.orientation = str;
        }

        private static AdSize getAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i10) {
            if (str == null) {
                return adSizeFactory.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i10);
            }
            if (str.equals("portrait")) {
                return adSizeFactory.getPortraitAnchoredAdaptiveBannerAdSize(context, i10);
            }
            if (str.equals("landscape")) {
                return adSizeFactory.getLandscapeAnchoredAdaptiveBannerAdSize(context, i10);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    static class FluidAdSize extends FlutterAdSize {
        FluidAdSize() {
            super(AdSize.FLUID);
        }
    }

    static class InlineAdaptiveBannerAdSize extends FlutterAdSize {
        final Integer maxHeight;
        final Integer orientation;

        InlineAdaptiveBannerAdSize(AdSizeFactory adSizeFactory, Context context, int i10, Integer num, Integer num2) {
            super(getAdSize(adSizeFactory, context, i10, num, num2));
            this.orientation = num;
            this.maxHeight = num2;
        }

        private static AdSize getAdSize(AdSizeFactory adSizeFactory, Context context, int i10, Integer num, Integer num2) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return adSizeFactory.getPortraitInlineAdaptiveBannerAdSize(context, i10);
                }
                return adSizeFactory.getLandscapeInlineAdaptiveBannerAdSize(context, i10);
            } else if (num2 != null) {
                return adSizeFactory.getInlineAdaptiveBannerAdSize(i10, num2.intValue());
            } else {
                return adSizeFactory.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i10);
            }
        }
    }

    static class SmartBannerAdSize extends FlutterAdSize {
        SmartBannerAdSize() {
            super(AdSize.SMART_BANNER);
        }
    }

    FlutterAdSize(int i10, int i11) {
        this(new AdSize(i10, i11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdSize)) {
            return false;
        }
        FlutterAdSize flutterAdSize = (FlutterAdSize) obj;
        if (this.width == flutterAdSize.width && this.height == flutterAdSize.height) {
            return true;
        }
        return false;
    }

    public AdSize getAdSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    FlutterAdSize(AdSize adSize) {
        this.size = adSize;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
    }
}
