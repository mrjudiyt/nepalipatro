package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzgwy extends AbstractList implements RandomAccess, zzgur {
    /* access modifiers changed from: private */
    public final zzgur zza;

    public zzgwy(zzgur zzgur) {
        this.zza = zzgur;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzguq) this.zza).get(i10);
    }

    public final Iterator iterator() {
        return new zzgwx(this);
    }

    public final ListIterator listIterator(int i10) {
        return new zzgww(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzgur zze() {
        return this;
    }

    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    public final List zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zzgsr zzgsr) {
        throw new UnsupportedOperationException();
    }
}
