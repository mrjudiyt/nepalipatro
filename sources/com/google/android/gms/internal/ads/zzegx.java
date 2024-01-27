package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzegx implements zzeeu {
    private final Context zza;
    private final zzdpt zzb;
    private final zzdgx zzc;
    private final zzfdn zzd;
    private final Executor zze;
    private final zzcaz zzf;
    private final zzbjl zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbci.zziE)).booleanValue();
    private final zzedz zzi;

    public zzegx(Context context, zzcaz zzcaz, zzfdn zzfdn, Executor executor, zzdgx zzdgx, zzdpt zzdpt, zzbjl zzbjl, zzedz zzedz) {
        this.zza = context;
        this.zzd = zzfdn;
        this.zzc = zzdgx;
        this.zze = executor;
        this.zzf = zzcaz;
        this.zzb = zzdpt;
        this.zzg = zzbjl;
        this.zzi = zzedz;
    }

    public final e zza(zzfde zzfde, zzfcr zzfcr) {
        zzdpx zzdpx = new zzdpx();
        e zzn = zzfzt.zzn(zzfzt.zzh((Object) null), new zzegu(this, zzfcr, zzfde, zzdpx), this.zze);
        zzn.addListener(new zzegv(zzdpx), this.zze);
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
        zzcgb zza2 = this.zzb.zza(this.zzd.zze, zzfcr2, zzfde2.zzb.zzb);
        zza2.zzZ(zzfcr2.zzY);
        zzdpx.zza(this.zza, (View) zza2);
        zzcbl zzcbl = new zzcbl();
        zzctm zzctm = new zzctm(zzfde2, zzfcr2, (String) null);
        zzfdn zzfdn = this.zzd;
        boolean z10 = this.zzh;
        zzegw zzegw = r1;
        zzegw zzegw2 = new zzegw(this.zza, this.zzf, zzcbl, zzfcr, zza2, zzfdn, z10, this.zzg, this.zzi);
        zzdfx zze2 = this.zzc.zze(zzctm, new zzdga(zzegw, zza2));
        zzcbl.zzc(zze2);
        zze2.zzc().zzo(new zzegs(zza2), zzcbg.zzf);
        zze2.zzk().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzk();
        zzfcr zzfcr3 = zzfcr;
        zzfcx zzfcx = zzfcr3.zzu;
        return zzfzt.zzm(zzdps.zzj(zza2, zzfcx.zzb, zzfcx.zza), new zzegt(this, zza2, zzfcr3, zze2), this.zze);
    }
}
