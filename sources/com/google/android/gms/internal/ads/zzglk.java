package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzglk implements zzgce {
    private static final zzglk zza = new zzglk();
    private static final zzgiu zzb = zzgiu.zzb(zzglh.zza, zzghx.class, zzgbv.class);

    zzglk() {
    }

    public static void zzd() {
        zzgcg.zzg(zza);
        zzgif.zza().zze(zzb);
    }

    public final Class zza() {
        return zzgbv.class;
    }

    public final Class zzb() {
        return zzgbv.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzgcd zzgcd) {
        for (List it : zzgcd.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzgbz zzgbz = (zzgbz) it2.next();
                    if (zzgbz.zzb() instanceof zzglf) {
                        zzglf zzglf = (zzglf) zzgbz.zzb();
                        zzgrx zzb2 = zzgrx.zzb(zzgbz.zzg());
                        if (!zzb2.equals(zzglf.zzc())) {
                            String valueOf = String.valueOf(zzglf.zzb());
                            String obj = zzglf.zzc().toString();
                            String obj2 = zzb2.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                        }
                    }
                }
            }
        }
        return new zzglj(zzgcd, (zzgli) null);
    }
}
