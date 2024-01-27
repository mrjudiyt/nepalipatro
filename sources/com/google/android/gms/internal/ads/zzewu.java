package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzewu implements zzetv {
    private final Bundle zza;

    public zzewu(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                zzbw.zzf(zzbw.zzf(jSONObject, DeviceRequestsHelper.DEVICE_INFO_DEVICE), "play_store").put("parental_controls", zzay.zzb().zzh(this.zza));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
