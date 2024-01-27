package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzegm implements Callable {
    public final /* synthetic */ zzego zza;
    public final /* synthetic */ zzfde zzb;
    public final /* synthetic */ zzfcr zzc;

    public /* synthetic */ zzegm(zzego zzego, zzfde zzfde, zzfcr zzfcr) {
        this.zza = zzego;
        this.zzb = zzfde;
        this.zzc = zzfcr;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
