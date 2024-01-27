package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.auth.zzap;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
abstract class zzl extends TaskApiCall {
    protected TaskCompletionSource zzb;

    /* synthetic */ zzl(int i10, zzk zzk) {
        super((Feature[]) null, false, i10);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        this.zzb = taskCompletionSource;
        zza((zzau) ((zzap) anyClient).getService());
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzau zzau);
}
