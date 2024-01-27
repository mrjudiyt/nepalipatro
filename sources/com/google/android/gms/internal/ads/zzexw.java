package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzexw implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzexy zzd;
    final /* synthetic */ zzexz zze;

    zzexw(zzexz zzexz, zzemz zzemz, zzfje zzfje, zzfit zzfit, zzexy zzexy) {
        this.zze = zzexz;
        this.zza = zzemz;
        this.zzb = zzfje;
        this.zzc = zzfit;
        this.zzd = zzexy;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.zzcws, java.lang.Object] */
    public final void zza(Throwable th) {
        zze zze2;
        zzfje zzfje;
        zzcqf zzcqf = (zzcqf) this.zze.zze.zzd();
        if (zzcqf == null) {
            zze2 = zzfeo.zzb(th, (zzeez) null);
        } else {
            zze2 = zzcqf.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcqf != null) {
                zzcqf.zzc().zzbF(zze2);
                if (((Boolean) zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
                    this.zze.zzc.execute(new zzexv(this, zze2));
                }
            } else {
                this.zze.zzd.zzbF(zze2);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfei.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzh = this.zze.zzh;
                zzfit zzfit = this.zzc;
                zzfit.zza(zze2);
                zzfit.zzg(th);
                zzfit.zzf(false);
                zzh.zzb(zzfit.zzl());
            } else {
                zzfje.zzc(zze2);
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
        zzcsx zzcsx = (zzcsx) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhV)).booleanValue()) {
                zzcsx.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcsx);
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzh = this.zze.zzh;
                zzfit zzfit = this.zzc;
                zzfit.zzb(zzcsx.zzp().zzb);
                zzfit.zzd(zzcsx.zzl().zzg());
                zzfit.zzf(true);
                zzh.zzb(zzfit.zzl());
            } else {
                zzfje.zzf(zzcsx.zzp().zzb);
                zzfje.zze(zzcsx.zzl().zzg());
                zzfit zzfit2 = this.zzc;
                zzfit2.zzf(true);
                zzfje.zza(zzfit2);
                zzfje.zzg();
            }
        }
    }
}
