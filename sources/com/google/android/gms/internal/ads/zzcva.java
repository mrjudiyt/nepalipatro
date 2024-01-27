package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcva implements zzdcw, zzcyz {
    private final Clock zza;
    private final zzcvc zzb;
    private final zzfdn zzc;
    private final String zzd;

    zzcva(Clock clock, zzcvc zzcvc, zzfdn zzfdn, String str) {
        this.zza = clock;
        this.zzb = zzcvc;
        this.zzc = zzfdn;
        this.zzd = str;
    }

    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    public final void zzr() {
        zzfdn zzfdn = this.zzc;
        this.zzb.zzd(zzfdn.zzf, this.zzd, this.zza.elapsedRealtime());
    }
}
