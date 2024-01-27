package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzezc implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzcrs zzd;
    final /* synthetic */ zzezd zze;

    zzezc(zzezd zzezd, zzemz zzemz, zzfje zzfje, zzfit zzfit, zzcrs zzcrs) {
        this.zze = zzezd;
        this.zza = zzemz;
        this.zzb = zzfje;
        this.zzc = zzfit;
        this.zzd = zzcrs;
    }

    public final void zza(Throwable th) {
        zzfje zzfje;
        zze zza2 = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbF(zza2);
            if (((Boolean) zzba.zzc().zzb(zzbci.zzhU)).booleanValue()) {
                this.zze.zzb.execute(new zzeza(this, zza2));
            }
            zzezd zzezd = this.zze;
            zzezd.zzh.zzd(zzezd.zzj.zzc());
            zzfei.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzj = this.zze.zzi;
                zzfit zzfit = this.zzc;
                zzfit.zza(zza2);
                zzfit.zzg(th);
                zzfit.zzf(false);
                zzj.zzb(zzfit.zzl());
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
        zzcqv zzcqv = (zzcqv) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcqv.zzc() != null) {
                ViewParent parent = zzcqv.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcqv.zzl() != null) {
                        str = zzcqv.zzl().zzg();
                    }
                    zzcat.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcqv.zzc());
                }
            }
            zzbca zzbca = zzbci.zzhU;
            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                zzdbq zzn = zzcqv.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcqv.zzc());
            this.zza.zzb(zzcqv);
            if (((Boolean) zzba.zzc().zzb(zzbca)).booleanValue()) {
                zzezd zzezd = this.zze;
                Executor zzk = zzezd.zzb;
                zzemk zzg = zzezd.zzd;
                zzg.getClass();
                zzk.execute(new zzezb(zzg));
            }
            this.zze.zzh.zzd(zzcqv.zza());
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzj = this.zze.zzi;
                zzfit zzfit = this.zzc;
                zzfit.zzb(zzcqv.zzp().zzb);
                zzfit.zzd(zzcqv.zzl().zzg());
                zzfit.zzf(true);
                zzj.zzb(zzfit.zzl());
            } else {
                zzfje.zzf(zzcqv.zzp().zzb);
                zzfje.zze(zzcqv.zzl().zzg());
                zzfit zzfit2 = this.zzc;
                zzfit2.zzf(true);
                zzfje.zza(zzfit2);
                zzfje.zzg();
            }
        }
    }
}
