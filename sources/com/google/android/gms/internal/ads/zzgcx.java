package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgcx {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Integer zzd;
    private zzgcy zze;
    private zzgcz zzf;

    private zzgcx() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        throw null;
    }

    /* synthetic */ zzgcx(zzgcw zzgcw) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = zzgcz.zzc;
    }

    public final zzgcx zza(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgcx zzb(zzgcy zzgcy) {
        this.zze = zzgcy;
        return this;
    }

    public final zzgcx zzc(int i10) {
        if (i10 >= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgcx zzd(int i10) {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }
        this.zzc = Integer.valueOf(i10);
        return this;
    }

    public final zzgcx zze(int i10) {
        if (i10 >= 10) {
            this.zzd = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgcx zzf(zzgcz zzgcz) {
        this.zzf = zzgcz;
        return this;
    }

    public final zzgdb zzg() {
        if (this.zza == null) {
            throw new GeneralSecurityException("AES key size is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        } else if (this.zzc != null) {
            Integer num = this.zzd;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            } else if (this.zze == null) {
                throw new GeneralSecurityException("hash type is not set");
            } else if (this.zzf != null) {
                int intValue = num.intValue();
                zzgcy zzgcy = this.zze;
                if (zzgcy == zzgcy.zza) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgcy == zzgcy.zzb) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgcy == zzgcy.zzc) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgcy == zzgcy.zzd) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (zzgcy != zzgcy.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new zzgdb(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, (zzgda) null);
            } else {
                throw new GeneralSecurityException("variant is not set");
            }
        } else {
            throw new GeneralSecurityException("iv size is not set");
        }
    }
}
