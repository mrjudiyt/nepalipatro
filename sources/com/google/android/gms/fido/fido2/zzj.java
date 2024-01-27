package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
final class zzj extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    zzj(Fido2ApiClient fido2ApiClient, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(boolean z10) {
        this.zza.setResult(Boolean.valueOf(z10));
    }

    public final void zzc(Status status) {
        this.zza.trySetException(new ApiException(status));
    }
}
