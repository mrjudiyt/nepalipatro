package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbty;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ AppOpenAd.AppOpenAdLoadCallback zze;

    public /* synthetic */ zzc(Context context, String str, AdManagerAdRequest adManagerAdRequest, int i10, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zza = context;
        this.zzb = str;
        this.zzc = adManagerAdRequest;
        this.zzd = i10;
        this.zze = appOpenAdLoadCallback;
    }

    public final void run() {
        Context context = this.zza;
        int i10 = this.zzd;
        String str = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        try {
            new zzawx(context, str, adManagerAdRequest.zza(), i10, this.zze).zza();
        } catch (IllegalStateException e10) {
            zzbty.zza(context).zzf(e10, "AppOpenAdManager.load");
        }
    }
}
