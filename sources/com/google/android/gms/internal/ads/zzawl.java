package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzawl extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzawp zzb;
    private final String zzc;
    private final zzawm zzd = new zzawm();
    private OnPaidEventListener zze;

    public zzawl(zzawp zzawp, String str) {
        this.zzb = zzawp;
        this.zzc = str;
    }

    public final String getAdUnitId() {
        return this.zzc;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    public final ResponseInfo getResponseInfo() {
        zzdn zzdn;
        try {
            zzdn = this.zzb.zzf();
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
            zzdn = null;
        }
        return ResponseInfo.zzb(zzdn);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzg(z10);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzh(new zzfe(onPaidEventListener));
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void show(Activity activity) {
        try {
            this.zzb.zzi(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e10) {
            zzcat.zzl("#007 Could not call remote method.", e10);
        }
    }
}
