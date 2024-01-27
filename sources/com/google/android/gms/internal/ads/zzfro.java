package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfro implements OnCompleteListener {
    public final /* synthetic */ zzfrw zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfro(zzfrw zzfrw, TaskCompletionSource taskCompletionSource) {
        this.zza = zzfrw;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.zza.zzt(this.zzb, task);
    }
}
