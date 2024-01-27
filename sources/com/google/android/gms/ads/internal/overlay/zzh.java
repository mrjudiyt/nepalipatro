package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcgb;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcgb zzcgb) {
        this.zzb = zzcgb.getLayoutParams();
        ViewParent parent = zzcgb.getParent();
        this.zzd = zzcgb.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcgb.zzF());
        viewGroup.removeView(zzcgb.zzF());
        zzcgb.zzan(true);
    }
}
