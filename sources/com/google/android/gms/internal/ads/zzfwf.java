package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfwf extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfsk zzb;

    zzfwf(List list, zzfsk zzfsk) {
        this.zza = list;
        this.zzb = zzfsk;
    }

    public final ListIterator listIterator(int i10) {
        return new zzfwe(this, this.zza.listIterator(i10));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        this.zza.subList(i10, i11).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}
