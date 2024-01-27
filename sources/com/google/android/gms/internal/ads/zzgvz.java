package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvz implements Iterator {
    private final ArrayDeque zza;
    private zzgsm zzb;

    /* synthetic */ zzgvz(zzgsr zzgsr, zzgvy zzgvy) {
        if (zzgsr instanceof zzgwb) {
            zzgwb zzgwb = (zzgwb) zzgsr;
            ArrayDeque arrayDeque = new ArrayDeque(zzgwb.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgwb);
            this.zzb = zzb(zzgwb.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgsm) zzgsr;
    }

    private final zzgsm zzb(zzgsr zzgsr) {
        while (zzgsr instanceof zzgwb) {
            zzgwb zzgwb = (zzgwb) zzgsr;
            this.zza.push(zzgwb);
            zzgsr = zzgwb.zzd;
        }
        return (zzgsm) zzgsr;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgsm next() {
        zzgsm zzgsm;
        zzgsm zzgsm2 = this.zzb;
        if (zzgsm2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgsm = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgsm;
                } else {
                    zzgsm = zzb(((zzgwb) this.zza.pop()).zze);
                }
            } while (zzgsm.zzd() == 0);
            this.zzb = zzgsm;
            return zzgsm2;
        }
        throw new NoSuchElementException();
    }
}
