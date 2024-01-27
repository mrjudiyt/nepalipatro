package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzduj implements Callable {
    public final /* synthetic */ zzdur zza;
    public final /* synthetic */ zzfit zzb;

    public /* synthetic */ zzduj(zzdur zzdur, zzfit zzfit) {
        this.zza = zzdur;
        this.zzb = zzfit;
    }

    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}
