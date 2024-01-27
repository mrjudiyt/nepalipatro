package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzcai;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class InterstitialAd {
    public static void load(Context context, String str, AdRequest adRequest, InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzi.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new zza(context, str, adRequest, interstitialAdLoadCallback));
                return;
            }
        }
        new zzbmc(context, str).zza(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
