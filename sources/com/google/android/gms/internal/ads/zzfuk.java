package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzfuk extends zzfui implements List {
    final /* synthetic */ zzful zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfuk(zzful zzful, Object obj, List list, zzfui zzfui) {
        super(zzful, obj, list, zzfui);
        this.zzf = zzful;
    }

    public final void add(int i10, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzful zzful = this.zzf;
        zzful.zzb = zzful.zzb + 1;
        if (isEmpty) {
            zza();
        }
    }

    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzful zzful = this.zzf;
        zzful.zzb = zzful.zzb + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new zzfuj(this);
    }

    public final Object remove(int i10) {
        zzb();
        Object remove = ((List) this.zzb).remove(i10);
        zzful zzful = this.zzf;
        zzful.zzb = zzful.zzb - 1;
        zzc();
        return remove;
    }

    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    public final List subList(int i10, int i11) {
        zzb();
        List subList = ((List) this.zzb).subList(i10, i11);
        zzfui zzfui = this.zzc;
        if (zzfui == null) {
            zzfui = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfui);
    }

    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfuj(this, i10);
    }
}
