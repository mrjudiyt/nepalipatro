package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzly;
import n0.a;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class AppMeasurementService extends Service implements zzly {
    private zzlu<AppMeasurementService> zza;

    private final zzlu<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzlu<>(this);
        }
        return this.zza;
    }

    public final IBinder onBind(Intent intent) {
        return zza().zza(intent);
    }

    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        zza().zzb(intent);
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        return zza().zza(intent, i10, i11);
    }

    public final boolean onUnbind(Intent intent) {
        return zza().zzc(intent);
    }

    public final void zza(Intent intent) {
        a.completeWakefulIntent(intent);
    }

    public final void zza(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
