package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgjk {
    private final Class zza;
    private final zzgrx zzb;

    /* synthetic */ zzgjk(Class cls, zzgrx zzgrx, zzgjj zzgjj) {
        this.zza = cls;
        this.zzb = zzgrx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjk)) {
            return false;
        }
        zzgjk zzgjk = (zzgjk) obj;
        if (!zzgjk.zza.equals(this.zza) || !zzgjk.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzgrx zzgrx = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgrx);
        return simpleName + ", object identifier: " + valueOf;
    }
}
