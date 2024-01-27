package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfif {
    public final String zza;
    public final String zzb;

    public zzfif(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfif)) {
            return false;
        }
        zzfif zzfif = (zzfif) obj;
        return this.zza.equals(zzfif.zza) && this.zzb.equals(zzfif.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
