package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeje implements zzefa {
    private final Context zza;
    private final zzdpc zzb;

    public zzeje(Context context, zzdpc zzdpc) {
        this.zza = context;
        this.zzb = zzdpc;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzegz zzegz = new zzegz(zzfcr, (zzbqv) zzeex.zzb, AdFormat.REWARDED);
        zzdoy zze = this.zzb.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdoz(zzegz));
        zzegz.zzb(zze.zzc());
        ((zzegq) zzeex.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzbqv) zzeex.zzb).zzq(zzfcr.zzab);
            if (zzfde.zza.zza.zzo.zza == 3) {
                ((zzbqv) zzeex.zzb).zzo(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejd(this, zzeex, (zzejc) null), (zzbpd) zzeex.zzc);
            } else {
                ((zzbqv) zzeex.zzb).zzp(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejd(this, zzeex, (zzejc) null), (zzbpd) zzeex.zzc);
            }
        } catch (RemoteException e10) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
