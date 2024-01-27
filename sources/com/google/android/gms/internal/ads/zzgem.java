package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgem extends zzgcl {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgek zzd;

    /* synthetic */ zzgem(int i10, int i11, int i12, zzgek zzgek, zzgel zzgel) {
        this.zza = i10;
        this.zzd = zzgek;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgem)) {
            return false;
        }
        zzgem zzgem = (zzgem) obj;
        return zzgem.zza == this.zza && zzgem.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgem.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgek zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgek.zzc;
    }
}
