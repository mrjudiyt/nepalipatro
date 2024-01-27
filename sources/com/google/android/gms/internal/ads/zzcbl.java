package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzcbl implements e {
    private final zzgal zza = zzgal.zze();

    private static final boolean zza(boolean z10) {
        if (!z10) {
            zzt.zzo().zzt(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    public boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    public final Object get() {
        return this.zza.get();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(Object obj) {
        boolean zzc = this.zza.zzc(obj);
        zza(zzc);
        return zzc;
    }

    public final boolean zzd(Throwable th) {
        boolean zzd = this.zza.zzd(th);
        zza(zzd);
        return zzd;
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        return this.zza.get(j10, timeUnit);
    }
}
