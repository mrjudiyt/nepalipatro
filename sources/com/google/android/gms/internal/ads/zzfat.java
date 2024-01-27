package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfat implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzdgx zzd;
    final /* synthetic */ zzfau zze;

    zzfat(zzfau zzfau, zzemz zzemz, zzfje zzfje, zzfit zzfit, zzdgx zzdgx) {
        this.zze = zzfau;
        this.zza = zzemz;
        this.zzb = zzfje;
        this.zzc = zzfit;
        this.zzd = zzdgx;
    }

    public final void zza(Throwable th) {
        zzfje zzfje;
        zze zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbF(zza2);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhW)).booleanValue()) {
                this.zze.zzb.execute(new zzfap(this, zza2));
                this.zze.zzb.execute(new zzfaq(this, zza2));
            }
            zzfei.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zze2 = this.zze.zzg;
                zzfit zzfit = this.zzc;
                zzfit.zza(zza2);
                zzfit.zzg(th);
                zzfit.zzf(false);
                zze2.zzb(zzfit.zzl());
            } else {
                zzfje.zzc(zza2);
                zzfit zzfit2 = this.zzc;
                zzfit2.zzg(th);
                zzfit2.zzf(false);
                zzfje.zza(zzfit2);
                zzfje.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfje zzfje;
        zzdfw zzdfw = (zzdfw) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            zzbca zzbca = zzbci.zzhW;
            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                zzdbq zzn = zzdfw.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdfw);
            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                this.zze.zzb.execute(new zzfar(this));
                this.zze.zzb.execute(new zzfas(this));
            }
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zze2 = this.zze.zzg;
                zzfit zzfit = this.zzc;
                zzfit.zzb(zzdfw.zzp().zzb);
                zzfit.zzd(zzdfw.zzl().zzg());
                zzfit.zzf(true);
                zze2.zzb(zzfit.zzl());
            } else {
                zzfje.zzf(zzdfw.zzp().zzb);
                zzfje.zze(zzdfw.zzl().zzg());
                zzfit zzfit2 = this.zzc;
                zzfit2.zzf(true);
                zzfje.zza(zzfit2);
                zzfje.zzg();
            }
        }
    }
}
