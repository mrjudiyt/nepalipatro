package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdo {
    public static final zzdo zza = new zzdo(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdo(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzfk.zzF(i12) ? zzfk.zzl(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdo)) {
            return false;
        }
        zzdo zzdo = (zzdo) obj;
        return this.zzb == zzdo.zzb && this.zzc == zzdo.zzc && this.zzd == zzdo.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}
