package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzejw implements zzefa {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdpc zzc;

    public zzejw(Context context, Executor executor, zzdpc zzdpc) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdpc;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        try {
            ((zzfej) zzeex.zzb).zzk(zzfde.zza.zza.zzd, zzfcr.zzx.toString());
        } catch (Exception e10) {
            zzcat.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeex.zza)), e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        zzdoy zze = this.zzc.zze(new zzctm(zzfde, zzfcr, zzeex.zza), new zzdoz(new zzejs(zzeex)));
        zze.zzd().zzo(new zzcol((zzfej) zzeex.zzb), this.zzb);
        zzcys zze2 = zze.zze();
        zzcxj zzb2 = zze.zzb();
        ((zzegr) zzeex.zzc).zzc(new zzejv(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzk();
    }

    public final void zzb(zzfde zzfde, zzfcr zzfcr, zzeex zzeex) {
        if (!((zzfej) zzeex.zzb).zzC()) {
            ((zzegr) zzeex.zzc).zzd(new zzeju(this, zzfde, zzfcr, zzeex));
            Object obj = zzeex.zzb;
            Context context = this.zza;
            zzfdn zzfdn = zzfde.zza.zza;
            String jSONObject = zzfcr.zzx.toString();
            ((zzfej) obj).zzh(context, zzfdn.zzd, (String) null, (zzbwh) zzeex.zzc, jSONObject);
            return;
        }
        zze(zzfde, zzfcr, zzeex);
    }
}
