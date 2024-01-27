package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzenq implements zzetw {
    private final Clock zza;
    private final zzfdn zzb;

    zzenq(Clock clock, zzfdn zzfdn) {
        this.zza = clock;
        this.zzb = zzfdn;
    }

    public final int zza() {
        return 4;
    }

    public final e zzb() {
        return zzfzt.zzh(new zzenr(this.zzb, this.zza.currentTimeMillis()));
    }
}
