package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcnj {
    private final Map zza;
    private final Map zzb;

    zzcnj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfde zzfde) {
        for (zzfdc zzfdc : zzfde.zzb.zzc) {
            if (this.zza.containsKey(zzfdc.zza)) {
                ((zzcnm) this.zza.get(zzfdc.zza)).zza(zzfdc.zzb);
            } else if (this.zzb.containsKey(zzfdc.zza)) {
                zzcnl zzcnl = (zzcnl) this.zzb.get(zzfdc.zza);
                JSONObject jSONObject = zzfdc.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcnl.zza(hashMap);
            }
        }
    }
}
