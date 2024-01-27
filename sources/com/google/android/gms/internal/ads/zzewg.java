package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzewg implements zzetw {
    private final JSONObject zza;

    zzewg(Context context) {
        this.zza = zzbvq.zzc(context);
    }

    public final int zza() {
        return 46;
    }

    public final e zzb() {
        return zzfzt.zzh(new zzewf(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }
}
