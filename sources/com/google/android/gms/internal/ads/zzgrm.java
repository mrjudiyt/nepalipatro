package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrm implements zzgrn {
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
