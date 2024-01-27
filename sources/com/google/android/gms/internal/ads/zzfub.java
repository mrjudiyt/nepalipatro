package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
class zzfub extends zzfwk {
    final /* synthetic */ zzful zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfub(zzful zzful, Map map) {
        super(map);
        this.zza = zzful;
    }

    public final void clear() {
        zzfwc.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzfua(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzful zzful = this.zza;
        zzful.zzb = zzful.zzb - size;
        return size > 0;
    }
}
