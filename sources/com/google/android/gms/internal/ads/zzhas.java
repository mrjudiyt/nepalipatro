package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzhas implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhat zzb;

    zzhas(zzhat zzhat) {
        this.zzb = zzhat;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhat zzhat = this.zzb;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return zzhat.zza.get(i10);
        }
        zzhat zzhat2 = this.zzb;
        zzhat2.zza.add(zzhat2.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
