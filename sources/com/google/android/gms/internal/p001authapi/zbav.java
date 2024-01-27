package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbav  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
final class zbav extends IStatusCallback.Stub {
    final /* synthetic */ TaskCompletionSource zba;

    zbav(zbay zbay, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.zba);
    }
}
