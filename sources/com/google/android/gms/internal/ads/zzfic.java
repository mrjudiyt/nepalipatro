package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfic implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;

    public zzfic(zzhbp zzhbp, zzhbp zzhbp2, zzhbp zzhbp3) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
        this.zzc = zzhbp3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzhaw zza2 = zzhbb.zza(this.zza);
        zzhaw zza3 = zzhbb.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzis)).booleanValue()) {
            obj = new zzfie((zzfib) zza2.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfib) zza3.zzb();
        }
        zzhbk.zzb(obj);
        return obj;
    }
}
