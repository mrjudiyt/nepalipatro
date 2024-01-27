package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbnb implements zzcbp {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ zzbnm zzc;

    zzbnb(zzbnm zzbnm, zzbnl zzbnl, zzfit zzfit) {
        this.zzc = zzbnm;
        this.zza = zzbnl;
        this.zzb = zzfit;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmh zzbmh = (zzbmh) obj;
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbnm zzbnm = this.zzc;
            if (!(zzbnm.zzh == null || this.zza == zzbnm.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
                zzbnm zzbnm2 = this.zzc;
                if (zzbnm2.zze != null) {
                    zzfjh zze = zzbnm2.zze;
                    zzfit zzfit = this.zzb;
                    zzfit.zzf(true);
                    zze.zzb(zzfit.zzl());
                }
            }
        }
    }
}
