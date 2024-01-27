package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzepw implements zzetw {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetw zzc;
    private final long zzd;

    public zzepw(zzetw zzetw, long j10, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetw;
        this.zzd = j10;
    }

    public final int zza() {
        return 16;
    }

    public final e zzb() {
        zzepv zzepv = (zzepv) this.zza.get();
        if (zzepv == null || zzepv.zza()) {
            zzetw zzetw = this.zzc;
            zzepv zzepv2 = new zzepv(zzetw.zzb(), this.zzd, this.zzb);
            this.zza.set(zzepv2);
            zzepv = zzepv2;
        }
        return zzepv.zza;
    }
}
