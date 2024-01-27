package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfva extends AbstractCollection {
    final /* synthetic */ zzfvb zza;

    zzfva(zzfvb zzfvb) {
        this.zza = zzfvb;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfvb zzfvb = this.zza;
        Map zzj = zzfvb.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzfuu(zzfvb);
    }

    public final int size() {
        return this.zza.size();
    }
}
