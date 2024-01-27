package com.google.android.gms.internal.consent_sdk;

import k6.b;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbo implements Runnable {
    public final /* synthetic */ b.a zza;

    public /* synthetic */ zzbo(b.a aVar) {
        this.zza = aVar;
    }

    public final void run() {
        this.zza.onConsentFormDismissed(new zzi(3, "Privacy options form is being loading. Please try again later.").zza());
    }
}
