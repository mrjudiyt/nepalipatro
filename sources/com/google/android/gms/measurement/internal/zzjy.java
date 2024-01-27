package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzjy implements Runnable {
    private final /* synthetic */ zzih zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzih zzd;
    private final /* synthetic */ zziq zze;

    zzjy(zziq zziq, zzih zzih, long j10, boolean z10, zzih zzih2) {
        this.zze = zziq;
        this.zza = zzih;
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = zzih2;
    }

    public final void run() {
        this.zze.zza(this.zza);
        zziq.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        if (zzps.zza() && this.zze.zze().zza(zzbi.zzbs)) {
            zziq.zza(this.zze, this.zza, this.zzd);
        }
    }
}
