package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgcd {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzgbz zzc;
    private final Class zzd;
    private final zzgmc zze;

    /* synthetic */ zzgcd(ConcurrentMap concurrentMap, List list, zzgbz zzgbz, zzgmc zzgmc, Class cls, zzgcc zzgcc) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzgbz;
        this.zzd = cls;
        this.zze = zzgmc;
    }

    public final zzgbz zza() {
        return this.zzc;
    }

    public final zzgmc zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzgcb(bArr, (zzgca) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
