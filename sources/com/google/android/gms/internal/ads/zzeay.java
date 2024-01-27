package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzeay implements zzfza {
    public static final /* synthetic */ zzeay zza = new zzeay();

    private /* synthetic */ zzeay() {
    }

    public final e zza(Object obj) {
        zzebi zzebi = (zzebi) obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", zzebi.zza);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : zzebi.zzb.keySet()) {
                if (str != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str2 : (List) zzebi.zzb.get(str)) {
                        if (str2 != null) {
                            jSONArray.put(str2);
                        }
                    }
                    jSONObject2.put(str, jSONArray);
                }
            }
            jSONObject.put("headers", jSONObject2);
            String str3 = zzebi.zzc;
            if (str3 != null) {
                jSONObject.put("body", str3);
            }
            jSONObject.put("latency", zzebi.zzd);
            return zzfzt.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (JSONException e10) {
            zzcat.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e10.getMessage())));
            throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e10.getCause())));
        }
    }
}
