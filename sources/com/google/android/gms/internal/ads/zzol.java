package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzol {
    public static final zzol zza = (zzfk.zza < 31 ? new zzol() : new zzol(zzok.zza));
    private final zzok zzb;

    public zzol() {
        zzdx.zzf(zzfk.zza < 31);
        this.zzb = null;
    }

    private zzol(zzok zzok) {
        this.zzb = zzok;
    }

    public final LogSessionId zza() {
        zzok zzok = this.zzb;
        Objects.requireNonNull(zzok);
        return zzok.zzb;
    }

    public zzol(LogSessionId logSessionId) {
        this.zzb = new zzok(logSessionId);
    }
}
