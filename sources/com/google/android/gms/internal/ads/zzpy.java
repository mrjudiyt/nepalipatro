package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzpy {
    private final zzdq[] zza;
    private final zzqq zzb;
    private final zzdt zzc;

    public zzpy(zzdq... zzdqArr) {
        zzqq zzqq = new zzqq();
        zzdt zzdt = new zzdt();
        zzdq[] zzdqArr2 = new zzdq[2];
        this.zza = zzdqArr2;
        System.arraycopy(zzdqArr, 0, zzdqArr2, 0, 0);
        this.zzb = zzqq;
        this.zzc = zzdt;
        zzdqArr2[0] = zzqq;
        zzdqArr2[1] = zzdt;
    }

    public final long zza(long j10) {
        return this.zzc.zzi(j10);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcg zzc(zzcg zzcg) {
        this.zzc.zzk(zzcg.zzc);
        this.zzc.zzj(zzcg.zzd);
        return zzcg;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzdq[] zze() {
        return this.zza;
    }
}
