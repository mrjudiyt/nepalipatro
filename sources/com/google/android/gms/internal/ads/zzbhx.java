package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhx extends zzbhh {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbhx(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
