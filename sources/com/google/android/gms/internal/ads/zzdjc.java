package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdjc implements zzfzp {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdje zzb;

    zzdjc(zzdje zzdje, String str, boolean z10) {
        this.zzb = zzdje;
    }

    public final void zza(Throwable th) {
        zzt.zzo().zzu(th, "omid native display exp");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzcgb) obj);
        zzdje zzdje = this.zzb;
        zzcbl zzp = zzdje.zze.zzp();
        zzfkc zzf = zzdje.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
