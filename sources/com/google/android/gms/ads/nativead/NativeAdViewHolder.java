package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzcat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();
    private zzbfy zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzcat.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzcat.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzay.zza().zzi(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzb(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzcat.zzh("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.google.android.gms.dynamic.IObjectWrapper, java.lang.Object] */
    public void setNativeAd(NativeAd nativeAd) {
        ? zza2 = nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzcat.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbfy zzbfy = this.zzb;
        if (zzbfy != null) {
            try {
                zzbfy.zzc(zza2);
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call setNativeAd on delegate", e10);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbfy zzbfy = this.zzb;
        if (zzbfy != null) {
            try {
                zzbfy.zzd();
            } catch (RemoteException e10) {
                zzcat.zzh("Unable to call unregisterNativeAd on delegate", e10);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
