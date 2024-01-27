package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzefj implements zzefa {
    private final Context zza;
    private final zzcqj zzb;
    private final Executor zzc;

    zzefj(Context context, zzcqj zzcqj, Executor executor) {
        this.zza = context;
        this.zzb = zzcqj;
        this.zzc = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzcqg zza2 = this.zzb.zza(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdga(new zzefi(zzeex), (zzcgb) null), new zzcqh(zzfcr.zzac));
        zza2.zzd().zzo(new zzcol((zzfej) zzeex.zzb), this.zzc);
        ((zzegq) zzeex.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzfdn zzfdn = zzfde.zza.zza;
        ((zzfej) zzeex.zzb).zzl(this.zza, zzfdn.zzd, zzfcr.zzx.toString(), (zzbpd) zzeex.zzc);
    }
}
