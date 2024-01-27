package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private final Activity zza;
    private final int zzb;

    protected ResolvingResultCallbacks(Activity activity, int i10) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
        this.zzb = i10;
    }

    @KeepForSdk
    public final void onFailure(Status status) {
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(this.zza, this.zzb);
            } catch (IntentSender.SendIntentException unused) {
                onUnresolvableFailure(new Status(8));
            }
        } else {
            onUnresolvableFailure(status);
        }
    }

    public abstract void onSuccess(R r10);

    public abstract void onUnresolvableFailure(Status status);
}
