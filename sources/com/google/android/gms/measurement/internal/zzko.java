package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzko implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzkh zzb;

    zzko(zzkh zzkh, long j10) {
        this.zzb = zzkh;
        this.zza = j10;
    }

    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}
