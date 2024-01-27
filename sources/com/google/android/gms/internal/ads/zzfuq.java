package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzfuq extends AbstractCollection {
    final Collection zza;
    final zzfsx zzb;

    zzfuq(Collection collection, zzfsx zzfsx) {
        this.zza = collection;
        this.zzb = zzfsx;
    }

    public final boolean add(Object obj) {
        zzfsw.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object zza2 : collection) {
            zzfsw.zze(this.zzb.zza(zza2));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzfvy.zza(this.zza, this.zzb);
    }

    public final boolean contains(Object obj) {
        if (zzfur.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        zzfsx zzfsx = this.zzb;
        zzfsw.zzc(zzfsx, "predicate");
        int i10 = 0;
        for (Object zza2 : this.zza) {
            if (!zzfsx.zza(zza2)) {
                i10++;
            } else if (i10 != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        Objects.requireNonNull(it);
        zzfsx zzfsx = this.zzb;
        Objects.requireNonNull(zzfsx);
        return new zzfvz(it, zzfsx);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final int size() {
        int i10 = 0;
        for (Object zza2 : this.zza) {
            if (this.zzb.zza(zza2)) {
                i10++;
            }
        }
        return i10;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfwc.zzc(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfwc.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
