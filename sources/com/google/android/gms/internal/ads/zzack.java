package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzack {
    public final zzacn zza;
    public final zzacn zzb;

    public zzack(zzacn zzacn, zzacn zzacn2) {
        this.zza = zzacn;
        this.zzb = zzacn2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzack.class == obj.getClass()) {
            zzack zzack = (zzack) obj;
            return this.zza.equals(zzack.zza) && this.zzb.equals(zzack.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzacn zzacn = this.zza;
        zzacn zzacn2 = this.zzb;
        String obj = zzacn.toString();
        String concat = zzacn.equals(zzacn2) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
