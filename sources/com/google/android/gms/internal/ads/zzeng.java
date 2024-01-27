package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeng implements zzfzp {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfje zzb;
    final /* synthetic */ zzfit zzc;
    final /* synthetic */ zzdht zzd;
    final /* synthetic */ zzenh zze;

    zzeng(zzenh zzenh, zzemz zzemz, zzfje zzfje, zzfit zzfit, zzdht zzdht) {
        this.zze = zzenh;
        this.zza = zzemz;
        this.zzb = zzfje;
        this.zzc = zzfit;
        this.zzd = zzdht;
    }

    public final void zza(Throwable th) {
        zzfje zzfje;
        zze zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zzbF(zza2);
        this.zze.zzb.zzB().execute(new zzenf(this, zza2));
        zzfei.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
            zzenh zzenh = this.zze;
            zzfit zzfit = this.zzc;
            zzfjh zze2 = zzenh.zze;
            zzfit.zza(zza2);
            zzfit.zzg(th);
            zzfit.zzf(false);
            zze2.zzb(zzfit.zzl());
            return;
        }
        zzfje.zzc(zza2);
        zzfit zzfit2 = this.zzc;
        zzfit2.zzg(th);
        zzfit2.zzf(false);
        zzfje.zza(zzfit2);
        zzfje.zzg();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfje zzfje;
        zzcsx zzcsx = (zzcsx) obj;
        synchronized (this.zze) {
            zzcsx.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcsx);
            this.zze.zzb.zzB().execute(new zzene(this));
            if (!((Boolean) zzbdu.zzc.zze()).booleanValue() || (zzfje = this.zzb) == null) {
                zzfjh zze2 = this.zze.zze;
                zzfit zzfit = this.zzc;
                zzfit.zzb(zzcsx.zzp().zzb);
                zzfit.zzd(zzcsx.zzl().zzg());
                zzfit.zzf(true);
                zze2.zzb(zzfit.zzl());
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
