package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzeat implements zzbnt {
    zzeat() {
    }

    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) {
        zzeau zzeau = (zzeau) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().zzb(zzbci.zziY)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzeau.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzeau.zzd.zzd());
        }
        jSONObject2.put("base_url", zzeau.zzd.zzb());
        jSONObject2.put("signals", zzeau.zzc);
        jSONObject3.put("body", zzeau.zzb.zzc);
        jSONObject3.put("headers", zzay.zzb().zzi(zzeau.zzb.zzb));
        jSONObject3.put("response_code", zzeau.zzb.zza);
        jSONObject3.put("latency", zzeau.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzeau.zzd.zzg());
        return jSONObject;
    }
}
