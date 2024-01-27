package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgjm {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzgjm(Class cls, Class cls2, zzgjl zzgjl) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjm)) {
            return false;
        }
        zzgjm zzgjm = (zzgjm) obj;
        if (!zzgjm.zza.equals(this.zza) || !zzgjm.zzb.equals(this.zzb)) {
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
        return simpleName + " with serialization type: " + simpleName2;
    }
}
