package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzdg {
    public static final zzdg zza = new zzdg(zzfvs.zzl());
    public static final zzn zzb = zzdd.zza;
    private static final String zzc = Integer.toString(0, 36);
    private final zzfvs zzd;

    public zzdg(List list) {
        this.zzd = zzfvs.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdg.class != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzdg) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfvs zza() {
        return this.zzd;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            zzdf zzdf = (zzdf) this.zzd.get(i11);
            if (zzdf.zzc() && zzdf.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
