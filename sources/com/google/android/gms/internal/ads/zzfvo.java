package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfvo extends zzfum implements Serializable {
    final Object zza;
    final Object zzb;

    zzfvo(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    public final Object getKey() {
        return this.zza;
    }

    public final Object getValue() {
        return this.zzb;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
