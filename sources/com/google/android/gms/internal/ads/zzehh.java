package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzehh implements zzeew {
    private final zzdqj zza;

    public zzehh(zzdqj zzdqj) {
        this.zza = zzdqj;
    }

    public final zzeex zza(String str, JSONObject jSONObject) {
        return new zzeex(this.zza.zzc(str, jSONObject), new zzegq(), str);
    }
}
