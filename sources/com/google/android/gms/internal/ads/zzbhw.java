package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhw extends zzbhb {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbhw(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    public final void zze(zzbhl zzbhl) {
        this.zza.onUnifiedNativeAdLoaded(new zzbhm(zzbhl));
    }
}
