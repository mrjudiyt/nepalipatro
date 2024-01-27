package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfzm extends zzfvj implements Future {
    protected zzfzm() {
    }

    public boolean cancel(boolean z10) {
        return zzb().cancel(z10);
    }

    public final Object get() {
        return zzb().get();
    }

    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    public final boolean isDone() {
        return zzb().isDone();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Future zzb();

    public final Object get(long j10, TimeUnit timeUnit) {
        return zzb().get(j10, timeUnit);
    }
}
