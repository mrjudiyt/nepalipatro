package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzlv {
    public static final zzlv zza;
    public static final zzlv zzb = new zzlv(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzlv zzc = new zzlv(Long.MAX_VALUE, 0);
    public static final zzlv zzd = new zzlv(0, Long.MAX_VALUE);
    public static final zzlv zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlv zzlv = new zzlv(0, 0);
        zza = zzlv;
        zze = zzlv;
    }

    public zzlv(long j10, long j11) {
        boolean z10 = true;
        zzdx.zzd(j10 >= 0);
        zzdx.zzd(j11 < 0 ? false : z10);
        this.zzf = j10;
        this.zzg = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlv.class == obj.getClass()) {
            zzlv zzlv = (zzlv) obj;
            return this.zzf == zzlv.zzf && this.zzg == zzlv.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
