package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfud extends zzfug implements NavigableSet {
    final /* synthetic */ zzful zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfud(zzful zzful, NavigableMap navigableMap) {
        super(zzful, navigableMap);
        this.zzb = zzful;
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new zzfud(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return zzfwc.zza(iterator());
    }

    public final Object pollLast() {
        return zzfwc.zza(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SortedMap zza() {
        return (NavigableMap) ((SortedMap) this.zzd);
    }

    public final NavigableSet headSet(Object obj, boolean z10) {
        return new zzfud(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).headMap(obj, z10));
    }

    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new zzfud(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).subMap(obj, z10, obj2, z11));
    }

    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new zzfud(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).tailMap(obj, z10));
    }
}
