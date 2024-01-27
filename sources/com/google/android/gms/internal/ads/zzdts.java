package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzdts {
    /* access modifiers changed from: private */
    public Long zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public Integer zzd;
    /* access modifiers changed from: private */
    public String zze;
    /* access modifiers changed from: private */
    public Integer zzf;

    /* synthetic */ zzdts(String str, zzdtr zzdtr) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdts zzdts) {
        String str = (String) zzba.zzc().zzb(zzbci.zzjr);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdts.zza);
            jSONObject.put("eventCategory", zzdts.zzb);
            jSONObject.putOpt("event", zzdts.zzc);
            jSONObject.putOpt("errorCode", zzdts.zzd);
            jSONObject.putOpt("rewardType", zzdts.zze);
            jSONObject.putOpt("rewardAmount", zzdts.zzf);
        } catch (JSONException unused) {
            zzcat.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
