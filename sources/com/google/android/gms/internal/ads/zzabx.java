package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzabx implements zzacm {
    private final zzabz zza;
    private final long zzb;

    public zzabx(zzabz zzabz, long j10) {
        this.zza = zzabz;
        this.zzb = j10;
    }

    private final zzacn zzb(long j10, long j11) {
        return new zzacn((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final zzack zzg(long j10) {
        long j11;
        zzdx.zzb(this.zza.zzk);
        zzabz zzabz = this.zza;
        zzaby zzaby = zzabz.zzk;
        long[] jArr = zzaby.zza;
        long[] jArr2 = zzaby.zzb;
        int zzc = zzfk.zzc(jArr, zzabz.zzb(j10), true, false);
        long j12 = 0;
        if (zzc == -1) {
            j11 = 0;
        } else {
            j11 = jArr[zzc];
        }
        if (zzc != -1) {
            j12 = jArr2[zzc];
        }
        zzacn zzb2 = zzb(j11, j12);
        if (zzb2.zzb == j10 || zzc == jArr.length - 1) {
            return new zzack(zzb2, zzb2);
        }
        int i10 = zzc + 1;
        return new zzack(zzb2, zzb(jArr[i10], jArr2[i10]));
    }

    public final boolean zzh() {
        return true;
    }
}
