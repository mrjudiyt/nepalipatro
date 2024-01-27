package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzety implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzety(List list, Object obj) {
        this.zza = list;
        this.zzb = obj;
    }

    public final Object call() {
        Iterator it = this.zza.iterator();
        while (true) {
            Object obj = this.zzb;
            if (!it.hasNext()) {
                return obj;
            }
            zzetv zzetv = (zzetv) ((e) it.next()).get();
            if (zzetv != null) {
                zzetv.zzj(obj);
            }
        }
    }
}
