package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzul implements zzvo {
    private final zzvo zza;
    private final long zzb;

    public zzul(zzvo zzvo, long j10) {
        this.zza = zzvo;
        this.zzb = j10;
    }

    public final int zza(zzkn zzkn, zzht zzht, int i10) {
        int zza2 = this.zza.zza(zzkn, zzht, i10);
        if (zza2 != -4) {
            return zza2;
        }
        zzht.zze += this.zzb;
        return -4;
    }

    public final int zzb(long j10) {
        return this.zza.zzb(j10 - this.zzb);
    }

    public final zzvo zzc() {
        return this.zza;
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
