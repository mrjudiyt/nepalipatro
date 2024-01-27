package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzebn {
    private final zzbvr zza;

    zzebn(zzbvr zzbvr) {
        this.zza = zzbvr;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    return;
                }
                return;
            }
            zze.zza("DSID signal does not exist.");
        }
    }

    public final void zzb() {
        zzcbj.zza(this.zza.zza(), "persistFlags");
    }
}
