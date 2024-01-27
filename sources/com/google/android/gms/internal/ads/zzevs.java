package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzevs implements zzetw {
    private final zzcac zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgad zzd;
    private final zzawy zze;

    zzevs(String str, zzawy zzawy, zzcac zzcac, ScheduledExecutorService scheduledExecutorService, zzgad zzgad) {
        this.zzb = str;
        this.zze = zzawy;
        this.zza = zzcac;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgad;
    }

    public final int zza() {
        return 43;
    }

    public final e zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcz)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzcE)).booleanValue()) {
                e zzn = zzfzt.zzn(zzfqa.zza(Tasks.forResult(null)), zzevq.zza, this.zzd);
                if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
                    zzn = zzfzt.zzo(zzn, ((Long) zzbdq.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzt.zze(zzn, Exception.class, new zzevr(this), this.zzd);
            }
        }
        return zzfzt.zzh(new zzevt((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevt zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevt((String) null, -1);
    }
}
