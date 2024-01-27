package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbyv implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    zzbyv(zzbyy zzbyy) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + andIncrement);
    }
}
