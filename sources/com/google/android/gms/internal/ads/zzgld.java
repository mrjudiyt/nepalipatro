package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgld extends zzglg {
    private final int zza;
    private final int zzb;
    private final zzglb zzc;
    private final zzgla zzd;

    /* synthetic */ zzgld(int i10, int i11, zzglb zzglb, zzgla zzgla, zzglc zzglc) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzglb;
        this.zzd = zzgla;
    }

    public static zzgkz zzd() {
        return new zzgkz((zzgky) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgld)) {
            return false;
        }
        zzgld zzgld = (zzgld) obj;
        if (zzgld.zza == this.zza && zzgld.zzc() == zzc() && zzgld.zzc == this.zzc && zzgld.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgld.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        zzgla zzgla = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgla);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzglb zzglb = this.zzc;
        if (zzglb == zzglb.zzd) {
            return this.zzb;
        }
        if (zzglb == zzglb.zza || zzglb == zzglb.zzb || zzglb == zzglb.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgla zze() {
        return this.zzd;
    }

    public final zzglb zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzc != zzglb.zzd;
    }
}
