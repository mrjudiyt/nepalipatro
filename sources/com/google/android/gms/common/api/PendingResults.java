package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class PendingResults {
    @KeepForSdk
    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(!r10.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zag = new zag(googleApiClient, r10);
        zag.setResult(r10);
        return zag;
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zah zah = new zah((GoogleApiClient) null);
        zah.setResult(r10);
        return new OptionalPendingResultImpl(zah);
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r10) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        Preconditions.checkArgument(r10.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zaf = new zaf(r10);
        zaf.cancel();
        return zaf;
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r10, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r10, "Result must not be null");
        zah zah = new zah(googleApiClient);
        zah.setResult(r10);
        return new OptionalPendingResultImpl(zah);
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
