package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzoq {
    public static final zzoq zza = new zzoo().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzoq(zzoo zzoo, zzop zzop) {
        this.zzb = zzoo.zza;
        this.zzc = zzoo.zzb;
        this.zzd = zzoo.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzoq.class == obj.getClass()) {
            zzoq zzoq = (zzoq) obj;
            return this.zzb == zzoq.zzb && this.zzc == zzoq.zzc && this.zzd == zzoq.zzd;
        }
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return ((z10 ? 1 : 0) << true) + (z11 ? 1 : 0) + z11 + (this.zzd ? 1 : 0);
    }
}
