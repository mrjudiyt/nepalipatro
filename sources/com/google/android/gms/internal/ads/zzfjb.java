package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfjb implements zzfzp {
    final /* synthetic */ zzfje zza;
    final /* synthetic */ zzfit zzb;
    final /* synthetic */ boolean zzc;

    zzfjb(zzfje zzfje, zzfit zzfit, boolean z10) {
        this.zza = zzfje;
        this.zzb = zzfit;
        this.zzc = z10;
    }

    public final void zza(Throwable th) {
        zzfit zzfit = this.zzb;
        if (zzfit.zzj()) {
            zzfje zzfje = this.zza;
            zzfit.zzg(th);
            zzfit.zzf(false);
            zzfje.zza(zzfit);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfit zzfit = this.zzb;
        zzfit.zzf(true);
        this.zza.zza(zzfit);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
