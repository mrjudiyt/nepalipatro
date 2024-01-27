package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgkz {
    private Integer zza;
    private Integer zzb;
    private zzgla zzc;
    private zzglb zzd;

    private zzgkz() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgkz(zzgky zzgky) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzglb.zzd;
    }

    public final zzgkz zza(zzgla zzgla) {
        this.zzc = zzgla;
        return this;
    }

    public final zzgkz zzb(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgkz zzc(int i10) {
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgkz zzd(zzglb zzglb) {
        this.zzd = zzglb;
        return this;
    }

    public final zzgld zze() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.zzb.intValue();
            zzgla zzgla = this.zzc;
            if (intValue >= 10) {
                if (zzgla == zzgla.zza) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgla == zzgla.zzb) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgla == zzgla.zzc) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgla == zzgla.zzd) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgla != zzgla.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new zzgld(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, (zzglc) null);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.zza}));
        }
    }
}
