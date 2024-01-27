package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvv extends zzgsj {
    final zzgvz zza;
    zzgsl zzb = zzb();
    final /* synthetic */ zzgwb zzc;

    zzgvv(zzgwb zzgwb) {
        this.zzc = zzgwb;
        this.zza = new zzgvz(zzgwb, (zzgvy) null);
    }

    private final zzgsl zzb() {
        zzgvz zzgvz = this.zza;
        if (zzgvz.hasNext()) {
            return zzgvz.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgsl zzgsl = this.zzb;
        if (zzgsl != null) {
            byte zza2 = zzgsl.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
