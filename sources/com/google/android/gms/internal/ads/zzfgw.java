package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfgw implements e {
    private final Object zza;
    private final String zzb;
    private final e zzc;

    public zzfgw(Object obj, String str, e eVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = eVar;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        return this.zzc.cancel(z10);
    }

    public final Object get() {
        return this.zzc.get();
    }

    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return this.zzb + "@" + identityHashCode;
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        return this.zzc.get(j10, timeUnit);
    }
}
