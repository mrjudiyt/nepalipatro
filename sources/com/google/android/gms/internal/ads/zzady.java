package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzady {
    protected final zzacs zza;

    protected zzady(zzacs zzacs) {
        this.zza = zzacs;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzfb zzfb);

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzfb zzfb, long j10);

    public final boolean zzf(zzfb zzfb, long j10) {
        return zza(zzfb) && zzb(zzfb, j10);
    }
}
