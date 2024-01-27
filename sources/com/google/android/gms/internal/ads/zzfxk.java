package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxk extends zzfxb implements Serializable {
    final zzfxb zza;

    zzfxk(zzfxb zzfxb) {
        this.zza = zzfxb;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxk) {
            return this.zza.equals(((zzfxk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public final zzfxb zza() {
        return this.zza;
    }
}
