package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehq implements zzefa {
    private final Context zza;
    private final zzdht zzb;
    private final Executor zzc;

    public zzehq(Context context, zzdht zzdht, Executor executor) {
        this.zza = context;
        this.zzb = zzdht;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfde zzfde, int i10) {
        return zzfde.zza.zza.zzg.contains(Integer.toString(i10));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzdjj zzdjj;
        zzbpi zzD = ((zzfej) zzeex.zzb).zzD();
        zzbpj zzE = ((zzfej) zzeex.zzb).zzE();
        zzbpm zzd = ((zzfej) zzeex.zzb).zzd();
        if (zzd != null && zzc(zzfde, 6)) {
            zzdjj = zzdjj.zzt(zzd);
        } else if (zzD != null && zzc(zzfde, 6)) {
            zzdjj = zzdjj.zzai(zzD);
        } else if (zzD != null && zzc(zzfde, 2)) {
            zzdjj = zzdjj.zzag(zzD);
        } else if (zzE != null && zzc(zzfde, 6)) {
            zzdjj = zzdjj.zzaj(zzE);
        } else if (zzE == null || !zzc(zzfde, 1)) {
            throw new zzeir(1, "No native ad mappers");
        } else {
            zzdjj = zzdjj.zzah(zzE);
        }
        zzfdn zzfdn = zzfde.zza.zza;
        if (zzfdn.zzg.contains(Integer.toString(zzdjj.zzc()))) {
            zzdjl zze = this.zzb.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdjv(zzdjj), new zzdlm(zzE, zzD, zzd));
            ((zzegq) zzeex.zzc).zzc(zze.zzj());
            zze.zzd().zzo(new zzcol((zzfej) zzeex.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeir(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzfdn zzfdn = zzfde.zza.zza;
        zzfdn zzfdn2 = zzfde.zza.zza;
        zzbfc zzbfc = zzfdn2.zzi;
        ((zzfej) zzeex.zzb).zzp(this.zza, zzfdn.zzd, zzfcr.zzx.toString(), zzbw.zzl(zzfcr.zzu), (zzbpd) zzeex.zzc, zzbfc, zzfdn2.zzg);
    }
}
