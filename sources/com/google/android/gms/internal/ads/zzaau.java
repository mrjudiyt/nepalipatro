package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaau {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    /* access modifiers changed from: private */
    public long zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public long zzh;

    protected zzaau(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        long j17 = j11;
        this.zzb = j17;
        long j18 = j13;
        this.zze = j18;
        long j19 = j14;
        this.zzf = j19;
        long j20 = j15;
        this.zzg = j20;
        long j21 = j16;
        this.zzc = j21;
        this.zzh = zzf(j17, 0, j18, j19, j20, j21);
    }

    protected static long zzf(long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j13;
        if (j16 + 1 >= j14 || 1 + j11 >= j12) {
            return j16;
        }
        long j17 = (long) (((float) (j10 - j11)) * (((float) (j14 - j16)) / ((float) (j12 - j11))));
        return Math.max(j16, Math.min(((j16 + j17) - j15) - (j17 / 20), j14 - 1));
    }

    static /* bridge */ /* synthetic */ void zzg(zzaau zzaau, long j10, long j11) {
        zzaau.zze = j10;
        zzaau.zzg = j11;
        zzaau.zzi();
    }

    static /* bridge */ /* synthetic */ void zzh(zzaau zzaau, long j10, long j11) {
        zzaau.zzd = j10;
        zzaau.zzf = j11;
        zzaau.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
