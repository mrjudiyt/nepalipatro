package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehb implements zzefa {
    private final Context zza;
    private final zzdgx zzb;
    private final zzcaz zzc;
    private final Executor zzd;

    public zzehb(Context context, zzcaz zzcaz, zzdgx zzdgx, Executor executor) {
        this.zza = context;
        this.zzc = zzcaz;
        this.zzb = zzdgx;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzdfx zze = this.zzb.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdga(new zzeha(this, zzeex), (zzcgb) null));
        zze.zzd().zzo(new zzcol((zzfej) zzeex.zzb), this.zzd);
        ((zzegq) zzeex.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzfdn zzfdn = zzfde.zza.zza;
        ((zzfej) zzeex.zzb).zzo(this.zza, zzfdn.zzd, zzfcr.zzx.toString(), zzbw.zzl(zzfcr.zzu), (zzbpd) zzeex.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzeex zzeex, boolean z10, Context context, zzcxy zzcxy) {
        try {
            ((zzfej) zzeex.zzb).zzv(z10);
            if (this.zzc.zzc < ((Integer) zzba.zzc().zzb(zzbci.zzaG)).intValue()) {
                ((zzfej) zzeex.zzb).zzx();
            } else {
                ((zzfej) zzeex.zzb).zzy(context);
            }
        } catch (zzfds e10) {
            zzcat.zzi("Cannot show interstitial.");
            throw new zzdhe(e10.getCause());
        }
    }
}
