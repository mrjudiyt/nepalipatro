package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzmf {
    final /* synthetic */ zzlx zza;

    zzmf(zzlx zzlx) {
        this.zza = zzlx;
    }

    private final void zzb(long j10, boolean z10) {
        this.zza.zzt();
        if (this.zza.zzu.zzac()) {
            this.zza.zzk().zzk.zza(j10);
            this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.zza.zzm().zza("auto", "_sid", (Object) valueOf, j10);
            this.zza.zzk().zzl.zza(valueOf.longValue());
            this.zza.zzk().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zze().zza(zzbi.zzbj) && z10) {
                bundle.putLong("_aib", 1);
            }
            this.zza.zzm().zza("auto", "_s", j10, bundle);
            if (zznv.zza() && this.zza.zze().zza(zzbi.zzbm)) {
                String zza2 = this.zza.zzk().zzq.zza();
                if (!TextUtils.isEmpty(zza2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", zza2);
                    this.zza.zzm().zza("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zza.zzt();
        if (this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzj().zzp().zza("Detected application was in foreground");
                zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j10, boolean z10) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j10)) {
            this.zza.zzk().zzg.zza(true);
            if (zzps.zza() && this.zza.zze().zza(zzbi.zzbs)) {
                this.zza.zzg().zzag();
            }
        }
        this.zza.zzk().zzk.zza(j10);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j10, z10);
        }
    }
}
