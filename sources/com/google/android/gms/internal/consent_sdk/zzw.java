package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import k6.c;
import k6.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzw implements Runnable {
    public final /* synthetic */ zzx zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ d zzc;
    public final /* synthetic */ c.b zzd;
    public final /* synthetic */ c.a zze;

    public /* synthetic */ zzw(zzx zzx, Activity activity, d dVar, c.b bVar, c.a aVar) {
        this.zza = zzx;
        this.zzb = activity;
        this.zzc = dVar;
        this.zzd = bVar;
        this.zze = aVar;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
