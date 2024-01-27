package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public class FlutterAdLoader {
    private final Context context;

    public FlutterAdLoader(Context context2) {
        this.context = context2;
    }

    public void loadAdManagerAppOpen(String str, AdManagerAdRequest adManagerAdRequest, int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AppOpenAd.load(this.context, str, adManagerAdRequest, i10, appOpenAdLoadCallback);
    }

    public void loadAdManagerInterstitial(String str, AdManagerAdRequest adManagerAdRequest, AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        AdManagerInterstitialAd.load(this.context, str, adManagerAdRequest, adManagerInterstitialAdLoadCallback);
    }

    public void loadAdManagerNativeAd(String str, NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, NativeAdOptions nativeAdOptions, AdListener adListener, AdManagerAdRequest adManagerAdRequest) {
        new AdLoader.Builder(this.context, str).forNativeAd(onNativeAdLoadedListener).withNativeAdOptions(nativeAdOptions).withAdListener(adListener).build().loadAd(adManagerAdRequest);
    }

    public void loadAdManagerRewarded(String str, AdManagerAdRequest adManagerAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        RewardedAd.load(this.context, str, adManagerAdRequest, rewardedAdLoadCallback);
    }

    public void loadAdManagerRewardedInterstitial(String str, AdManagerAdRequest adManagerAdRequest, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        RewardedInterstitialAd.load(this.context, str, adManagerAdRequest, rewardedInterstitialAdLoadCallback);
    }

    public void loadAppOpen(String str, AdRequest adRequest, int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AppOpenAd.load(this.context, str, adRequest, i10, appOpenAdLoadCallback);
    }

    public void loadInterstitial(String str, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        InterstitialAd.load(this.context, str, adRequest, interstitialAdLoadCallback);
    }

    public void loadNativeAd(String str, NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, NativeAdOptions nativeAdOptions, AdListener adListener, AdRequest adRequest) {
        new AdLoader.Builder(this.context, str).forNativeAd(onNativeAdLoadedListener).withNativeAdOptions(nativeAdOptions).withAdListener(adListener).build().loadAd(adRequest);
    }

    public void loadRewarded(String str, AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        RewardedAd.load(this.context, str, adRequest, rewardedAdLoadCallback);
    }

    public void loadRewardedInterstitial(String str, AdRequest adRequest, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        RewardedInterstitialAd.load(this.context, str, adRequest, rewardedInterstitialAdLoadCallback);
    }
}
