package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class zziw implements Runnable {
    private /* synthetic */ zziq zza;
    private /* synthetic */ Bundle zzb;
    private /* synthetic */ long zzc;

    public /* synthetic */ zziw(zziq zziq, Bundle bundle, long j10) {
        this.zza = zziq;
        this.zzb = bundle;
        this.zzc = j10;
    }

    public final void run() {
        zziq zziq = this.zza;
        Bundle bundle = this.zzb;
        long j10 = this.zzc;
        if (TextUtils.isEmpty(zziq.zzg().zzae())) {
            zziq.zza(bundle, 0, j10);
        } else {
            zziq.zzj().zzv().zza("Using developer consent only; google app id found");
        }
    }
}
