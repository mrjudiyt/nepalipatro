package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgds {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgdt zzd;

    private zzgds() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgds(zzgdr zzgdr) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgdt.zzc;
    }

    public final zzgds zza(int i10) {
        if (i10 == 12 || i10 == 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgds zzb(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgds zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzgds zzd(zzgdt zzgdt) {
        this.zzd = zzgdt;
        return this;
    }

    public final zzgdv zze() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        } else if (this.zzc != null) {
            int intValue = num.intValue();
            int intValue2 = this.zzb.intValue();
            this.zzc.intValue();
            return new zzgdv(intValue, intValue2, 16, this.zzd, (zzgdu) null);
        } else {
            throw new GeneralSecurityException("Tag size is not set");
        }
    }
}
