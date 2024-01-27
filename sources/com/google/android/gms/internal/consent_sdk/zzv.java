package com.google.android.gms.internal.consent_sdk;

import k6.c;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzv implements Runnable {
    public final /* synthetic */ c.a zza;
    public final /* synthetic */ zzi zzb;

    public /* synthetic */ zzv(c.a aVar, zzi zzi) {
        this.zza = aVar;
        this.zzb = zzi;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateFailure(this.zzb.zza());
    }
}
