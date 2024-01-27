package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgvx {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgvx() {
    }

    static /* bridge */ /* synthetic */ zzgsr zza(zzgvx zzgvx, zzgsr zzgsr, zzgsr zzgsr2) {
        zzgvx.zzb(zzgsr);
        zzgvx.zzb(zzgsr2);
        zzgsr zzgsr3 = (zzgsr) zzgvx.zza.pop();
        while (!zzgvx.zza.isEmpty()) {
            zzgsr3 = new zzgwb((zzgsr) zzgvx.zza.pop(), zzgsr3);
        }
        return zzgsr3;
    }

    private final void zzb(zzgsr zzgsr) {
        if (zzgsr.zzh()) {
            int zzc = zzc(zzgsr.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgwb.zzc(zzc + 1);
            if (arrayDeque.isEmpty() || ((zzgsr) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgsr);
                return;
            }
            int zzc3 = zzgwb.zzc(zzc);
            zzgsr zzgsr2 = (zzgsr) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgsr) this.zza.peek()).zzd() < zzc3) {
                zzgsr2 = new zzgwb((zzgsr) this.zza.pop(), zzgsr2);
            }
            zzgwb zzgwb = new zzgwb(zzgsr2, zzgsr);
            while (!this.zza.isEmpty()) {
                ArrayDeque arrayDeque2 = this.zza;
                if (((zzgsr) arrayDeque2.peek()).zzd() >= zzgwb.zzc(zzc(zzgwb.zzd()) + 1)) {
                    break;
                }
                zzgwb = new zzgwb((zzgsr) this.zza.pop(), zzgwb);
            }
            this.zza.push(zzgwb);
        } else if (zzgsr instanceof zzgwb) {
            zzgwb zzgwb2 = (zzgwb) zzgsr;
            zzb(zzgwb2.zzd);
            zzb(zzgwb2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgsr.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgwb.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgvx(zzgvw zzgvw) {
    }
}
