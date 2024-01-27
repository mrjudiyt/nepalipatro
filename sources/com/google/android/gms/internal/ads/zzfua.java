package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfua implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfub zzc;

    zzfua(zzfub zzfub, Iterator it) {
        this.zzc = zzfub;
        this.zzb = it;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    public final void remove() {
        zzfsw.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzful zzful = this.zzc.zza;
        zzful.zzb = zzful.zzb - collection.size();
        collection.clear();
        this.zza = null;
    }
}
