package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzegw implements zzdhf {
    private final Context zza;
    private final zzcaz zzb;
    private final e zzc;
    private final zzfcr zzd;
    private final zzcgb zze;
    private final zzfdn zzf;
    private final zzbjl zzg;
    private final boolean zzh;
    private final zzedz zzi;

    zzegw(Context context, zzcaz zzcaz, e eVar, zzfcr zzfcr, zzcgb zzcgb, zzfdn zzfdn, boolean z10, zzbjl zzbjl, zzedz zzedz) {
        this.zza = context;
        this.zzb = zzcaz;
        this.zzc = eVar;
        this.zzd = zzfcr;
        this.zze = zzcgb;
        this.zzf = zzfdn;
        this.zzg = zzbjl;
        this.zzh = z10;
        this.zzi = zzedz;
    }

    public final void zza(boolean z10, Context context, zzcxy zzcxy) {
        zzdfx zzdfx = (zzdfx) zzfzt.zzq(this.zzc);
        this.zze.zzan(true);
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        zzt.zzp();
        zzj zzj = new zzj(zze2, com.google.android.gms.ads.internal.util.zzt.zzH(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z10, this.zzd.zzQ, false);
        if (zzcxy != null) {
            zzcxy.zzf();
        }
        zzt.zzi();
        zzdgu zzh2 = zzdfx.zzh();
        zzcgb zzcgb = this.zze;
        zzfcr zzfcr = this.zzd;
        zzcaz zzcaz = this.zzb;
        int i10 = zzfcr.zzS;
        String str = zzfcr.zzD;
        zzfcx zzfcx = zzfcr.zzu;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzh2, (zzz) null, zzcgb, i10, zzcaz, str, zzj, zzfcx.zzb, zzfcx.zza, this.zzf.zzf, zzcxy, (zzbso) zzfcr.zzak ? this.zzi : null);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
