package com.google.android.gms.analytics;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzn extends ThreadPoolExecutor {
    final /* synthetic */ zzr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzn(zzr zzr) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.zza = zzr;
        setThreadFactory(new zzp((zzo) null));
        allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return new zzm(this, runnable, t10);
    }
}
