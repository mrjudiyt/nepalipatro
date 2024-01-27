package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfpy implements OnCompleteListener {
    public final /* synthetic */ zzfpz zza;

    public /* synthetic */ zzfpy(zzfpz zzfpz) {
        this.zza = zzfpz;
    }

    public final void onComplete(Task task) {
        zzfpz zzfpz = this.zza;
        if (task.isCanceled()) {
            zzfpz.cancel(false);
        } else if (task.isSuccessful()) {
            zzfpz.zzc(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfpz.zzd(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
