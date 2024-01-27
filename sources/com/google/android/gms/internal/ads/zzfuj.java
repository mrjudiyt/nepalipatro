package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfuj extends zzfuh implements ListIterator {
    final /* synthetic */ zzfuk zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfuj(zzfuk zzfuk) {
        super(zzfuk);
        this.zzd = zzfuk;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzful zzful = this.zzd.zzf;
        zzful.zzb = zzful.zzb + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfuj(zzfuk zzfuk, int i10) {
        super(zzfuk, ((List) zzfuk.zzb).listIterator(i10));
        this.zzd = zzfuk;
    }
}
