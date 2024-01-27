package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzdcz {
    protected final Map zza = new HashMap();

    protected zzdcz(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdev zzdev) {
        zzo(zzdev.zza, zzdev.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdev) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzt(zzdcy zzdcy) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdcx(zzdcy, entry.getKey()));
        }
    }
}
