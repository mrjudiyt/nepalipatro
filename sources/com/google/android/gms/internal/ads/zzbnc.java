package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbnc implements zzcbn {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ zzbnm zzc;

    zzbnc(zzbnm zzbnm, zzbnl zzbnl, zzfit zzfit) {
        this.zzc = zzbnm;
        this.zza = zzbnl;
        this.zzb = zzfit;
    }

    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdu.zzd.zze()).booleanValue()) {
                zzbnm zzbnm = this.zzc;
                if (zzbnm.zze != null) {
                    zzfjh zze = zzbnm.zze;
                    zzfit zzfit = this.zzb;
                    zzfit.zzc("Failed loading new engine");
                    zzfit.zzf(false);
                    zze.zzb(zzfit.zzl());
                }
            }
        }
    }
}
