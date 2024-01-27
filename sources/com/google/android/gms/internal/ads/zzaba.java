package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaba implements zzacm {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaba(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
            return;
        }
        this.zzf = 0;
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        return "ChunkIndex(length=" + this.zza + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    public final long zza() {
        return this.zzf;
    }

    public final zzack zzg(long j10) {
        long[] jArr = this.zze;
        int zzc2 = zzfk.zzc(jArr, j10, true, true);
        zzacn zzacn = new zzacn(jArr[zzc2], this.zzc[zzc2]);
        if (zzacn.zzb >= j10 || zzc2 == this.zza - 1) {
            return new zzack(zzacn, zzacn);
        }
        int i10 = zzc2 + 1;
        return new zzack(zzacn, new zzacn(this.zze[i10], this.zzc[i10]));
    }

    public final boolean zzh() {
        return true;
    }
}
