package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzacn {
    public static final zzacn zza = new zzacn(0, 0);
    public final long zzb;
    public final long zzc;

    public zzacn(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacn.class == obj.getClass()) {
            zzacn zzacn = (zzacn) obj;
            return this.zzb == zzacn.zzb && this.zzc == zzacn.zzc;
        }
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
