package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdxr implements zzfza {
    public final /* synthetic */ zzdxu zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdxr(zzdxu zzdxu, String str, String str2) {
        this.zza = zzdxu;
        this.zzb = str;
        this.zzc = str2;
    }

    public final e zza(Object obj) {
        String str = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str2 = this.zzb;
        String str3 = this.zzc;
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str2);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str3));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzfzt.zzh(jSONObject);
        } catch (JSONException e10) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
        }
    }
}
