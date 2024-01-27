package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcsz implements zzcta {
    private final Map zza;

    zzcsz(Map map) {
        this.zza = map;
    }

    public final zzeeu zza(int i10, String str) {
        return (zzeeu) this.zza.get(str);
    }
}
