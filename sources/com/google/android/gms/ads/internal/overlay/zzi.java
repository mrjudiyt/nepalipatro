package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzk zza;
    public final /* synthetic */ Drawable zzb;

    public /* synthetic */ zzi(zzk zzk, Drawable drawable) {
        this.zza = zzk;
        this.zzb = drawable;
    }

    public final void run() {
        this.zza.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
    }
}
