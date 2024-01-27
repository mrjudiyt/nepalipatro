package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class zacv extends TaskApiCall {
    final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.zaa = builder;
    }

    /* access modifiers changed from: protected */
    public final void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.zaa.zaa.accept(anyClient, taskCompletionSource);
    }
}
