package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepa implements zzetw {
    final zzcac zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgad zzd;
    private final Context zze;

    zzepa(Context context, zzcac zzcac, ScheduledExecutorService scheduledExecutorService, zzgad zzgad) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzcD)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcac;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgad;
    }

    public final int zza() {
        return 11;
    }

    public final e zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzba.zzc().zzb(zzbci.zzcz)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zzb(zzbci.zzcE)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbci.zzcA)).booleanValue()) {
                    return zzfzt.zzm(zzfqa.zza(this.zzb.getAppSetIdInfo()), zzeox.zza, zzcbg.zzf);
                }
                if (((Boolean) zzba.zzc().zzb(zzbci.zzcD)).booleanValue()) {
                    task = zzfer.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzfzt.zzh(new zzepb((String) null, -1));
                }
                e zzn = zzfzt.zzn(zzfqa.zza(task), zzeoy.zza, zzcbg.zzf);
                if (((Boolean) zzba.zzc().zzb(zzbci.zzcB)).booleanValue()) {
                    zzn = zzfzt.zzo(zzn, ((Long) zzba.zzc().zzb(zzbci.zzcC)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfzt.zze(zzn, Exception.class, new zzeoz(this), this.zzd);
            }
        }
        return zzfzt.zzh(new zzepb((String) null, -1));
    }
}
