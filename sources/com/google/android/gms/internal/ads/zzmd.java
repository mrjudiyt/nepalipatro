package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzmd {
    private final zzah zza;
    private final SparseArray zzb;

    public zzmd(zzah zzah, SparseArray sparseArray) {
        this.zza = zzah;
        SparseArray sparseArray2 = new SparseArray(zzah.zzb());
        for (int i10 = 0; i10 < zzah.zzb(); i10++) {
            int zza2 = zzah.zza(i10);
            zzmc zzmc = (zzmc) sparseArray.get(zza2);
            Objects.requireNonNull(zzmc);
            sparseArray2.append(zza2, zzmc);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmc zzc(int i10) {
        zzmc zzmc = (zzmc) this.zzb.get(i10);
        Objects.requireNonNull(zzmc);
        return zzmc;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
