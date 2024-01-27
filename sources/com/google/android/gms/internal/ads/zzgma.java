package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgma {
    private HashMap zza = new HashMap();

    public final zzgmc zza() {
        if (this.zza != null) {
            zzgmc zzgmc = new zzgmc(Collections.unmodifiableMap(this.zza), (zzgmb) null);
            this.zza = null;
            return zzgmc;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
