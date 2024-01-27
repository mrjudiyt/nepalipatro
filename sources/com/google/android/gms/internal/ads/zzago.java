package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzago implements zzagt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzago(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfk.zzq(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzago zzb(long j10, zzafl zzafl, long j11) {
        int length = zzafl.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzafl.zzb + zzafl.zzd[i12]);
            j12 += (long) (zzafl.zzc + zzafl.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzago(jArr, jArr2, j11);
    }

    private static Pair zze(long j10, long[] jArr, long[] jArr2) {
        int zzc2 = zzfk.zzc(jArr, j10, true, true);
        long j11 = jArr[zzc2];
        long j12 = jArr2[zzc2];
        int i10 = zzc2 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i10] - j12)))) + j12));
    }

    public final long zza() {
        return this.zzc;
    }

    public final long zzc() {
        return -1;
    }

    public final long zzd(long j10) {
        return zzfk.zzq(((Long) zze(j10, this.zza, this.zzb).second).longValue());
    }

    public final zzack zzg(long j10) {
        Pair zze = zze(zzfk.zzs(Math.max(0, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzacn zzacn = new zzacn(zzfk.zzq(((Long) zze.first).longValue()), ((Long) zze.second).longValue());
        return new zzack(zzacn, zzacn);
    }

    public final boolean zzh() {
        return true;
    }
}
