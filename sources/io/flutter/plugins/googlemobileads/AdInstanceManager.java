package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.util.HashMap;
import java.util.Map;

class AdInstanceManager {
    private Activity activity;
    private final Map<Integer, FlutterAd> ads = new HashMap();
    /* access modifiers changed from: private */
    public final MethodChannel channel;

    AdInstanceManager(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                AdInstanceManager.this.channel.invokeMethod("onAdEvent", map);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public FlutterAd adForId(int i10) {
        return this.ads.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public Integer adIdFor(FlutterAd flutterAd) {
        for (Integer next : this.ads.keySet()) {
            if (this.ads.get(next) == flutterAd) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void disposeAd(int i10) {
        if (this.ads.containsKey(Integer.valueOf(i10))) {
            FlutterAd flutterAd = this.ads.get(Integer.valueOf(i10));
            if (flutterAd != null) {
                flutterAd.dispose();
            }
            this.ads.remove(Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void disposeAllAds() {
        for (Map.Entry next : this.ads.entrySet()) {
            if (next.getValue() != null) {
                ((FlutterAd) next.getValue()).dispose();
            }
        }
        this.ads.clear();
    }

    /* access modifiers changed from: package-private */
    public Activity getActivity() {
        return this.activity;
    }

    /* access modifiers changed from: package-private */
    public void onAdClicked(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdClicked");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdClosed");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdDismissedFullScreenContent(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdDismissedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(int i10, FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdFailedToLoad");
        hashMap.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdImpression(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdImpression");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(int i10, ResponseInfo responseInfo) {
        FlutterAd.FlutterResponseInfo flutterResponseInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdLoaded");
        if (responseInfo == null) {
            flutterResponseInfo = null;
        } else {
            flutterResponseInfo = new FlutterAd.FlutterResponseInfo(responseInfo);
        }
        hashMap.put("responseInfo", flutterResponseInfo);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdMetadataChanged(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdMetadataChanged");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdOpened(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdOpened");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdShowedFullScreenContent(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAdShowedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAppEvent(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onFailedToShowFullScreenContent(int i10, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onFailedToShowFullScreenContent");
        hashMap.put("error", new FlutterAd.FlutterAdError(adError));
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onFluidAdHeightChanged(int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onFluidAdHeightChanged");
        hashMap.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, Integer.valueOf(i11));
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onPaidEvent(FlutterAd flutterAd, FlutterAdValue flutterAdValue) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", adIdFor(flutterAd));
        hashMap.put(Constants.EVENT_NAME, "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        hashMap.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        hashMap.put("currencyCode", flutterAdValue.currencyCode);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onRewardedAdUserEarnedReward(int i10, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onRewardedInterstitialAdUserEarnedReward(int i10, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(Constants.EVENT_NAME, "onRewardedInterstitialAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    /* access modifiers changed from: package-private */
    public boolean showAdWithId(int i10) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i10);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void trackAd(FlutterAd flutterAd, int i10) {
        if (this.ads.get(Integer.valueOf(i10)) == null) {
            this.ads.put(Integer.valueOf(i10), flutterAd);
        } else {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i10)}));
        }
    }
}
