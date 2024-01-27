package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.fido.fido2.Fido2PendingIntent;

@Deprecated
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
public final class zzi implements Fido2PendingIntent {
    private final PendingIntent zza;

    public zzi(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    public final void launchPendingIntent(Activity activity, int i10) {
        PendingIntent pendingIntent = this.zza;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0);
            return;
        }
        throw new IllegalStateException("No PendingIntent available");
    }
}
