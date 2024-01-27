package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgfo extends zzgcl {
    private final zzgfn zza;

    private zzgfo(zzgfn zzgfn) {
        this.zza = zzgfn;
    }

    public static zzgfo zzb(zzgfn zzgfn) {
        return new zzgfo(zzgfn);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgfo) && ((zzgfo) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfo.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final zzgfn zza() {
        return this.zza;
    }
}
