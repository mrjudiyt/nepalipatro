package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzefn implements zzefa {
    private final Context zza;
    private final zzcqj zzb;

    zzefn(Context context, zzcqj zzcqj) {
        this.zza = context;
        this.zzb = zzcqj;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzegz zzegz = new zzegz(zzfcr, (zzbqv) zzeex.zzb, AdFormat.APP_OPEN_AD);
        zzcqg zza2 = this.zzb.zza(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdga(zzegz, (zzcgb) null), new zzcqh(zzfcr.zzac));
        zzegz.zzb(zza2.zzc());
        ((zzegq) zzeex.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzbqv) zzeex.zzb).zzq(zzfcr.zzab);
            ((zzbqv) zzeex.zzb).zzi(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefm(zzeex, (zzefl) null), (zzbpd) zzeex.zzc);
        } catch (RemoteException e10) {
            zze.zzb("Remote exception loading an app open RTB ad", e10);
            throw new zzfds(e10);
        }
    }
}
