package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzvo<K> implements Iterator<Map.Entry<K, Object>> {
    private final Iterator<Map.Entry<K, Object>> zza;

    public zzvo(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        return next.getValue() instanceof zzvp ? new zzvn(next, (zzvm) null) : next;
    }

    public final void remove() {
        this.zza.remove();
    }
}
