package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzalc implements zzacm {
    private final zzakz zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzalc(zzakz zzakz, int i10, long j10, long j11) {
        this.zza = zzakz;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzakz.zzd);
        this.zzd = j12;
        this.zze = zzb(j12);
    }

    private final long zzb(long j10) {
        return zzfk.zzr(j10 * ((long) this.zzb), 1000000, (long) this.zza.zzc);
    }

    public final long zza() {
        return this.zze;
    }

    public final zzack zzg(long j10) {
        long max = Math.max(0, Math.min((((long) this.zza.zzc) * j10) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long zzb2 = zzb(max);
        zzacn zzacn = new zzacn(zzb2, this.zzc + (((long) this.zza.zzd) * max));
        if (zzb2 >= j10 || max == this.zzd - 1) {
            return new zzack(zzacn, zzacn);
        }
        long j11 = max + 1;
        return new zzack(zzacn, new zzacn(zzb(j11), this.zzc + (j11 * ((long) this.zza.zzd))));
    }

    public final boolean zzh() {
        return true;
    }
}
