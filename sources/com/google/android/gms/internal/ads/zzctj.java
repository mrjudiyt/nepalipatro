package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzctj implements zzfzp {
    final /* synthetic */ zzfzp zza;
    final /* synthetic */ zzctl zzb;

    zzctj(zzctl zzctl, zzfzp zzfzp) {
        this.zzb = zzctl;
        this.zza = zzfzp;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcbg.zze.execute(new zzctf(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctl.zzb(this.zzb, ((zzcte) obj).zza, this.zza);
    }
}
