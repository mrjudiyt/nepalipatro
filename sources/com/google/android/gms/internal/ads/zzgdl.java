package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgdl {
    private zzgdv zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    private zzgdl() {
    }

    /* synthetic */ zzgdl(zzgdk zzgdk) {
    }

    public final zzgdl zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgdl zzb(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzgdl zzc(zzgdv zzgdv) {
        this.zza = zzgdv;
        return this;
    }

    public final zzgdn zzd() {
        zzgry zzgry;
        zzgrx zzb2;
        zzgdv zzgdv = this.zza;
        if (zzgdv == null || (zzgry = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgdv.zzb() != zzgry.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgdv.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zzd() || this.zzc == null) {
            if (this.zza.zzc() == zzgdt.zzc) {
                zzb2 = zzgrx.zzb(new byte[0]);
            } else if (this.zza.zzc() == zzgdt.zzb) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzc() == zzgdt.zza) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
            }
            return new zzgdn(this.zza, this.zzb, zzb2, this.zzc, (zzgdm) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
