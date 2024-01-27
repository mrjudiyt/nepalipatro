package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import java.util.Map;

class FlutterNativeAd extends FlutterAd {
    private static final String TAG = "FlutterNativeAd";
    private final GoogleMobileAdsPlugin.NativeAdFactory adFactory;
    private FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final Context context;
    private Map<String, Object> customOptions;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterNativeAdOptions nativeAdOptions;
    private NativeAdView nativeAdView;
    private final FlutterNativeTemplateStyle nativeTemplateStyle;
    private FlutterAdRequest request;
    private TemplateView templateView;

    static class Builder {
        private GoogleMobileAdsPlugin.NativeAdFactory adFactory;
        private FlutterAdManagerAdRequest adManagerRequest;
        private String adUnitId;
        private final Context context;
        private Map<String, Object> customOptions;
        private FlutterAdLoader flutterAdLoader;
        private Integer id;
        private AdInstanceManager manager;
        private FlutterNativeAdOptions nativeAdOptions;
        private FlutterNativeTemplateStyle nativeTemplateStyle;
        private FlutterAdRequest request;

        Builder(Context context2) {
            this.context = context2;
        }

        /* access modifiers changed from: package-private */
        public FlutterNativeAd build() {
            if (this.manager == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            } else if (this.adUnitId == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            } else if (this.adFactory == null && this.nativeTemplateStyle == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            } else {
                FlutterAdRequest flutterAdRequest = this.request;
                if (flutterAdRequest == null && this.adManagerRequest == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                } else if (flutterAdRequest == null) {
                    return new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.adManagerRequest, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
                } else {
                    return new FlutterNativeAd(this.context, this.id.intValue(), this.manager, this.adUnitId, this.adFactory, this.request, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
                }
            }
        }

        public Builder setAdFactory(GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory) {
            this.adFactory = nativeAdFactory;
            return this;
        }

        public Builder setAdManagerRequest(FlutterAdManagerAdRequest flutterAdManagerAdRequest) {
            this.adManagerRequest = flutterAdManagerAdRequest;
            return this;
        }

        public Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public Builder setCustomOptions(Map<String, Object> map) {
            this.customOptions = map;
            return this;
        }

        public Builder setFlutterAdLoader(FlutterAdLoader flutterAdLoader2) {
            this.flutterAdLoader = flutterAdLoader2;
            return this;
        }

        public Builder setId(int i10) {
            this.id = Integer.valueOf(i10);
            return this;
        }

        public Builder setManager(AdInstanceManager adInstanceManager) {
            this.manager = adInstanceManager;
            return this;
        }

        public Builder setNativeAdOptions(FlutterNativeAdOptions flutterNativeAdOptions) {
            this.nativeAdOptions = flutterNativeAdOptions;
            return this;
        }

        public Builder setNativeTemplateStyle(FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
            this.nativeTemplateStyle = flutterNativeTemplateStyle;
            return this;
        }

        public Builder setRequest(FlutterAdRequest flutterAdRequest) {
            this.request = flutterAdRequest;
            return this;
        }
    }

    protected FlutterNativeAd(Context context2, int i10, AdInstanceManager adInstanceManager, String str, GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader2, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i10);
        this.context = context2;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader2;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        NativeAdView nativeAdView2 = this.nativeAdView;
        if (nativeAdView2 != null) {
            nativeAdView2.destroy();
            this.nativeAdView = null;
        }
        TemplateView templateView2 = this.templateView;
        if (templateView2 != null) {
            templateView2.c();
            this.templateView = null;
        }
    }

    public PlatformView getPlatformView() {
        NativeAdView nativeAdView2 = this.nativeAdView;
        if (nativeAdView2 != null) {
            return new FlutterPlatformView(nativeAdView2);
        }
        TemplateView templateView2 = this.templateView;
        if (templateView2 != null) {
            return new FlutterPlatformView(templateView2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        NativeAdOptions nativeAdOptions2;
        FlutterNativeAdLoadedListener flutterNativeAdLoadedListener = new FlutterNativeAdLoadedListener(this);
        FlutterNativeAdListener flutterNativeAdListener = new FlutterNativeAdListener(this.adId, this.manager);
        FlutterNativeAdOptions flutterNativeAdOptions = this.nativeAdOptions;
        if (flutterNativeAdOptions == null) {
            nativeAdOptions2 = new NativeAdOptions.Builder().build();
        } else {
            nativeAdOptions2 = flutterNativeAdOptions.asNativeAdOptions();
        }
        NativeAdOptions nativeAdOptions3 = nativeAdOptions2;
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader2.loadNativeAd(str, flutterNativeAdLoadedListener, nativeAdOptions3, flutterNativeAdListener, flutterAdRequest.asAdRequest(str));
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest != null) {
            this.flutterAdLoader.loadAdManagerNativeAd(this.adUnitId, flutterNativeAdLoadedListener, nativeAdOptions3, flutterNativeAdListener, flutterAdManagerAdRequest.asAdManagerAdRequest(this.adUnitId));
        }
    }

    /* access modifiers changed from: package-private */
    public void onNativeAdLoaded(NativeAd nativeAd) {
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = this.nativeTemplateStyle;
        if (flutterNativeTemplateStyle != null) {
            TemplateView asTemplateView = flutterNativeTemplateStyle.asTemplateView(this.context);
            this.templateView = asTemplateView;
            asTemplateView.setNativeAd(nativeAd);
        } else {
            this.nativeAdView = this.adFactory.createNativeAd(nativeAd, this.customOptions);
        }
        nativeAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, nativeAd.getResponseInfo());
    }

    protected FlutterNativeAd(Context context2, int i10, AdInstanceManager adInstanceManager, String str, GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i10);
        this.context = context2;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader2;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }
}
