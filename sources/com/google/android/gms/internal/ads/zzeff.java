package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeff implements zzeeu {
    private final zzcqj zza;
    private final Context zzb;
    private final zzdpt zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzcaz zzf;
    private final zzbjl zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbci.zziE)).booleanValue();
    private final zzedz zzi;

    public zzeff(zzcqj zzcqj, Context context, Executor executor, zzdpt zzdpt, zzfdn zzfdn, zzcaz zzcaz, zzbjl zzbjl, zzedz zzedz) {
        this.zzb = context;
        this.zza = zzcqj;
        this.zze = executor;
        this.zzc = zzdpt;
        this.zzd = zzfdn;
        this.zzf = zzcaz;
        this.zzg = zzbjl;
        this.zzi = zzedz;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzdpx zzdpx = new zzdpx();
        e zzn = zzfzt.zzn(zzfzt.zzh((Object) null), new zzefb(this, zzfcr, zzfde, zzdpx), this.zze);
        zzn.addListener(new zzefc(zzdpx), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfde zzfde, zzfcr zzfcr) {
        zzfcx zzfcx = zzfcr.zzu;
        return (zzfcx == null || zzfcx.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e zzc(zzfcr zzfcr, zzfde zzfde, zzdpx zzdpx, Object obj) {
        zzfcr zzfcr2 = zzfcr;
        zzfde zzfde2 = zzfde;
        zzcgb zza2 = this.zzc.zza(this.zzd.zze, zzfcr2, zzfde2.zzb.zzb);
        zza2.zzZ(zzfcr2.zzY);
        zzdpx.zza(this.zzb, (View) zza2);
        zzcbl zzcbl = new zzcbl();
        zzctm zzctm = new zzctm(zzfde2, zzfcr2, (String) null);
        zzefh zzefh = r1;
        zzefh zzefh2 = new zzefh(this.zzf, zzcbl, zzfcr, zza2, this.zzd, this.zzh, this.zzg, this.zzi);
        zzcqg zza3 = this.zza.zza(zzctm, new zzdga(zzefh, zza2), new zzcqh(zzfcr2.zzac));
        zza3.zzh().zzi(zza2, false, this.zzh ? this.zzg : null);
        zzcbl.zzc(zza3);
        zza3.zzc().zzo(new zzefd(zza2), zzcbg.zzf);
        zza3.zzh();
        zzfcx zzfcx = zzfcr2.zzu;
        return zzfzt.zzm(zzdps.zzj(zza2, zzfcx.zzb, zzfcx.zza), new zzefe(this, zza2, zzfcr2, zza3), this.zze);
    }
}
