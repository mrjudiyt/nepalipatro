package com.google.android.gms.fido.fido2;

import android.app.Activity;

@Deprecated
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i10);
}
