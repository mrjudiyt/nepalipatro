package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import k6.a;
import k6.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzn {
    /* access modifiers changed from: private */
    public final Application zza;
    /* access modifiers changed from: private */
    public final zza zzb;
    /* access modifiers changed from: private */
    public final zzas zzc;

    zzn(Application application, zza zza2, zzas zzas) {
        this.zza = application;
        this.zzb = zza2;
        this.zzc = zzas;
    }

    /* access modifiers changed from: package-private */
    public final zzck zzd(Activity activity, d dVar) {
        a a10 = dVar.a();
        if (a10 == null) {
            a10 = new a.C0256a(this.zza).b();
        }
        return zzp.zza(new zzp(this, activity, a10, dVar, (zzo) null));
    }
}
