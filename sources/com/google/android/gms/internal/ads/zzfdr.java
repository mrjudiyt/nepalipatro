package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfdr {
    public static zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfcs zzfcs = (zzfcs) it.next();
            if (zzfcs.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfcs.zza, zzfcs.zzb));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfcs zzb(zzq zzq) {
        return zzq.zzi ? new zzfcs(-3, 0, true) : new zzfcs(zzq.zze, zzq.zzb, false);
    }
}
