package e3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.c;
import java.util.HashMap;

/* compiled from: FacebookNativeAdPlugin */
class f implements PlatformView, NativeAdListener {

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f8021h;

    /* renamed from: i  reason: collision with root package name */
    private final MethodChannel f8022i;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap f8023j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f8024k;

    /* renamed from: l  reason: collision with root package name */
    private NativeAd f8025l;

    /* renamed from: m  reason: collision with root package name */
    private NativeBannerAd f8026m;

    /* compiled from: FacebookNativeAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            f.this.d();
        }
    }

    f(Context context, int i10, HashMap hashMap, BinaryMessenger binaryMessenger) {
        this.f8021h = new LinearLayout(context);
        this.f8022i = new MethodChannel(binaryMessenger, "fb.audience.network.io/nativeAd_" + i10);
        this.f8023j = hashMap;
        this.f8024k = context;
        if (((Boolean) hashMap.get("banner_ad")).booleanValue()) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, (String) hashMap.get("id"));
            this.f8026m = nativeBannerAd;
            this.f8026m.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
            return;
        }
        NativeAd nativeAd = new NativeAd(context, (String) hashMap.get("id"));
        this.f8025l = nativeAd;
        this.f8025l.loadAd(nativeAd.buildLoadAdConfig().withAdListener(this).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
    }

    private NativeBannerAdView.Type b(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)).intValue();
        if (intValue == 50) {
            return NativeBannerAdView.Type.HEIGHT_50;
        }
        if (intValue == 100) {
            return NativeBannerAdView.Type.HEIGHT_100;
        }
        if (intValue != 120) {
            return NativeBannerAdView.Type.HEIGHT_120;
        }
        return NativeBannerAdView.Type.HEIGHT_120;
    }

    private NativeAdViewAttributes c(Context context, HashMap hashMap) {
        NativeAdViewAttributes nativeAdViewAttributes = new NativeAdViewAttributes(context);
        if (hashMap.get("bg_color") != null) {
            nativeAdViewAttributes.setBackgroundColor(Color.parseColor((String) hashMap.get("bg_color")));
        }
        if (hashMap.get("title_color") != null) {
            nativeAdViewAttributes.setTitleTextColor(Color.parseColor((String) hashMap.get("title_color")));
        }
        if (hashMap.get("desc_color") != null) {
            nativeAdViewAttributes.setDescriptionTextColor(Color.parseColor((String) hashMap.get("desc_color")));
        }
        if (hashMap.get("button_color") != null) {
            nativeAdViewAttributes.setButtonColor(Color.parseColor((String) hashMap.get("button_color")));
        }
        if (hashMap.get("button_title_color") != null) {
            nativeAdViewAttributes.setButtonTextColor(Color.parseColor((String) hashMap.get("button_title_color")));
        }
        if (hashMap.get("button_border_color") != null) {
            nativeAdViewAttributes.setButtonBorderColor(Color.parseColor((String) hashMap.get("button_border_color")));
        }
        return nativeAdViewAttributes;
    }

    /* access modifiers changed from: private */
    public void d() {
        if (this.f8021h.getChildCount() > 0) {
            this.f8021h.removeAllViews();
        }
        if (((Boolean) this.f8023j.get("banner_ad")).booleanValue()) {
            this.f8021h.addView(NativeBannerAdView.render(this.f8024k, this.f8026m, b(this.f8023j), c(this.f8024k, this.f8023j)));
        } else {
            LinearLayout linearLayout = this.f8021h;
            Context context = this.f8024k;
            linearLayout.addView(NativeAdView.render(context, this.f8025l, c(context, this.f8023j)));
        }
        this.f8022i.invokeMethod("loaded", this.f8023j);
    }

    public void dispose() {
    }

    public View getView() {
        return this.f8021h;
    }

    public void onAdClicked(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8022i.invokeMethod("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8022i.invokeMethod("load_success", hashMap);
        this.f8021h.postDelayed(new a(), 200);
    }

    public void onError(Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_CODE, Integer.valueOf(adError.getErrorCode()));
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, adError.getErrorMessage());
        this.f8022i.invokeMethod("error", hashMap);
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        c.a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        c.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        c.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        c.d(this);
    }

    public void onLoggingImpression(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8022i.invokeMethod("logging_impression", hashMap);
    }

    public void onMediaDownloaded(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8022i.invokeMethod("media_downloaded", hashMap);
    }
}
