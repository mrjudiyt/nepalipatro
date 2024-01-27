package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbko;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class H5AdsRequestHandler {
    private final zzbko zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbko(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbko.zzc(str);
    }
}
