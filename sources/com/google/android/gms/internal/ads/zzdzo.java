package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdzo implements zzfsk {
    public final /* synthetic */ zzdzp zza;
    public final /* synthetic */ zzbvg zzb;

    public /* synthetic */ zzdzo(zzdzp zzdzp, zzbvg zzbvg) {
        this.zza = zzdzp;
        this.zzb = zzbvg;
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zzb.zza;
        if (bundle == null) {
            return jSONObject;
        }
        try {
            JSONObject zzh = zzay.zzb().zzh(bundle);
            try {
                zzay.zzb().zzk(jSONObject, zzh);
                return jSONObject;
            } catch (JSONException unused) {
                return zzh;
            }
        } catch (JSONException unused2) {
            return jSONObject;
        }
    }
}
