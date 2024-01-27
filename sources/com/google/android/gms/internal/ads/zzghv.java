package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public abstract class zzghv {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzghv(Class cls, zzgiv... zzgivArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 <= 0) {
            zzgiv zzgiv = zzgivArr[i10];
            if (!hashMap.containsKey(zzgiv.zzb())) {
                hashMap.put(zzgiv.zzb(), zzgiv);
                i10++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgiv.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgivArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzghu zza() {
        throw null;
    }

    public abstract zzgoy zzb();

    public abstract zzgvj zzc(zzgsr zzgsr);

    public abstract String zzd();

    public abstract void zze(zzgvj zzgvj);

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgvj zzgvj, Class cls) {
        zzgiv zzgiv = (zzgiv) this.zzb.get(cls);
        if (zzgiv != null) {
            return zzgiv.zza(zzgvj);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
