package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzf extends zzq {
    final /* synthetic */ TaskCompletionSource zza;

    zzf(Fido2ApiClient fido2ApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.zza);
    }
}
