package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgaj {
    public static zzgad zza(ExecutorService executorService) {
        zzgad zzgad;
        if (executorService instanceof zzgad) {
            return (zzgad) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgad = new zzgai((ScheduledExecutorService) executorService);
        } else {
            zzgad = new zzgaf(executorService);
        }
        return zzgad;
    }

    public static Executor zzb() {
        return zzfzh.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfyh zzfyh) {
        Objects.requireNonNull(executor);
        if (executor == zzfzh.INSTANCE) {
            return executor;
        }
        return new zzgae(executor, zzfyh);
    }
}
