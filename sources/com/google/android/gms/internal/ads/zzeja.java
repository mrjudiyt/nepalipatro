package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeja implements zzefa {
    private final Context zza;
    private final Executor zzb;
    private final zzdpc zzc;

    public zzeja(Context context, Executor executor, zzdpc zzdpc) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdpc;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzdoy zze = this.zzc.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdoz(new zzeiz(zzeex)));
        zze.zzd().zzo(new zzcol((zzfej) zzeex.zzb), this.zzb);
        ((zzegq) zzeex.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            zzfdn zzfdn = zzfde.zza.zza;
            if (zzfdn.zzo.zza == 3) {
                ((zzfej) zzeex.zzb).zzr(this.zza, zzfdn.zzd, zzfcr.zzx.toString(), (zzbpd) zzeex.zzc);
            } else {
                ((zzfej) zzeex.zzb).zzq(this.zza, zzfdn.zzd, zzfcr.zzx.toString(), (zzbpd) zzeex.zzc);
            }
        } catch (Exception e10) {
            zzcat.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeex.zza)), e10);
        }
    }
}
