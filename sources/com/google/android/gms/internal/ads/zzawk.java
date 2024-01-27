package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzawk extends zzawr {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzawk(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    public final void zzb(int i10) {
    }

    public final void zzc(zze zze) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzd(zzawp zzawp) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzawl(zzawp, this.zzb));
        }
    }
}
