package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgmj {
    private final zzgmc zza;
    private final List zzb;
    private final Integer zzc;

    /* synthetic */ zzgmj(zzgmc zzgmc, List list, Integer num, zzgmi zzgmi) {
        this.zza = zzgmc;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmj)) {
            return false;
        }
        zzgmj zzgmj = (zzgmj) obj;
        if (this.zza.equals(zzgmj.zza) && this.zzb.equals(zzgmj.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzgmj.zzc;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
