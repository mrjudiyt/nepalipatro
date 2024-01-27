package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzgwx implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgwy zzb;

    zzgwx(zzgwy zzgwy) {
        this.zzb = zzgwy;
        this.zza = zzgwy.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
