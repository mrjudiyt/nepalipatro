package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgko implements zzgce {
    private static final zzgko zza = new zzgko();

    private zzgko() {
    }

    static void zzd() {
        zzgcg.zzg(zza);
    }

    public final Class zza() {
        return zzgkl.class;
    }

    public final Class zzb() {
        return zzgkl.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzgcd zzgcd) {
        if (zzgcd.zza() != null) {
            for (List<zzgbz> it : zzgcd.zzd()) {
                for (zzgbz zzd : it) {
                    zzgkl zzgkl = (zzgkl) zzd.zzd();
                }
            }
            return new zzgkn(zzgcd, (zzgkm) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
