package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgjt {
    private zzgkf zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    private zzgjt() {
    }

    /* synthetic */ zzgjt(zzgjs zzgjs) {
    }

    public final zzgjt zza(zzgry zzgry) {
        this.zzb = zzgry;
        return this;
    }

    public final zzgjt zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjt zzc(zzgkf zzgkf) {
        this.zza = zzgkf;
        return this;
    }

    public final zzgjv zzd() {
        zzgry zzgry;
        zzgrx zzb2;
        zzgkf zzgkf = this.zza;
        if (zzgkf == null || (zzgry = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgkf.zzb() != zzgry.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgkf.zze() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zze() || this.zzc == null) {
            if (this.zza.zzd() == zzgkd.zzd) {
                zzb2 = zzgrx.zzb(new byte[0]);
            } else if (this.zza.zzd() == zzgkd.zzc || this.zza.zzd() == zzgkd.zzb) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else if (this.zza.zzd() == zzgkd.zza) {
                zzb2 = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            return new zzgjv(this.zza, this.zzb, zzb2, this.zzc, (zzgju) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
