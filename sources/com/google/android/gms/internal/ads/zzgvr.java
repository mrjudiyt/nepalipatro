package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvr {
    private static final zzgvr zza = new zzgvr();
    private final zzgwd zzb = new zzgvb();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzgvr() {
    }

    public static zzgvr zza() {
        return zza;
    }

    public final zzgwc zzb(Class cls) {
        zzguj.zzc(cls, "messageType");
        zzgwc zzgwc = (zzgwc) this.zzc.get(cls);
        if (zzgwc == null) {
            zzgwc = this.zzb.zza(cls);
            zzguj.zzc(cls, "messageType");
            zzgwc zzgwc2 = (zzgwc) this.zzc.putIfAbsent(cls, zzgwc);
            return zzgwc2 == null ? zzgwc : zzgwc2;
        }
    }
}
