package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmc {
    public static final zzgmc zza = new zzgma().zza();
    private final Map zzb;

    /* synthetic */ zzgmc(Map map, zzgmb zzgmb) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmc)) {
            return false;
        }
        return this.zzb.equals(((zzgmc) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
