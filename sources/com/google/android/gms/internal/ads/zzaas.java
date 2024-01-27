package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzaas implements zzacm {
    private final zzaav zza;
    private final long zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final long zze;
    /* access modifiers changed from: private */
    public final long zzf;

    public zzaas(zzaav zzaav, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzaav;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j10) {
        return this.zza.zza(j10);
    }

    public final zzack zzg(long j10) {
        zzacn zzacn = new zzacn(j10, zzaau.zzf(this.zza.zza(j10), 0, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzack(zzacn, zzacn);
    }

    public final boolean zzh() {
        return true;
    }
}
