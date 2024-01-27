package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzfrm implements Runnable {
    private final TaskCompletionSource zza;

    zzfrm() {
        this.zza = null;
    }

    public zzfrm(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        try {
            zza();
        } catch (Exception e10) {
            zzc(e10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zza();

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
