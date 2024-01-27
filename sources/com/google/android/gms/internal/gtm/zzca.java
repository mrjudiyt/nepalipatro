package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzca implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzcb zzb;

    zzca(zzcb zzcb, ComponentName componentName) {
        this.zzb = zzcb;
        this.zza = componentName;
    }

    public final void run() {
        zzcc.zzb(this.zzb.zza, this.zza);
    }
}
