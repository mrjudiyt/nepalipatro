package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzegn implements zzfzp {
    final /* synthetic */ zzego zza;

    zzegn(zzego zzego) {
        this.zza = zzego;
    }

    public final void zza(Throwable th) {
        zze zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzbF(zza2);
        zzfei.zzb(zza2.zza, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcqv) obj).zzj();
    }
}
