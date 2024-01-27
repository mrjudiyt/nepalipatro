package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzahy {
    public final zzahv zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzahy(zzahv zzahv, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z10 = true;
        zzdx.zzd(length == length2);
        int length3 = jArr.length;
        zzdx.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdx.zzd(length4 != length2 ? false : z10);
        this.zza = zzahv;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j10;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j10) {
        for (int zzc2 = zzfk.zzc(this.zzf, j10, true, false); zzc2 >= 0; zzc2--) {
            if ((this.zzg[zzc2] & 1) != 0) {
                return zzc2;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int zza2 = zzfk.zza(this.zzf, j10, true, false); zza2 < this.zzf.length; zza2++) {
            if ((this.zzg[zza2] & 1) != 0) {
                return zza2;
            }
        }
        return -1;
    }
}
