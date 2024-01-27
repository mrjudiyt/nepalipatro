package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgie {
    private static final zzgie zza = new zzgie();
    private static final zzgid zzb = new zzgid((zzgic) null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgie zza() {
        return zza;
    }

    public final zzgme zzb() {
        zzgme zzgme = (zzgme) this.zzc.get();
        return zzgme == null ? zzb : zzgme;
    }
}
