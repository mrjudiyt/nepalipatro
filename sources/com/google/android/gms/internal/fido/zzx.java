package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzx extends zzu {
    final /* synthetic */ TaskCompletionSource zza;

    zzx(zzy zzy, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zza);
    }
}
