package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrj implements zzgrn {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
