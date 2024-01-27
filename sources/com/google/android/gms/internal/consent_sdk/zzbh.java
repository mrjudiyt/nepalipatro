package com.google.android.gms.internal.consent_sdk;

import k6.b;
import k6.e;
import k6.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbh implements f.a {
    public final /* synthetic */ b.a zza;

    public /* synthetic */ zzbh(b.a aVar) {
        this.zza = aVar;
    }

    public final void onConsentFormLoadFailure(e eVar) {
        this.zza.onConsentFormDismissed(eVar);
    }
}
