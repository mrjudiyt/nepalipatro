package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzfl implements zzcz {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfn zzb;

    zzfl(zzfn zzfn, Runnable runnable) {
        this.zzb = zzfn;
        this.zza = runnable;
    }

    public final void zza(Throwable th) {
        this.zzb.zzb.post(this.zza);
    }
}
