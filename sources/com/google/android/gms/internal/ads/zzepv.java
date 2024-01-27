package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzepv {
    public final e zza;
    private final long zzb;
    private final Clock zzc;

    public zzepv(e eVar, long j10, Clock clock) {
        this.zza = eVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
