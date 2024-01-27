package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzghi {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzghi() {
    }

    public final zzghi zza(Enum enumR, Object obj) {
        this.zza.put(enumR, obj);
        this.zzb.put(obj, enumR);
        return this;
    }

    public final zzghk zzb() {
        return new zzghk(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), (zzghj) null);
    }

    /* synthetic */ zzghi(zzghh zzghh) {
    }
}
