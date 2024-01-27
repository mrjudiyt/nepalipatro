package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgiz {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgiz(Class cls, Class cls2, zzgiy zzgiy) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgiz)) {
            return false;
        }
        zzgiz zzgiz = (zzgiz) obj;
        if (!zzgiz.zza.equals(this.zza) || !zzgiz.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        return simpleName + " with primitive type: " + simpleName2;
    }
}
