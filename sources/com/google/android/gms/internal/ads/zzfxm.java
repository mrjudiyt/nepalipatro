package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfxm extends zzfxl implements SortedSet {
    zzfxm(SortedSet sortedSet, zzfsx zzfsx) {
        super(sortedSet, zzfsx);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        Objects.requireNonNull(it);
        zzfsx zzfsx = this.zzb;
        Objects.requireNonNull(zzfsx);
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfsx.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzfxm(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            zzfsx zzfsx = this.zzb;
            Object last = sortedSet.last();
            if (zzfsx.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfxm(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzfxm(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
