package e3;

import android.content.Context;
import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import java.util.HashMap;

/* compiled from: FacebookBannerAdPlugin */
class c implements PlatformView, AdListener {

    /* renamed from: h  reason: collision with root package name */
    private final AdView f8013h;

    /* renamed from: i  reason: collision with root package name */
    private final MethodChannel f8014i;

    c(Context context, int i10, HashMap hashMap, BinaryMessenger binaryMessenger) {
        this.f8014i = new MethodChannel(binaryMessenger, "fb.audience.network.io/bannerAd_" + i10);
        AdView adView = new AdView(context, (String) hashMap.get("id"), a(hashMap));
        this.f8013h = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).build());
    }

    private AdSize a(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)).intValue();
        if (intValue >= 250) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        if (intValue >= 90) {
            return AdSize.BANNER_HEIGHT_90;
        }
        return AdSize.BANNER_HEIGHT_50;
    }

    public void dispose() {
    }

    public View getView() {
        return this.f8013h;
    }

    public void onAdClicked(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8014i.invokeMethod("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8014i.invokeMethod("loaded", hashMap);
    }

    public void onError(Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_CODE, Integer.valueOf(adError.getErrorCode()));
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, adError.getErrorMessage());
        this.f8014i.invokeMethod("error", hashMap);
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        io.flutter.plugin.platform.c.a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        io.flutter.plugin.platform.c.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        io.flutter.plugin.platform.c.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        io.flutter.plugin.platform.c.d(this);
    }

    public void onLoggingImpression(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8014i.invokeMethod("logging_impression", hashMap);
    }
}
