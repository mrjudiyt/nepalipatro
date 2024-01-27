package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzduq extends zzblj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfit zzd;
    final /* synthetic */ zzcbl zze;
    final /* synthetic */ zzdur zzf;

    zzduq(zzdur zzdur, Object obj, String str, long j10, zzfit zzfit, zzcbl zzcbl) {
        this.zzf = zzdur;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfit;
        this.zze = zzcbl;
    }

    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfjh zze2 = this.zzf.zzp;
            zzfit zzfit = this.zzd;
            zzfit.zzc(str);
            zzfit.zzf(false);
            zze2.zzb(zzfit.zzl());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (zzt.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfjh zze2 = this.zzf.zzp;
            zzfit zzfit = this.zzd;
            zzfit.zzf(true);
            zze2.zzb(zzfit.zzl());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
