package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfc {
    public static final zzfc zza = new zzfc(-1, -1);
    public static final zzfc zzb = new zzfc(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfc(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzdx.zzd(z10);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfc) {
            zzfc zzfc = (zzfc) obj;
            return this.zzc == zzfc.zzc && this.zzd == zzfc.zzd;
        }
    }

    public final int hashCode() {
        int i10 = this.zzc;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
