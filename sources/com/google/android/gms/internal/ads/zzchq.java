package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchq {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzchq(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzchq zza() {
        return new zzchq(0, 0, 0);
    }

    public static zzchq zzb(int i10, int i11) {
        return new zzchq(1, i10, i11);
    }

    public static zzchq zzc(zzq zzq) {
        if (zzq.zzd) {
            return new zzchq(3, 0, 0);
        }
        if (zzq.zzi) {
            return new zzchq(2, 0, 0);
        }
        if (zzq.zzh) {
            return zza();
        }
        return zzb(zzq.zzf, zzq.zzc);
    }

    public static zzchq zzd() {
        return new zzchq(5, 0, 0);
    }

    public static zzchq zze() {
        return new zzchq(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
