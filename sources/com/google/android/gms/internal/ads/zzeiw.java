package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeiw {
    private zzeio zza;

    zzeiw() {
    }

    private zzeiw(zzeio zzeio) {
        this.zza = zzeio;
    }

    public static zzeiw zzb(zzeio zzeio) {
        return new zzeiw(zzeio);
    }

    public final zzeio zza(Clock clock, zzeip zzeip, zzeez zzeez, zzfjx zzfjx) {
        zzeio zzeio = this.zza;
        return zzeio != null ? zzeio : new zzeio(clock, zzeip, zzeez, zzfjx);
    }
}
