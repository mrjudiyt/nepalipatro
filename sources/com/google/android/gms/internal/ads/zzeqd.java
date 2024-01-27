package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeqd implements zzetv {
    private final JSONObject zza;
    private final JSONObject zzb;

    public zzeqd(JSONObject jSONObject, JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = this.zza;
        Bundle bundle = (Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
