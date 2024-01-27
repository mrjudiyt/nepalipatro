package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfmp implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfmp(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.setResult(zzfos.zzc());
    }
}
