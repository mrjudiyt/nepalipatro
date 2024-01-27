package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbhv extends zzbgy {
    /* access modifiers changed from: private */
    public final OnAdManagerAdViewLoadedListener zza;

    public zzbhv(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final void zze(zzbu zzbu, IObjectWrapper iObjectWrapper) {
        if (zzbu != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbu.zzi() instanceof zzg) {
                    zzg zzg = (zzg) zzbu.zzi();
                    adManagerAdView.setAdListener(zzg != null ? zzg.zzb() : null);
                }
            } catch (RemoteException e10) {
                zzcat.zzh("", e10);
            }
            try {
                if (zzbu.zzj() instanceof zzavk) {
                    zzavk zzavk = (zzavk) zzbu.zzj();
                    if (zzavk != null) {
                        appEventListener = zzavk.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e11) {
                zzcat.zzh("", e11);
            }
            zzcam.zza.post(new zzbhu(this, adManagerAdView, zzbu));
        }
    }
}
