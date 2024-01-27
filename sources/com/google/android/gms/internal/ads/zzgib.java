package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgib {
    public static final zzgmd zza = new zzgia((zzghz) null);

    public static zzgmj zza(zzgcd zzgcd) {
        zzgbj zzgbj;
        zzgmf zzgmf = new zzgmf();
        zzgmf.zzb(zzgcd.zzb());
        for (List it : zzgcd.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzgbz zzgbz = (zzgbz) it2.next();
                    int zzh = zzgbz.zzh() - 2;
                    if (zzh == 1) {
                        zzgbj = zzgbj.zza;
                    } else if (zzh == 2) {
                        zzgbj = zzgbj.zzb;
                    } else if (zzh == 3) {
                        zzgbj = zzgbj.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int zza2 = zzgbz.zza();
                    String zzf = zzgbz.zzf();
                    if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                        zzf = zzf.substring(34);
                    }
                    zzgmf.zza(zzgbj, zza2, zzf, zzgbz.zzc().name());
                }
            }
        }
        if (zzgcd.zza() != null) {
            zzgmf.zzc(zzgcd.zza().zza());
        }
        try {
            return zzgmf.zzd();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
