package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public abstract class zzfss implements Serializable {
    zzfss() {
    }

    public static zzfss zzc() {
        return zzfsa.zza;
    }

    public static zzfss zzd(Object obj) {
        return obj == null ? zzfsa.zza : new zzftb(obj);
    }

    public abstract zzfss zza(zzfsk zzfsk);

    public abstract Object zzb(Object obj);
}
