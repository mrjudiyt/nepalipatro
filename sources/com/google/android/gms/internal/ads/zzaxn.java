package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzaxn implements Runnable {
    public final /* synthetic */ zzcbl zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzaxn(zzcbl zzcbl, Future future) {
        this.zza = zzcbl;
        this.zzb = future;
    }

    public final void run() {
        if (this.zza.isCancelled()) {
            this.zzb.cancel(true);
        }
    }
}
