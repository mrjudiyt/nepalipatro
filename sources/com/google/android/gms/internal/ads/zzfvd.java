package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfvd extends zzfxb implements Serializable {
    final Comparator zza;

    zzfvd(Comparator comparator) {
        this.zza = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfvd) {
            return this.zza.equals(((zzfvd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
