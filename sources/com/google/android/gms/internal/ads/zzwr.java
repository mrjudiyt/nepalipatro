package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzwr implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzwr(zzam zzam, int i10) {
        this.zza = 1 != (zzam.zze & 1) ? false : true;
        this.zzb = zzxi.zzn(i10, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzwr zzwr) {
        return zzfvh.zzj().zzd(this.zzb, zzwr.zzb).zzd(this.zza, zzwr.zza).zza();
    }
}
