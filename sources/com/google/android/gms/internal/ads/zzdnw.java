package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdnw implements zzfza {
    public final /* synthetic */ zzdoi zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzdnw(zzdoi zzdoi, String str, JSONObject jSONObject) {
        this.zza = zzdoi;
        this.zzb = str;
        this.zzc = jSONObject;
    }

    public final e zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, (zzcgb) obj);
    }
}
