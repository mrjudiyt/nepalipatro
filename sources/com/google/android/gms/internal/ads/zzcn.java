package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcn {
    public static final zzn zza = zzcm.zza;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public final Object zzb;
    public final int zzc;
    public final zzbp zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzcn(Object obj, int i10, zzbp zzbp, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.zzb = obj;
        this.zzc = i10;
        this.zzd = zzbp;
        this.zze = obj2;
        this.zzf = i11;
        this.zzg = j10;
        this.zzh = j11;
        this.zzi = i12;
        this.zzj = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcn.class == obj.getClass()) {
            zzcn zzcn = (zzcn) obj;
            return this.zzc == zzcn.zzc && this.zzf == zzcn.zzf && this.zzg == zzcn.zzg && this.zzh == zzcn.zzh && this.zzi == zzcn.zzi && this.zzj == zzcn.zzj && zzfsr.zza(this.zzb, zzcn.zzb) && zzfsr.zza(this.zze, zzcn.zze) && zzfsr.zza(this.zzd, zzcn.zzd);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
