package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzglt implements zzgkl {
    private final zzgks zza;

    public zzglt(zzgks zzgks) {
        if (zzghf.zza(2)) {
            this.zza = zzgks;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
