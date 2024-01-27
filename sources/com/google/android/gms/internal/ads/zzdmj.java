package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdmj implements zzfsk {
    public final /* synthetic */ zzdmm zza;
    public final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdmj(zzdmm zzdmm, JSONObject jSONObject) {
        this.zza = zzdmm;
        this.zzb = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zza.zza(this.zzb, (List) obj);
    }
}
