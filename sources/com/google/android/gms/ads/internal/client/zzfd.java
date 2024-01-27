package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzfd extends zzdc {
    private final OnAdMetadataChangedListener zza;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zza = onAdMetadataChangedListener;
    }

    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zza;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
