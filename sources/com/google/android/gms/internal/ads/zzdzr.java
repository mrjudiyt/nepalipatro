package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdzr implements zzfgu {
    public final /* synthetic */ JSONObject zza;
    public final /* synthetic */ zzbvj zzb;

    public /* synthetic */ zzdzr(JSONObject jSONObject, zzbvj zzbvj) {
        this.zza = jSONObject;
        this.zzb = zzbvj;
    }

    public final Object zza(Object obj) {
        return new zzeau(zzebi.zza(new InputStreamReader((InputStream) obj)), this.zza, this.zzb);
    }
}
