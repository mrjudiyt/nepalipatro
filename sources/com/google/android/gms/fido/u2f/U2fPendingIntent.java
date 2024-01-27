package com.google.android.gms.fido.u2f;

import android.app.Activity;

@Deprecated
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i10);
}
