package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzwn implements Comparator {
    public static final /* synthetic */ zzwn zza = new zzwn();

    private /* synthetic */ zzwn() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        zzfvh zzj = zzfvh.zzj();
        zzxf zzxf = zzxf.zza;
        zzfvh zzb = zzj.zzc((zzxh) Collections.max(list, zzxf), (zzxh) Collections.max(list2, zzxf), zzxf).zzb(list.size(), list2.size());
        zzxg zzxg = zzxg.zza;
        return zzb.zzc((zzxh) Collections.max(list, zzxg), (zzxh) Collections.max(list2, zzxg), zzxg).zza();
    }
}
