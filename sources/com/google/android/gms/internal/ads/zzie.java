package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzie {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzie(String str, zzam zzam, zzam zzam2, int i10, int i11) {
        boolean z10 = false;
        if (i10 != 0) {
            i11 = i11 == 0 ? 0 : i11;
            zzdx.zzd(z10);
            zzdx.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzam);
            this.zzb = zzam;
            Objects.requireNonNull(zzam2);
            this.zzc = zzam2;
            this.zzd = i10;
            this.zze = i11;
        }
        z10 = true;
        zzdx.zzd(z10);
        zzdx.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzam);
        this.zzb = zzam;
        Objects.requireNonNull(zzam2);
        this.zzc = zzam2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzie.class == obj.getClass()) {
            zzie zzie = (zzie) obj;
            return this.zzd == zzie.zzd && this.zze == zzie.zze && this.zza.equals(zzie.zza) && this.zzb.equals(zzie.zzb) && this.zzc.equals(zzie.zzc);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
