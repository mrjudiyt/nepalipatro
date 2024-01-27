package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class zzbe implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzbb zzb;

    zzbe(zzbb zzbb) {
        this.zzb = zzbb;
        this.zza = zzbb.zza.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
