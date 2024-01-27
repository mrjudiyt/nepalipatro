package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public final class zzay extends zzj<zzay> {
    private final Map<Integer, Double> zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.zza.entrySet()) {
            String valueOf = String.valueOf(next.getKey());
            StringBuilder sb = new StringBuilder(valueOf.length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), next.getValue());
        }
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        ((zzay) zzj).zza.putAll(this.zza);
    }

    public final Map<Integer, Double> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
