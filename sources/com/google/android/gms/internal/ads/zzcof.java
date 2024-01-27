package com.google.android.gms.internal.ads;

import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcof implements zzcnm {
    private final zzbya zza;

    zzcof(zzbya zzbya) {
        this.zza = zzbya;
    }

    public final void zza(JSONObject jSONObject) {
        int i10;
        long optLong = jSONObject.optLong(Constants.TIMESTAMP);
        if (jSONObject.optBoolean("npa_reset")) {
            i10 = -1;
        } else {
            i10 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(i10, optLong);
    }
}
