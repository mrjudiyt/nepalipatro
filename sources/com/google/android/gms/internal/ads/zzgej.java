package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgej {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgek zzd;

    private zzgej() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* synthetic */ zzgej(zzgei zzgei) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgek.zzc;
    }

    public final zzgej zza(int i10) {
        this.zzb = 12;
        return this;
    }

    public final zzgej zzb(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgej zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzgej zzd(zzgek zzgek) {
        this.zzd = zzgek;
        return this;
    }

    public final zzgem zze() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        } else if (this.zzc != null) {
            int intValue = num.intValue();
            this.zzb.intValue();
            this.zzc.intValue();
            return new zzgem(intValue, 12, 16, this.zzd, (zzgel) null);
        } else {
            throw new GeneralSecurityException("Tag size is not set");
        }
    }
}
