package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgls implements zzgkl {
    private final zzgjv zza;

    public zzgls(zzgjv zzgjv) {
        if (zzghf.zza(1)) {
            this.zza = zzgjv;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
