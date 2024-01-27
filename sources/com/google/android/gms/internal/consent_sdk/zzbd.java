package com.google.android.gms.internal.consent_sdk;

import k6.b;
import k6.e;
import k6.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzbd implements f.b, f.a {
    private final f.b zza;
    private final f.a zzb;

    /* synthetic */ zzbd(f.b bVar, f.a aVar, zzbc zzbc) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    public final void onConsentFormLoadFailure(e eVar) {
        this.zzb.onConsentFormLoadFailure(eVar);
    }

    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
