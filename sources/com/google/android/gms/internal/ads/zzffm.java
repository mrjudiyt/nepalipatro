package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzffm implements zzffk {
    private final String zza;

    public zzffm(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzffm)) {
            return false;
        }
        return this.zza.equals(((zzffm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
