package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
final class zzfsz implements Serializable, zzfsx {
    private final List zza;

    /* synthetic */ zzfsz(List list, zzfsy zzfsy) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfsz) {
            return this.zza.equals(((zzfsz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z10 = true;
        for (Object next : this.zza) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(next);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfsx) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
