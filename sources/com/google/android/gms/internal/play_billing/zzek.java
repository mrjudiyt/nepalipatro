package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
final class zzek implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzel zzb;

    zzek(zzel zzel) {
        this.zzb = zzel;
        this.zza = zzel.zza.iterator();
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
