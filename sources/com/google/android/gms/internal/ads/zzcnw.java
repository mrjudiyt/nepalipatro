package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcnw implements zzcnm {
    private final zzdvm zza;

    zzcnw(zzdvm zzdvm) {
        this.zza = zzdvm;
    }

    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zziV)).booleanValue()) {
                this.zza.zzm(jSONObject);
            }
        }
    }
}
