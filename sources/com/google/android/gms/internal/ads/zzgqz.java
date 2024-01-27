package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgqz implements zzgre {
    private final zzgrn zza;

    /* synthetic */ zzgqz(zzgrn zzgrn, zzgqy zzgqy) {
        this.zza = zzgrn;
    }

    public final Object zza(String str) {
        for (Provider zza2 : zzgrf.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
