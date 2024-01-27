package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgdv extends zzgcl {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgdt zzd;

    /* synthetic */ zzgdv(int i10, int i11, int i12, zzgdt zzgdt, zzgdu zzgdu) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzgdt;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdv)) {
            return false;
        }
        zzgdv zzgdv = (zzgdv) obj;
        return zzgdv.zza == this.zza && zzgdv.zzb == this.zzb && zzgdv.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesEax Parameters (variant: " + valueOf + ", " + this.zzb + "-byte IV, " + 16 + "-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgdt zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zzd != zzgdt.zzc;
    }
}
