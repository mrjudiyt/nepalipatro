package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeqi implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzeqi(zzhbp zzhbp, zzhbp zzhbp2) {
        this.zza = zzhbp;
        this.zzb = zzhbp2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvx zzfvx;
        zzepy zza2 = zzeqa.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) zzba.zzc().zzb(zzbci.zzdR)).booleanValue()) {
            zzfvx = zzfvx.zzn(new zzese(zza2, (long) ((Integer) zzba.zzc().zzb(zzbci.zzdS)).intValue(), scheduledExecutorService));
        } else {
            zzfvx = zzfvx.zzm();
        }
        zzhbk.zzb(zzfvx);
        return zzfvx;
    }
}
