package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzwc {
    public final long zza;
    public final long zzb;

    public zzwc(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwc)) {
            return false;
        }
        zzwc zzwc = (zzwc) obj;
        return this.zza == zzwc.zza && this.zzb == zzwc.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
