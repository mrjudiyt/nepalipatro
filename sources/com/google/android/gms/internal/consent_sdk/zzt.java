package com.google.android.gms.internal.consent_sdk;

import k6.c;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzt implements Runnable {
    public final /* synthetic */ c.b zza;

    public /* synthetic */ zzt(c.b bVar) {
        this.zza = bVar;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}
