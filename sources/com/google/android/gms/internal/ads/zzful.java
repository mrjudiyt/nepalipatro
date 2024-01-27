package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
abstract class zzful extends zzfuo implements Serializable {
    /* access modifiers changed from: private */
    public final transient Map zza;
    /* access modifiers changed from: private */
    public transient int zzb;

    protected zzful(Map map) {
        zzfsw.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(zzful zzful, Object obj) {
        Object obj2;
        try {
            obj2 = zzful.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzful.zzb -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection zza();

    /* access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    public final int zze() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final Collection zzf() {
        return new zzfun(this);
    }

    /* access modifiers changed from: package-private */
    public final Iterator zzg() {
        return new zzftv(this);
    }

    /* access modifiers changed from: package-private */
    public final List zzh(Object obj, List list, zzfui zzfui) {
        if (list instanceof RandomAccess) {
            return new zzfue(this, obj, list, zzfui);
        }
        return new zzfuk(this, obj, list, zzfui);
    }

    /* access modifiers changed from: package-private */
    public Map zzj() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfuc(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfuf(this, (SortedMap) map);
        }
        return new zzfty(this, map);
    }

    /* access modifiers changed from: package-private */
    public Set zzl() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfud(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfug(this, (SortedMap) map);
        }
        return new zzfub(this, map);
    }

    public final void zzp() {
        for (Collection clear : this.zza.values()) {
            clear.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza2 = zza();
            if (zza2.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.zzb++;
            return true;
        }
    }
}
