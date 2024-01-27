package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzctk implements zzfzp {
    final /* synthetic */ zzfzp zza;
    final /* synthetic */ zzctl zzb;

    zzctk(zzctl zzctl, zzfzp zzfzp) {
        this.zzb = zzctl;
        this.zza = zzfzp;
    }

    public final void zza(Throwable th) {
        zzcbg.zze.execute(new zzctf(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbg.zze.execute(new zzctf(this.zzb));
        this.zza.zzb((zzcsx) obj);
    }
}
