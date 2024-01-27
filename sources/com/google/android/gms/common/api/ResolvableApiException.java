package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;

/* compiled from: com.google.android.gms:play-services-basement@@18.2.0 */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(Activity activity, int i10) {
        getStatus().startResolutionForResult(activity, i10);
    }
}
