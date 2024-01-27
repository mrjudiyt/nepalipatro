package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbtb {
    public final boolean zza;
    public final String zzb;

    public zzbtb(boolean z10, String str) {
        this.zza = z10;
        this.zzb = str;
    }

    public static zzbtb zza(JSONObject jSONObject) {
        return new zzbtb(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
