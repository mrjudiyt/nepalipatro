package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzacf implements zzacm {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzacf(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdx.zzd(length == length2);
        boolean z10 = length2 > 0;
        this.zzd = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.zza = jArr3;
            long[] jArr4 = new long[i10];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j10;
    }

    public final long zza() {
        return this.zzc;
    }

    public final zzack zzg(long j10) {
        if (!this.zzd) {
            zzacn zzacn = zzacn.zza;
            return new zzack(zzacn, zzacn);
        }
        int zzc2 = zzfk.zzc(this.zzb, j10, true, true);
        zzacn zzacn2 = new zzacn(this.zzb[zzc2], this.zza[zzc2]);
        if (zzacn2.zzb != j10) {
            long[] jArr = this.zzb;
            if (zzc2 != jArr.length - 1) {
                int i10 = zzc2 + 1;
                return new zzack(zzacn2, new zzacn(jArr[i10], this.zza[i10]));
            }
        }
        return new zzack(zzacn2, zzacn2);
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
