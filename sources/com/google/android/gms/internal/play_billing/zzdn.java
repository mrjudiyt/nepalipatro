package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class zzdn {
    private static final zzdn zza = new zzdn();
    private final zzdq zzb = new zzcx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzdn() {
    }

    public static zzdn zza() {
        return zza;
    }

    public final zzdp zzb(Class cls) {
        zzcg.zzc(cls, "messageType");
        zzdp zzdp = (zzdp) this.zzc.get(cls);
        if (zzdp == null) {
            zzdp = this.zzb.zza(cls);
            zzcg.zzc(cls, "messageType");
            zzdp zzdp2 = (zzdp) this.zzc.putIfAbsent(cls, zzdp);
            return zzdp2 == null ? zzdp : zzdp2;
        }
    }
}
