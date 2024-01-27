package com.google.android.gms.internal.consent_sdk;

import k6.c;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ zzx zza;
    public final /* synthetic */ c.b zzb;
    public final /* synthetic */ zzac zzc;

    public /* synthetic */ zzs(zzx zzx, c.b bVar, zzac zzac) {
        this.zza = zzx;
        this.zzb = bVar;
        this.zzc = zzac;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}
