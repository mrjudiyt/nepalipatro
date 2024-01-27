package e3;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* compiled from: FacebookInterstitialAdPlugin */
class d implements MethodChannel.MethodCallHandler, InterstitialAdListener {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public InterstitialAd f8015h = null;

    /* renamed from: i  reason: collision with root package name */
    private Context f8016i;

    /* renamed from: j  reason: collision with root package name */
    private MethodChannel f8017j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f8018k;

    /* compiled from: FacebookInterstitialAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (d.this.f8015h != null && d.this.f8015h.isAdLoaded() && !d.this.f8015h.isAdInvalidated()) {
                d.this.f8015h.show(d.this.f8015h.buildShowAdConfig().build());
            }
        }
    }

    d(Context context, MethodChannel methodChannel) {
        this.f8016i = context;
        this.f8017j = methodChannel;
        this.f8018k = new Handler();
    }

    private boolean b() {
        InterstitialAd interstitialAd = this.f8015h;
        if (interstitialAd == null) {
            return false;
        }
        interstitialAd.destroy();
        this.f8015h = null;
        return true;
    }

    private boolean c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f8015h == null) {
            this.f8015h = new InterstitialAd(this.f8016i, str);
        }
        try {
            if (this.f8015h.isAdLoaded()) {
                return true;
            }
            this.f8015h.loadAd(this.f8015h.buildLoadAdConfig().withAdListener(this).withCacheFlags(CacheFlag.ALL).build());
            return true;
        } catch (Exception e10) {
            e10.getCause().getMessage();
            return false;
        }
    }

    private boolean d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        InterstitialAd interstitialAd = this.f8015h;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f8015h.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f8015h.show(this.f8015h.buildShowAdConfig().build());
            return true;
        }
        this.f8018k.postDelayed(new a(), (long) intValue);
        return true;
    }

    public void onAdClicked(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8017j.invokeMethod("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8017j.invokeMethod("loaded", hashMap);
    }

    public void onError(Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_CODE, Integer.valueOf(adError.getErrorCode()));
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, adError.getErrorMessage());
        this.f8017j.invokeMethod("error", hashMap);
    }

    public void onInterstitialDismissed(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8017j.invokeMethod("dismissed", hashMap);
    }

    public void onInterstitialDisplayed(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8017j.invokeMethod("displayed", hashMap);
    }

    public void onLoggingImpression(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8017j.invokeMethod("logging_impression", hashMap);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1193444148:
                if (str.equals("showInterstitialAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 166478601:
                if (str.equals("destroyInterstitialAd")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                result.success(Boolean.valueOf(c((HashMap) methodCall.arguments)));
                return;
            case 1:
                result.success(Boolean.valueOf(d((HashMap) methodCall.arguments)));
                return;
            case 2:
                result.success(Boolean.valueOf(b()));
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
