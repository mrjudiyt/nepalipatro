package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.lang.ref.WeakReference;

class FlutterRewardedInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRIAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    RewardedInterstitialAd rewardedInterstitialAd;

    private static final class DelegatingRewardedCallback extends RewardedInterstitialAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedInterstitialAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedInterstitialAd flutterRewardedInterstitialAd) {
            this.delegate = new WeakReference<>(flutterRewardedInterstitialAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedInterstitialAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                ((FlutterRewardedInterstitialAd) this.delegate.get()).onAdMetadataChanged();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedInterstitialAd) this.delegate.get()).onUserEarnedReward(rewardItem);
            }
        }

        public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedInterstitialAd) this.delegate.get()).onAdLoaded(rewardedInterstitialAd);
            }
        }
    }

    public FlutterRewardedInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader2;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.rewardedInterstitialAd = null;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader2.loadRewardedInterstitial(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest != null) {
            FlutterAdLoader flutterAdLoader3 = this.flutterAdLoader;
            String str2 = this.adUnitId;
            flutterAdLoader3.loadAdManagerRewardedInterstitial(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd2) {
        this.rewardedInterstitialAd = rewardedInterstitialAd2;
        rewardedInterstitialAd2.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedInterstitialAd2.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    /* access modifiers changed from: package-private */
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardedAd.FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    public void setImmersiveMode(boolean z10) {
        RewardedInterstitialAd rewardedInterstitialAd2 = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd2 != null) {
            rewardedInterstitialAd2.setImmersiveMode(z10);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedInterstitialAd rewardedInterstitialAd2 = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd2 != null) {
            rewardedInterstitialAd2.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        }
    }

    public void show() {
        if (this.rewardedInterstitialAd != null && this.manager.getActivity() != null) {
            this.rewardedInterstitialAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedInterstitialAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedInterstitialAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    public FlutterRewardedInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader2;
    }
}
