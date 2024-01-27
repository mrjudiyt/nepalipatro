package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

class FlutterRewardedAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRewardedAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    RewardedAd rewardedAd;

    private static final class DelegatingRewardedCallback extends RewardedAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedAd flutterRewardedAd) {
            this.delegate = new WeakReference<>(flutterRewardedAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdMetadataChanged();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onUserEarnedReward(rewardItem);
            }
        }

        public void onAdLoaded(RewardedAd rewardedAd) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdLoaded(rewardedAd);
            }
        }
    }

    static class FlutterRewardItem {
        final Integer amount;
        final String type;

        FlutterRewardItem(Integer num, String str) {
            this.amount = num;
            this.type = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterRewardItem)) {
                return false;
            }
            FlutterRewardItem flutterRewardItem = (FlutterRewardItem) obj;
            if (!this.amount.equals(flutterRewardItem.amount)) {
                return false;
            }
            return this.type.equals(flutterRewardItem.type);
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.type.hashCode();
        }
    }

    public FlutterRewardedAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader2;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.rewardedAd = null;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader2.loadRewarded(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest != null) {
            FlutterAdLoader flutterAdLoader3 = this.flutterAdLoader;
            String str2 = this.adUnitId;
            flutterAdLoader3.loadAdManagerRewarded(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(RewardedAd rewardedAd2) {
        this.rewardedAd = rewardedAd2;
        rewardedAd2.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedAd2.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    /* access modifiers changed from: package-private */
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    public void setImmersiveMode(boolean z10) {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setImmersiveMode(z10);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        }
    }

    public void show() {
        if (this.rewardedAd != null && this.manager.getActivity() != null) {
            this.rewardedAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    public FlutterRewardedAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader2;
    }
}
