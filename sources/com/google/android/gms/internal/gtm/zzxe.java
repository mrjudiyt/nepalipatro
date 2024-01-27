package com.google.android.gms.internal.gtm;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzxe implements Map.Entry, Comparable<zzxe> {
    final /* synthetic */ zzxk zza;
    private final Comparable zzb;
    private Object zzc;

    zzxe(zzxk zzxk, Comparable comparable, Object obj) {
        this.zza = zzxk;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzxe) obj).zzb);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        return this.zzc;
    }

    public final int hashCode() {
        Comparable comparable = this.zzb;
        int i10 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final Object setValue(Object obj) {
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
