package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgkc {
    private Integer zza;
    private Integer zzb;
    private zzgkd zzc;

    private zzgkc() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    /* synthetic */ zzgkc(zzgkb zzgkb) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgkd.zzd;
    }

    public final zzgkc zza(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 * 8)}));
    }

    public final zzgkc zzb(int i10) {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }
        this.zzb = Integer.valueOf(i10);
        return this;
    }

    public final zzgkc zzc(zzgkd zzgkd) {
        this.zzc = zzgkd;
        return this;
    }

    public final zzgkf zzd() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        } else if (this.zzc != null) {
            return new zzgkf(num.intValue(), this.zzb.intValue(), this.zzc, (zzgke) null);
        } else {
            throw new GeneralSecurityException("variant not set");
        }
    }
}
