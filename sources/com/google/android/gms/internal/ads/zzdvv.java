package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdvv implements NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ zzdwg zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdvv(zzdwg zzdwg, String str, String str2) {
        this.zza = zzdwg;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void onNativeAdLoaded(NativeAd nativeAd) {
        this.zza.zzg(this.zzb, nativeAd, this.zzc);
    }
}
