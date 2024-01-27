package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeji implements zzeew {
    private final Map zza = new HashMap();
    private final zzdqj zzb;

    public zzeji(zzdqj zzdqj) {
        this.zzb = zzdqj;
    }

    public final zzeex zza(String str, JSONObject jSONObject) {
        zzeex zzeex;
        synchronized (this) {
            zzeex = (zzeex) this.zza.get(str);
            if (zzeex == null) {
                zzeex = new zzeex(this.zzb.zzc(str, jSONObject), new zzegr(), str);
                this.zza.put(str, zzeex);
            }
        }
        return zzeex;
    }
}
