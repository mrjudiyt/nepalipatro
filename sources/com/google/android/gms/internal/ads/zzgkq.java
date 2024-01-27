package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgkq {
    private zzgld zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    private zzgkq() {
    }

    /* synthetic */ zzgkq(zzgkp zzgkp) {
    }

    public final zzgkq zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgkq zzb(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzgkq zzc(zzgld zzgld) {
        this.zza = zzgld;
        return this;
    }

    public final zzgks zzd() {
        zzgry zzgry;
        zzgrx zzb2;
        zzgld zzgld = this.zza;
        if (zzgld == null || (zzgry = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgld.zzb() != zzgry.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgld.zzg() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzg() || this.zzc == null) {
            if (this.zza.zzf() == zzglb.zzd) {
                zzb2 = zzgrx.zzb(new byte[0]);
            } else if (this.zza.zzf() == zzglb.zzc || this.zza.zzf() == zzglb.zzb) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzf() == zzglb.zza) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            return new zzgks(this.zza, this.zzb, zzb2, this.zzc, (zzgkr) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
