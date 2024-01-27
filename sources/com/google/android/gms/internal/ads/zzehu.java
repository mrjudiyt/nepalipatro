package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehu implements zzefa {
    private final Context zza;
    private final zzdht zzb;
    /* access modifiers changed from: private */
    public zzbpm zzc;
    private final zzcaz zzd;

    public zzehu(Context context, zzdht zzdht, zzcaz zzcaz) {
        this.zza = context;
        this.zzb = zzdht;
        this.zzd = zzcaz;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        if (zzfde.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdjj zzt = zzdjj.zzt(this.zzc);
            zzfdn zzfdn = zzfde.zza.zza;
            if (zzfdn.zzg.contains(Integer.toString(zzt.zzc()))) {
                zzdjl zze = this.zzb.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdjv(zzt), new zzdlm((zzbpj) null, (zzbpi) null, this.zzc));
                ((zzegq) zzeex.zzc).zzc(zze.zzi());
                return zze.zza();
            }
            throw new zzeir(1, "No corresponding native ad listener");
        }
        throw new zzeir(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzbqv) zzeex.zzb).zzq(zzfcr.zzab);
            if (this.zzd.zzc < ((Integer) zzba.zzc().zzb(zzbci.zzbF)).intValue()) {
                ((zzbqv) zzeex.zzb).zzm(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeht(this, zzeex, (zzehs) null), (zzbpd) zzeex.zzc);
            } else {
                ((zzbqv) zzeex.zzb).zzn(zzfcr.zzW, zzfcr.zzx.toString(), zzfde.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeht(this, zzeex, (zzehs) null), (zzbpd) zzeex.zzc, zzfde.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzfds(e10);
        }
    }
}
