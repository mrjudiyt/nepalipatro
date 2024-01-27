package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbxi extends zzbwv {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbxj zzb;

    public zzbxi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbxj zzbxj) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbxj;
    }

    public final void zze(int i10) {
    }

    public final void zzf(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzg() {
        zzbxj zzbxj;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzbxj = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzbxj);
        }
    }
}
