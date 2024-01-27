package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgrf {
    public static final zzgrf zza = new zzgrf(new zzgrg());
    public static final zzgrf zzb = new zzgrf(new zzgrk());
    public static final zzgrf zzc = new zzgrf(new zzgrm());
    public static final zzgrf zzd = new zzgrf(new zzgrl());
    public static final zzgrf zze = new zzgrf(new zzgrh());
    public static final zzgrf zzf = new zzgrf(new zzgrj());
    public static final zzgrf zzg = new zzgrf(new zzgri());
    private final zzgre zzh;

    public zzgrf(zzgrn zzgrn) {
        if (zzghg.zzb()) {
            this.zzh = new zzgrd(zzgrn, (zzgrc) null);
        } else if (zzgru.zza()) {
            this.zzh = new zzgqz(zzgrn, (zzgqy) null);
        } else {
            this.zzh = new zzgrb(zzgrn, (zzgra) null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) {
        return this.zzh.zza(str);
    }
}
