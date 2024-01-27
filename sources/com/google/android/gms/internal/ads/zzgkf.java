package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgkf extends zzglg {
    private final int zza;
    private final int zzb;
    private final zzgkd zzc;

    /* synthetic */ zzgkf(int i10, int i11, zzgkd zzgkd, zzgke zzgke) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgkd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkf)) {
            return false;
        }
        zzgkf zzgkf = (zzgkf) obj;
        if (zzgkf.zza == this.zza && zzgkf.zzc() == zzc() && zzgkf.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgkf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgkd zzgkd = this.zzc;
        if (zzgkd == zzgkd.zzd) {
            return this.zzb;
        }
        if (zzgkd == zzgkd.zza || zzgkd == zzgkd.zzb || zzgkd == zzgkd.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgkd zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc != zzgkd.zzd;
    }
}
