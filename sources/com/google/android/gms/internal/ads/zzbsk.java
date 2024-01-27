package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbsk extends zzbhb {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbsk(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzbhl zzbhl) {
        this.zza.onNativeAdLoaded(new zzbsd(zzbhl));
    }
}
