package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfzx implements e {
    static final e zza = new zzfzx((Object) null);
    private static final Logger zzb = Logger.getLogger(zzfzx.class.getName());
    private final Object zzc;

    zzfzx(Object obj) {
        this.zzc = obj;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        zzfsw.zzc(runnable, "Runnable was null.");
        zzfsw.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e10);
        }
    }

    public final boolean cancel(boolean z10) {
        return false;
    }

    public final Object get() {
        return this.zzc;
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        return obj2 + "[status=SUCCESS, result=[" + valueOf + "]]";
    }
}
