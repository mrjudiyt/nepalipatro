package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgec {
    private zzgem zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    private zzgec() {
    }

    /* synthetic */ zzgec(zzgeb zzgeb) {
    }

    public final zzgec zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgec zzb(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzgec zzc(zzgem zzgem) {
        this.zza = zzgem;
        return this;
    }

    public final zzgee zzd() {
        zzgry zzgry;
        zzgrx zzb2;
        zzgem zzgem = this.zza;
        if (zzgem == null || (zzgry = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgem.zza() != zzgry.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgem.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzc() || this.zzc == null) {
            if (this.zza.zzb() == zzgek.zzc) {
                zzb2 = zzgrx.zzb(new byte[0]);
            } else if (this.zza.zzb() == zzgek.zzb) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzb() == zzgek.zza) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
            }
            return new zzgee(this.zza, this.zzb, zzb2, this.zzc, (zzged) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
