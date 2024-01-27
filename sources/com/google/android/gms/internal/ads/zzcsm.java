package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsm implements zzcyz, zzauw {
    private final zzfcr zza;
    private final zzcyd zzb;
    private final zzczi zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcsm(zzfcr zzfcr, zzcyd zzcyd, zzczi zzczi) {
        this.zza = zzfcr;
        this.zzb = zzcyd;
        this.zzc = zzczi;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzbt(zzauv zzauv) {
        if (this.zza.zzf == 1 && zzauv.zzj) {
            zza();
        }
        if (zzauv.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzr() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
