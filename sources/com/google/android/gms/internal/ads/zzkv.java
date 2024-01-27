package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzkv {
    public final zztw zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzkv(zztw zztw, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        zzdx.zzd(!z13 || z11);
        if (z12 && !z11) {
            z14 = false;
        }
        zzdx.zzd(z14);
        this.zza = zztw;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkv.class == obj.getClass()) {
            zzkv zzkv = (zzkv) obj;
            return this.zzb == zzkv.zzb && this.zzc == zzkv.zzc && this.zzd == zzkv.zzd && this.zze == zzkv.zze && this.zzg == zzkv.zzg && this.zzh == zzkv.zzh && this.zzi == zzkv.zzi && zzfk.zzE(this.zza, zzkv.zza);
        }
    }

    public final int hashCode() {
        long j10 = this.zze;
        long j11 = this.zzd;
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkv zza(long j10) {
        if (j10 == this.zzc) {
            return this;
        }
        return new zzkv(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkv zzb(long j10) {
        if (j10 == this.zzb) {
            return this;
        }
        return new zzkv(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
