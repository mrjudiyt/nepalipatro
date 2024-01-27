package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgbl {
    public static zzgbk zza(String str) {
        zzgbw zzgbw = (zzgbw) zzgcg.zze().get("AES128_GCM");
        if (zzgbw != null) {
            return zzgbk.zza(zzgbw);
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}
