package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfcb implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzfcd zzd;
    final /* synthetic */ zzfce zze;

    zzfcb(zzfce zzfce, zzemz zzemz, zzfje zzfje, zzfit zzfit, zzfcd zzfcd) {
        this.zze = zzfce;
        this.zza = zzemz;
        this.zzb = zzfje;
        this.zzc = zzfit;
        this.zzd = zzfcd;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfje zzfje;
        zzdpc zzdpc = (zzdpc) this.zze.zze.zzd();
        if (zzdpc == null) {
            zze2 = zzfeo.zzb(th, (zzeez) null);
        } else {
            zze2 = zzdpc.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdpc != null) {
                zzdpc.zza().zzbF(zze2);
                this.zze.zzb.execute(new zzfbz(this, zze2));
            } else {
                this.zze.zzd.zzbF(zze2);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzh();
            }
            zzfei.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzg = this.zze.zzg;
                zzfit zzfit = this.zzc;
                zzfit.zza(zze2);
                zzfit.zzg(th);
                zzfit.zzf(false);
                zzg.zzb(zzfit.zzl());
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
        zzdox zzdox = (zzdox) obj;
        synchronized (this.zze) {
            zzdox.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdox);
            zzfce zzfce = this.zze;
            Executor zzh = zzfce.zzb;
            zzfbu zzf = zzfce.zzd;
            zzf.getClass();
            zzh.execute(new zzfca(zzf));
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zzg = this.zze.zzg;
                zzfit zzfit = this.zzc;
                zzfit.zzb(zzdox.zzp().zzb);
                zzfit.zzd(zzdox.zzl().zzg());
                zzfit.zzf(true);
                zzg.zzb(zzfit.zzl());
            } else {
                zzfje.zzf(zzdox.zzp().zzb);
                zzfje.zze(zzdox.zzl().zzg());
                zzfit zzfit2 = this.zzc;
                zzfit2.zzf(true);
                zzfje.zza(zzfit2);
                zzfje.zzg();
            }
        }
    }
}
