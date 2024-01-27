package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgas extends zzfzj implements RunnableFuture {
    private volatile zzgac zza;

    zzgas(zzfyz zzfyz) {
        this.zza = new zzgaq(this, zzfyz);
    }

    static zzgas zze(Runnable runnable, Object obj) {
        return new zzgas(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzgac zzgac = this.zza;
        if (zzgac != null) {
            zzgac.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzgac zzgac = this.zza;
        if (zzgac == null) {
            return super.zza();
        }
        String obj = zzgac.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzgac zzgac;
        if (zzt() && (zzgac = this.zza) != null) {
            zzgac.zzh();
        }
        this.zza = null;
    }

    zzgas(Callable callable) {
        this.zza = new zzgar(this, callable);
    }
}
