package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgrd implements zzgre {
    private final zzgrn zza;

    /* synthetic */ zzgrd(zzgrn zzgrn, zzgrc zzgrc) {
        this.zza = zzgrn;
    }

    public final Object zza(String str) {
        Exception exc = null;
        for (Provider zza2 : zzgrf.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
