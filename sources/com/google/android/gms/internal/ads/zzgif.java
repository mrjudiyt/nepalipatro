package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgif {
    private static final zzgif zza = new zzgif();
    private final AtomicReference zzb = new AtomicReference(new zzgjb(new zzgix((zzgiw) null), (zzgja) null));

    zzgif() {
    }

    public static zzgif zza() {
        return zza;
    }

    public final Class zzb(Class cls) {
        return ((zzgjb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgbe zzgbe, Class cls) {
        return ((zzgjb) this.zzb.get()).zzb(zzgbe, cls);
    }

    public final Object zzd(zzgcd zzgcd, Class cls) {
        return ((zzgjb) this.zzb.get()).zzc(zzgcd, cls);
    }

    public final synchronized void zze(zzgiu zzgiu) {
        zzgix zzgix = new zzgix((zzgjb) this.zzb.get(), (zzgiw) null);
        zzgix.zza(zzgiu);
        this.zzb.set(new zzgjb(zzgix, (zzgja) null));
    }

    public final synchronized void zzf(zzgce zzgce) {
        zzgix zzgix = new zzgix((zzgjb) this.zzb.get(), (zzgiw) null);
        zzgix.zzb(zzgce);
        this.zzb.set(new zzgjb(zzgix, (zzgja) null));
    }
}
