package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdvy extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdwg zzc;

    zzdvy(zzdwg zzdwg, String str, String str2) {
        this.zzc = zzdwg;
        this.zza = str;
        this.zzb = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzc.zzm(zzdwg.zzl(loadAdError), this.zzb);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, (AppOpenAd) obj, str);
    }
}
