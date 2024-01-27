package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class zzbet {
    static final AtomicBoolean zza = new AtomicBoolean();
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();

    static zzber zza() {
        return (zzber) zzb.get();
    }

    static zzbes zzb() {
        return (zzbes) zzc.get();
    }

    public static void zzc(zzber zzber) {
        zzb.set(zzber);
    }
}
