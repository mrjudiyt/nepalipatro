package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import k6.b;
import k6.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzbg implements f.b {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ b.a zzb;

    public /* synthetic */ zzbg(Activity activity, b.a aVar) {
        this.zza = activity;
        this.zzb = aVar;
    }

    public final void onConsentFormLoadSuccess(b bVar) {
        bVar.show(this.zza, this.zzb);
    }
}
