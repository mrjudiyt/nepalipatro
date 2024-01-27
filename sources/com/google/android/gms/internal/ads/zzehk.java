package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzehk implements zzfza {
    public final /* synthetic */ zzeho zza;
    public final /* synthetic */ zzdoi zzb;

    public /* synthetic */ zzehk(zzeho zzeho, zzdoi zzdoi) {
        this.zza = zzeho;
        this.zzb = zzdoi;
    }

    public final e zza(Object obj) {
        return this.zza.zzd(this.zzb, (JSONObject) obj);
    }
}
