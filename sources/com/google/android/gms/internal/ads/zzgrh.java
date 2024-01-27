package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrh implements zzgrn {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
