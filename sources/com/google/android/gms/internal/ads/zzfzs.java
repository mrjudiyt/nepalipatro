package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfzs {
    private final boolean zza;
    private final zzfvs zzb;

    /* synthetic */ zzfzs(boolean z10, zzfvs zzfvs, zzfzr zzfzr) {
        this.zza = z10;
        this.zzb = zzfvs;
    }

    public final e zza(Callable callable, Executor executor) {
        return new zzfzg(this.zzb, this.zza, executor, callable);
    }
}
