package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdlx implements Callable {
    public final /* synthetic */ zzdlz zza;
    public final /* synthetic */ zzfde zzb;
    public final /* synthetic */ zzfcr zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdlx(zzdlz zzdlz, zzfde zzfde, zzfcr zzfcr, JSONObject jSONObject) {
        this.zza = zzdlz;
        this.zzb = zzfde;
        this.zzc = zzfcr;
        this.zzd = jSONObject;
    }

    public final Object call() {
        zzdjj zzdjj = new zzdjj();
        JSONObject jSONObject = this.zzd;
        zzdjj.zzaa(jSONObject.optInt("template_id", -1));
        zzdjj.zzK(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
        zzfde zzfde = this.zzb;
        zzdjj.zzV(optString);
        zzfdn zzfdn = zzfde.zza.zza;
        if (zzfdn.zzg.contains(Integer.toString(zzdjj.zzc()))) {
            if (zzdjj.zzc() == 3) {
                if (zzdjj.zzA() == null) {
                    throw new zzeir(1, "No custom template id for custom template ad response.");
                } else if (!zzfdn.zzh.contains(zzdjj.zzA())) {
                    throw new zzeir(1, "Unexpected custom template id in the response.");
                }
            }
            zzfcr zzfcr = this.zzc;
            zzdjj.zzY(jSONObject.optDouble("rating", -1.0d));
            String optString2 = jSONObject.optString("headline", (String) null);
            if (zzfcr.zzO) {
                zzt.zzp();
                optString2 = com.google.android.gms.ads.internal.util.zzt.zzx() + " : " + optString2;
            }
            zzdjj.zzZ("headline", optString2);
            zzdjj.zzZ("body", jSONObject.optString("body", (String) null));
            zzdjj.zzZ("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdjj.zzZ("store", jSONObject.optString("store", (String) null));
            zzdjj.zzZ(FirebaseAnalytics.Param.PRICE, jSONObject.optString(FirebaseAnalytics.Param.PRICE, (String) null));
            zzdjj.zzZ("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdjj;
        }
        throw new zzeir(1, "Invalid template ID: " + zzdjj.zzc());
    }
}
