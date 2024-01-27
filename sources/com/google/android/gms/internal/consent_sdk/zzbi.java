package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.atomic.AtomicReference;
import k6.b;
import k6.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbi implements f.b {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzbi(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.set(bVar);
    }
}
