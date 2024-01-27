package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzahe implements zzahb {
    private final zzfb zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzahe(zzagx zzagx) {
        zzfb zzfb = zzagx.zza;
        this.zza = zzfb;
        zzfb.zzG(12);
        this.zzc = zzfb.zzo() & 255;
        this.zzb = zzfb.zzo();
    }

    public final int zza() {
        return -1;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzl();
        }
        if (i10 == 16) {
            return this.zza.zzp();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 != 0) {
            return this.zze & 15;
        }
        int zzl = this.zza.zzl();
        this.zze = zzl;
        return (zzl & 240) >> 4;
    }
}
