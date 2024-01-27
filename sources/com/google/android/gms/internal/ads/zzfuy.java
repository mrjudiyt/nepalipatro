package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfuy extends AbstractSet {
    final /* synthetic */ zzfvb zza;

    zzfuy(zzfvb zzfvb) {
        this.zza = zzfvb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfvb zzfvb = this.zza;
        Map zzj = zzfvb.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new zzfus(zzfvb);
    }

    public final boolean remove(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.keySet().remove(obj);
        }
        return this.zza.zzs(obj) != zzfvb.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
