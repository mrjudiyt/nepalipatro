package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzctl {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final e zzc;
    private volatile boolean zzd = true;

    public zzctl(Executor executor, ScheduledExecutorService scheduledExecutorService, e eVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = eVar;
    }

    static /* bridge */ /* synthetic */ void zzb(zzctl zzctl, List list, zzfzp zzfzp) {
        if (list == null || list.isEmpty()) {
            zzctl.zza.execute(new zzctg(zzfzp));
            return;
        }
        e zzh = zzfzt.zzh((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzh = zzfzt.zzn(zzfzt.zzf(zzh, Throwable.class, new zzcth(zzfzp), zzctl.zza), new zzcti(zzctl, zzfzp, (e) it.next()), zzctl.zza);
        }
        zzfzt.zzr(zzh, new zzctk(zzctl, zzfzp), zzctl.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zza(zzfzp zzfzp, e eVar, zzcsx zzcsx) {
        if (zzcsx != null) {
            zzfzp.zzb(zzcsx);
        }
        return zzfzt.zzo(eVar, ((Long) zzbeo.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfzp zzfzp) {
        zzfzt.zzr(this.zzc, new zzctj(this, zzfzp), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
