package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzabb implements zzacm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzabb(long j10, long j11, int i10, int i11, boolean z10) {
        long zzc2;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1;
            zzc2 = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            zzc2 = zzc(j10, j11, i10);
        }
        this.zzf = zzc2;
    }

    private static long zzc(long j10, long j11, int i10) {
        return (Math.max(0, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j10) {
        return zzc(j10, this.zzb, this.zze);
    }

    public final zzack zzg(long j10) {
        long j11 = this.zzd;
        int i10 = (j11 > -1 ? 1 : (j11 == -1 ? 0 : -1));
        if (i10 != 0) {
            long j12 = (long) this.zzc;
            long j13 = (((((long) this.zze) * j10) / 8000000) / j12) * j12;
            if (i10 != 0) {
                j13 = Math.min(j13, j11 - j12);
            }
            long max = this.zzb + Math.max(j13, 0);
            long zzb2 = zzb(max);
            zzacn zzacn = new zzacn(zzb2, max);
            if (this.zzd != -1 && zzb2 < j10) {
                long j14 = max + ((long) this.zzc);
                if (j14 < this.zza) {
                    return new zzack(zzacn, new zzacn(zzb(j14), j14));
                }
            }
            return new zzack(zzacn, zzacn);
        }
        zzacn zzacn2 = new zzacn(0, this.zzb);
        return new zzack(zzacn2, zzacn2);
    }

    public final boolean zzh() {
        return this.zzd != -1;
    }
}
