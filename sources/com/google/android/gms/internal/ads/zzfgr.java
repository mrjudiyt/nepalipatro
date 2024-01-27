package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfgr implements zzhbc {
    private final zzhbp zza;

    public zzfgr(zzhbp zzhbp) {
        this.zza = zzhbp;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfpr.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzhbk.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
