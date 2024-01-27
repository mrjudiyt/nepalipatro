package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzalu {
    private int zza = 2500;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzamp zzamp) {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        int i11 = this.zza;
        this.zza = i11 + ((int) ((float) i11));
        if (i10 > 1) {
            throw zzamp;
        }
    }
}
