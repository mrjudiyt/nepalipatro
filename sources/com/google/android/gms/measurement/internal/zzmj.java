package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzmj extends zzmo {
    private final AlarmManager zza = ((AlarmManager) zza().getSystemService("alarm"));
    private zzaw zzb;
    private Integer zzc;

    protected zzmj(zzmp zzmp) {
        super(zzmp);
    }

    private final int zzv() {
        if (this.zzc == null) {
            String packageName = zza().getPackageName();
            this.zzc = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzw() {
        Context zza2 = zza();
        return zzcc.zza(zza2, 0, new Intent().setClassName(zza2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    private final zzaw zzx() {
        if (this.zzb == null) {
            this.zzb = new zzmm(this, this.zzf.zzk());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzy() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzv());
        }
    }

    public final /* bridge */ /* synthetic */ zzmz g_() {
        return super.g_();
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    /* access modifiers changed from: protected */
    public final boolean zzc() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzy();
        return false;
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzao zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ zzgp zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzls zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzmn zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zzu() {
        zzak();
        zzj().zzp().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        zzx().zza();
        if (Build.VERSION.SDK_INT >= 24) {
            zzy();
        }
    }

    public final void zza(long j10) {
        zzak();
        Context zza2 = zza();
        if (!zznd.zza(zza2)) {
            zzj().zzc().zza("Receiver not registered/enabled");
        }
        if (!zznd.zza(zza2, false)) {
            zzj().zzc().zza("Service not registered/enabled");
        }
        zzu();
        zzj().zzp().zza("Scheduling upload, millis", Long.valueOf(j10));
        long elapsedRealtime = zzb().elapsedRealtime() + j10;
        if (j10 < Math.max(0, zzbi.zzx.zza(null).longValue()) && !zzx().zzc()) {
            zzx().zza(j10);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context zza3 = zza();
            ComponentName componentName = new ComponentName(zza3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int zzv = zzv();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "com.google.android.gms.measurement.UPLOAD");
            zzce.zza(zza3, new JobInfo.Builder(zzv, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(zzbi.zzs.zza(null).longValue(), j10), zzw());
        }
    }
}
