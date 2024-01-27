package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzcv implements Runnable {
    final /* synthetic */ zzcw zza;

    zzcv(zzcw zzcw) {
        this.zza = zzcw;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zza.zzb.zzd().zzi(this);
            return;
        }
        boolean zzh = this.zza.zzh();
        this.zza.zzd = 0;
        if (zzh) {
            this.zza.zza();
        }
    }
}
