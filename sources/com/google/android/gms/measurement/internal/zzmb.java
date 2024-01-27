package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzmb implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzmc zzc;

    zzmb(zzmc zzmc, long j10, long j11) {
        this.zzc = zzmc;
        this.zza = j10;
        this.zzb = j11;
    }

    public final void run() {
        this.zzc.zza.zzl().zzb((Runnable) new zzme(this));
    }
}
