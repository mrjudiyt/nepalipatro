package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcot implements zzfzp {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcou zzc;

    zzcot(zzcou zzcou, zzfjx zzfjx, String str) {
        this.zzc = zzcou;
        this.zza = zzfjx;
        this.zzb = str;
    }

    public final void zza(Throwable th) {
        this.zzc.zze.zza(new zzcor(this, th, this.zza, this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zze.zza(new zzcos(this.zza, (String) obj));
    }
}
