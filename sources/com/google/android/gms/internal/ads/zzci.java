package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzci {
    private final zzaf zza = new zzaf();

    public final zzci zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzci zzb(zzck zzck) {
        zzah zza2 = zzck.zzd;
        for (int i10 = 0; i10 < zza2.zzb(); i10++) {
            this.zza.zza(zza2.zza(i10));
        }
        return this;
    }

    public final zzci zzc(int... iArr) {
        for (int i10 = 0; i10 < 19; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzci zzd(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzck zze() {
        return new zzck(this.zza.zzb(), (zzcj) null);
    }
}
