package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzang extends zzamu {
    static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String zzaly : (List) entry.getValue()) {
                    arrayList.add(new zzaly((String) entry.getKey(), zzaly));
                }
            }
        }
        return arrayList;
    }
}
