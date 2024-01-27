package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @KeepForSdk
    public final void onResult(R r10) {
        Status status = r10.getStatus();
        if (status.isSuccess()) {
            onSuccess(r10);
            return;
        }
        onFailure(status);
        if (r10 instanceof Releasable) {
            try {
                ((Releasable) r10).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r10));
            }
        }
    }

    public abstract void onSuccess(R r10);
}
