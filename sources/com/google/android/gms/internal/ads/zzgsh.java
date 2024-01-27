package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgsh extends zzgsj {
    final /* synthetic */ zzgsr zza;
    private int zzb = 0;
    private final int zzc;

    zzgsh(zzgsr zzgsr) {
        this.zza = zzgsr;
        this.zzc = zzgsr.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
