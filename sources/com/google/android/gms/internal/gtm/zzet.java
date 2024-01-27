package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v10, V v11, zzes<V> zzes) {
        this.zzb = v10;
        this.zzc = v11;
        this.zza = zzes;
    }

    static <T> zzet<T> zza(T t10, T t11, zzes<T> zzes) {
        return new zzet<>(t10, t11, zzes);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
