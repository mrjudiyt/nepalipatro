package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzbxl implements Runnable {
    public final /* synthetic */ zzbxp zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzbxl(zzbxp zzbxp, Bitmap bitmap) {
        this.zza = zzbxp;
        this.zzb = bitmap;
    }

    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
