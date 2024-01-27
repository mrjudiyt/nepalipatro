package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzaic implements zzaii {
    private final zzabz zza;
    private final zzaby zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaic(zzabz zzabz, zzaby zzaby) {
        this.zza = zzabz;
        this.zzb = zzaby;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    public final long zzd(zzabn zzabn) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j10 + 2);
    }

    public final zzacm zze() {
        zzdx.zzf(this.zzc != -1);
        return new zzabx(this.zza, this.zzc);
    }

    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfk.zzc(jArr, j10, true, true)];
    }
}
