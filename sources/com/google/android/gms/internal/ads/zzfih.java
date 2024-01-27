package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfih implements zzfib {
    private final zzfil zza;
    private final zzfij zzb;
    private final zzfhy zzc;

    public zzfih(zzfhy zzfhy, zzfil zzfil, zzfij zzfij) {
        this.zzc = zzfhy;
        this.zza = zzfil;
        this.zzb = zzfij;
    }

    public final String zza(zzfia zzfia) {
        zzfij zzfij = this.zzb;
        Map zzj = zzfia.zzj();
        zzfij.zza(zzj);
        return this.zza.zza(zzj);
    }

    public final void zzb(zzfia zzfia) {
        this.zzc.zzb(zza(zzfia));
    }
}
