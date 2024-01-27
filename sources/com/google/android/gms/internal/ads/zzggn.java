package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzggn extends zzgcl {
    private final zzggm zza;

    private zzggn(zzggm zzggm) {
        this.zza = zzggm;
    }

    public static zzggn zzb(zzggm zzggm) {
        return new zzggn(zzggm);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzggn) && ((zzggn) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzggn.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final zzggm zza() {
        return this.zza;
    }
}
