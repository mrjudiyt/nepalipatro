package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfym extends AbstractExecutorService implements zzgad {
    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgas.zze(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (e) super.submit(runnable);
    }

    public final e zza(Runnable runnable) {
        return (e) super.submit(runnable);
    }

    public final e zzb(Callable callable) {
        return (e) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgas(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (e) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (e) super.submit(callable);
    }
}
