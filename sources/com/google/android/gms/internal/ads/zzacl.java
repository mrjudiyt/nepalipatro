package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzacl implements zzacm {
    private final long zza;
    private final zzack zzb;

    public zzacl(long j10, long j11) {
        this.zza = j10;
        zzacn zzacn = j11 == 0 ? zzacn.zza : new zzacn(0, j11);
        this.zzb = new zzack(zzacn, zzacn);
    }

    public final long zza() {
        return this.zza;
    }

    public final zzack zzg(long j10) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}
