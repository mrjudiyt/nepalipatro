package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.zzly;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzlu<T extends Context & zzly> {
    private final T zza;

    public zzlu(T t10) {
        Preconditions.checkNotNull(t10);
        this.zza = t10;
    }

    private final zzfr zzc() {
        return zzhf.zza(this.zza, (zzdd) null, (Long) null).zzj();
    }

    public final int zza(Intent intent, int i10, int i11) {
        zzfr zzj = zzhf.zza(this.zza, (zzdd) null, (Long) null).zzj();
        if (intent == null) {
            zzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza((Runnable) new zzlw(this, i11, zzj, intent));
        }
        return 2;
    }

    public final void zzb() {
        zzhf.zza(this.zza, (zzdd) null, (Long) null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        zzc().zzp().zza("onRebind called. action", intent.getAction());
    }

    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhj(zzmp.zza((Context) this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i10, zzfr zzfr, Intent intent) {
        if (((zzly) this.zza).zza(i10)) {
            zzfr.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            zzc().zzp().zza("Completed wakeful intent.");
            ((zzly) this.zza).zza(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzfr zzfr, JobParameters jobParameters) {
        zzfr.zzp().zza("AppMeasurementJobService processed last upload request.");
        ((zzly) this.zza).zza(jobParameters, false);
    }

    public final void zza() {
        zzhf.zza(this.zza, (zzdd) null, (Long) null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    private final void zza(Runnable runnable) {
        zzmp zza2 = zzmp.zza((Context) this.zza);
        zza2.zzl().zzb((Runnable) new zzlv(this, zza2, runnable));
    }

    @TargetApi(24)
    public final boolean zza(JobParameters jobParameters) {
        zzfr zzj = zzhf.zza(this.zza, (zzdd) null, (Long) null).zzj();
        String string = jobParameters.getExtras().getString(NativeProtocol.WEB_DIALOG_ACTION);
        zzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza((Runnable) new zzlt(this, zzj, jobParameters));
        return true;
    }
}
