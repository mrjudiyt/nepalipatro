package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgae implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfyh zzb;

    zzgae(Executor executor, zzfyh zzfyh) {
        this.zza = executor;
        this.zzb = zzfyh;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }
}
