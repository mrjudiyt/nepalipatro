package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgle {
    @Deprecated
    static final zzgqi zza;
    @Deprecated
    static final zzgqi zzb;
    @Deprecated
    static final zzgqi zzc;

    static {
        new zzgkx();
        zzgqi zzc2 = zzgqi.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzglk.zzd();
        zzgko.zzd();
        zzgkx.zzh(true);
        if (!zzghg.zzb()) {
            zzgka.zzm(true);
        }
    }
}
