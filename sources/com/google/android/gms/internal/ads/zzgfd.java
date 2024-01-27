package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgfd extends zzgcl {
    private final int zza;
    private final zzgfb zzb;

    /* synthetic */ zzgfd(int i10, zzgfb zzgfb, zzgfc zzgfc) {
        this.zza = i10;
        this.zzb = zzgfb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfd)) {
            return false;
        }
        zzgfd zzgfd = (zzgfd) obj;
        return zzgfd.zza == this.zza && zzgfd.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfd.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgfb zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgfb.zzc;
    }
}
