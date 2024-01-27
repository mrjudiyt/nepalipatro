package e3;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* compiled from: FacebookRewardedVideoAdPlugin */
class g implements MethodChannel.MethodCallHandler, RewardedVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public RewardedVideoAd f8028h = null;

    /* renamed from: i  reason: collision with root package name */
    private Context f8029i;

    /* renamed from: j  reason: collision with root package name */
    private MethodChannel f8030j;

    /* renamed from: k  reason: collision with root package name */
    private Handler f8031k;

    /* compiled from: FacebookRewardedVideoAdPlugin */
    class a implements Runnable {
        a() {
        }

        public void run() {
            if (g.this.f8028h != null && g.this.f8028h.isAdLoaded() && !g.this.f8028h.isAdInvalidated()) {
                g.this.f8028h.show(g.this.f8028h.buildShowAdConfig().build());
            }
        }
    }

    g(Context context, MethodChannel methodChannel) {
        this.f8029i = context;
        this.f8030j = methodChannel;
        this.f8031k = new Handler();
    }

    private boolean b() {
        RewardedVideoAd rewardedVideoAd = this.f8028h;
        if (rewardedVideoAd == null) {
            return false;
        }
        rewardedVideoAd.destroy();
        this.f8028h = null;
        return true;
    }

    private boolean c(HashMap hashMap) {
        String str = (String) hashMap.get("id");
        if (this.f8028h == null) {
            this.f8028h = new RewardedVideoAd(this.f8029i, str);
        }
        try {
            if (this.f8028h.isAdLoaded()) {
                return true;
            }
            this.f8028h.loadAd(this.f8028h.buildLoadAdConfig().withAdListener(this).build());
            return true;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }

    private boolean d(HashMap hashMap) {
        int intValue = ((Integer) hashMap.get("delay")).intValue();
        RewardedVideoAd rewardedVideoAd = this.f8028h;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f8028h.isAdInvalidated()) {
            return false;
        }
        if (intValue <= 0) {
            this.f8028h.show(this.f8028h.buildShowAdConfig().build());
            return true;
        }
        this.f8031k.postDelayed(new a(), (long) intValue);
        return true;
    }

    public void onAdClicked(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8030j.invokeMethod("clicked", hashMap);
    }

    public void onAdLoaded(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8030j.invokeMethod("loaded", hashMap);
    }

    public void onError(Ad ad, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        hashMap.put(NativeProtocol.BRIDGE_ARG_ERROR_CODE, Integer.valueOf(adError.getErrorCode()));
        hashMap.put(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE, adError.getErrorMessage());
        this.f8030j.invokeMethod("error", hashMap);
    }

    public void onLoggingImpression(Ad ad) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", ad.getPlacementId());
        hashMap.put("invalidated", Boolean.valueOf(ad.isAdInvalidated()));
        this.f8030j.invokeMethod("logging_impression", hashMap);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1009162322:
                if (str.equals("showRewardedAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case -15281045:
                if (str.equals("destroyRewardedAd")) {
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

    public void onRewardedVideoClosed() {
        this.f8030j.invokeMethod("rewarded_closed", Boolean.TRUE);
    }

    public void onRewardedVideoCompleted() {
        this.f8030j.invokeMethod("rewarded_complete", Boolean.TRUE);
    }
}
