package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehf implements zzefa {
    private final Context zza;
    private final zzdgx zzb;

    public zzehf(Context context, zzdgx zzdgx) {
        this.zza = context;
        this.zzb = zzdgx;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzegz zzegz = new zzegz(zzfcr, (zzbqv) zzeex.zzb, AdFormat.INTERSTITIAL);
        zzdfx zze = this.zzb.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdga(zzegz, (zzcgb) null));
        zzegz.zzb(zze.zzc());
        ((zzegq) zzeex.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzbqv) zzeex.zzb).zzq(zzfcr.zzab);
            ((zzbqv) zzeex.zzb).zzl(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehe(this, zzeex, (zzehd) null), (zzbpd) zzeex.zzc);
        } catch (RemoteException e10) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfds(e10);
        }
    }
}
