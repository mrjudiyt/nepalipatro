package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzbu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbv zza;

    zzbu(zzbv zzbv) {
        this.zza = zzbv;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        zzfb zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzK("Job execution failed", th);
        }
    }
}
