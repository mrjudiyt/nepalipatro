package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzmc {
    public final long zza;
    public final zzcv zzb;
    public final int zzc;
    public final zztw zzd;
    public final long zze;
    public final zzcv zzf;
    public final int zzg;
    public final zztw zzh;
    public final long zzi;
    public final long zzj;

    public zzmc(long j10, zzcv zzcv, int i10, zztw zztw, long j11, zzcv zzcv2, int i11, zztw zztw2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzcv;
        this.zzc = i10;
        this.zzd = zztw;
        this.zze = j11;
        this.zzf = zzcv2;
        this.zzg = i11;
        this.zzh = zztw2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmc.class == obj.getClass()) {
            zzmc zzmc = (zzmc) obj;
            return this.zza == zzmc.zza && this.zzc == zzmc.zzc && this.zze == zzmc.zze && this.zzg == zzmc.zzg && this.zzi == zzmc.zzi && this.zzj == zzmc.zzj && zzfsr.zza(this.zzb, zzmc.zzb) && zzfsr.zza(this.zzd, zzmc.zzd) && zzfsr.zza(this.zzf, zzmc.zzf) && zzfsr.zza(this.zzh, zzmc.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
