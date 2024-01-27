package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdup implements zzfzp {
    final /* synthetic */ zzdur zza;

    zzdup(zzdur zzdur) {
        this.zza = zzdur;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.zzB().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new zzduo(this, str));
        }
    }
}
