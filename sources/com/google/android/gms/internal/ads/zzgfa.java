package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgfa {
    private Integer zza;
    private zzgfb zzb;

    private zzgfa() {
        this.zza = null;
        throw null;
    }

    /* synthetic */ zzgfa(zzgez zzgez) {
        this.zza = null;
        this.zzb = zzgfb.zzc;
    }

    public final zzgfa zza(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.zza = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
    }

    public final zzgfa zzb(zzgfb zzgfb) {
        this.zzb = zzgfb;
        return this;
    }

    public final zzgfd zzc() {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb != null) {
            return new zzgfd(num.intValue(), this.zzb, (zzgfc) null);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }
}
