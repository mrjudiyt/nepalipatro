package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i10, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i10, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zzb() {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zzd());
        }
        return zzb;
    }
}
