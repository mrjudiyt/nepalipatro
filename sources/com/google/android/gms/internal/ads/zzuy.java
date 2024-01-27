package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzuy {
    public final int zza;
    public final boolean zzb;

    public zzuy(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzuy.class == obj.getClass()) {
            zzuy zzuy = (zzuy) obj;
            return this.zza == zzuy.zza && this.zzb == zzuy.zzb;
        }
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
