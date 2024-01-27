package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdvz extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdwg zzd;

    zzdvz(zzdwg zzdwg, String str, AdView adView, String str2) {
        this.zzd = zzdwg;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzd.zzm(zzdwg.zzl(loadAdError), this.zzc);
    }

    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
