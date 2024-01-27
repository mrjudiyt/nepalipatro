package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzfmm implements Continuation {
    public static final /* synthetic */ zzfmm zza = new zzfmm();

    private /* synthetic */ zzfmm() {
    }

    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}
