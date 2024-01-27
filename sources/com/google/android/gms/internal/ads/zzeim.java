package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeim implements zzfzp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcv zzb;
    final /* synthetic */ zzfcr zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjt zze;
    final /* synthetic */ zzfde zzf;
    final /* synthetic */ zzeio zzg;

    zzeim(zzeio zzeio, long j10, zzfcv zzfcv, zzfcr zzfcr, String str, zzfjt zzfjt, zzfde zzfde) {
        this.zzg = zzeio;
        this.zza = j10;
        this.zzb = zzfcv;
        this.zzc = zzfcr;
        this.zzd = str;
        this.zze = zzfjt;
        this.zzf = zzfde;
    }

    public final void zza(Throwable th) {
        Integer num;
        zze zze2;
        zze zzb2;
        Throwable th2 = th;
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        int i10 = 6;
        zzeey zzeey = null;
        if (th2 instanceof TimeoutException) {
            num = null;
            i10 = 2;
        } else if (th2 instanceof zzehw) {
            num = null;
            i10 = 3;
        } else if (th2 instanceof CancellationException) {
            num = null;
            i10 = 4;
        } else if (th2 instanceof zzfds) {
            num = null;
            i10 = 5;
        } else {
            if (th2 instanceof zzdwm) {
                if (zzfeo.zza(th).zza == 3) {
                    i10 = 1;
                }
                if (((Boolean) zzba.zzc().zzb(zzbci.zzbA)).booleanValue() && (th2 instanceof zzeey) && (zzb2 = ((zzeey) th2).zzb()) != null) {
                    num = Integer.valueOf(zzb2.zza);
                }
            }
            num = null;
        }
        synchronized (this.zzg) {
            zzeio zzeio = this.zzg;
            if (zzeio.zze) {
                zzeip zzc2 = zzeio.zzb;
                zzfcv zzfcv = this.zzb;
                zzfcr zzfcr = this.zzc;
                if (th2 instanceof zzeey) {
                    zzeey = (zzeey) th2;
                }
                zzc2.zza(zzfcv, zzfcr, i10, zzeey, elapsedRealtime);
            }
            if (((Boolean) zzba.zzc().zzb(zzbci.zzie)).booleanValue()) {
                zzfjx zzd2 = this.zzg.zzc;
                zzfjt zzfjt = this.zze;
                zzfde zzfde = this.zzf;
                zzfcr zzfcr2 = this.zzc;
                zzd2.zzd(zzfjt.zzc(zzfde, zzfcr2, zzfcr2.zzp));
            }
            zzeio zzeio2 = this.zzg;
            if (!zzeio2.zzg) {
                LinkedHashMap zzh = zzeio2.zzd;
                zzfcr zzfcr3 = this.zzc;
                int i11 = i10;
                zzein zzein = r6;
                zzein zzein2 = new zzein(this.zzd, zzfcr3.zzah, i11, elapsedRealtime, num);
                zzh.put(zzfcr3, zzein);
                zze zza2 = zzfeo.zza(th);
                int i12 = zza2.zza;
                if ((i12 == 3 || i12 == 0) && (zze2 = zza2.zzd) != null && !zze2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    zza2 = zzfeo.zza(new zzeey(13, zza2.zzd));
                }
                this.zzg.zzf.zzf(this.zzc, elapsedRealtime, zza2);
            }
        }
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzeio zzeio = this.zzg;
            if (zzeio.zze) {
                zzeio.zzb.zza(this.zzb, this.zzc, 0, (zzeey) null, elapsedRealtime);
            }
            zzeio zzeio2 = this.zzg;
            if (!zzeio2.zzg) {
                if (zzeio2.zzq(this.zzc)) {
                    ((zzein) this.zzg.zzd.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    LinkedHashMap zzh = this.zzg.zzd;
                    zzfcr zzfcr = this.zzc;
                    zzh.put(zzfcr, new zzein(this.zzd, zzfcr.zzah, 0, elapsedRealtime, (Integer) null));
                }
                this.zzg.zzf.zzg(this.zzc, elapsedRealtime, (zze) null);
            }
        }
    }
}
