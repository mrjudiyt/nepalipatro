package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdwd extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwg zzb;

    zzdwd(zzdwg zzdwg, String str) {
        this.zzb = zzdwg;
        this.zza = str;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzdwg.zzl(loadAdError), this.zza);
    }
}
