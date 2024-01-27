package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbw;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexl implements zzetv {
    private final String zza;

    public zzexl(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                zzbw.zzf(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e10) {
            zzcat.zzk("Failed putting trustless token.", e10);
        }
    }
}
