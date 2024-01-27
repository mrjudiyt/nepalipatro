package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdxi implements Callable {
    public final /* synthetic */ zzdxk zza;
    public final /* synthetic */ zzbvg zzb;

    public /* synthetic */ zzdxi(zzdxk zzdxk, zzbvg zzbvg) {
        this.zza = zzdxk;
        this.zzb = zzbvg;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
