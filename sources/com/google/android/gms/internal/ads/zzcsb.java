package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzcsb implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcsb(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzcsd.zzi(this.zza);
    }
}
