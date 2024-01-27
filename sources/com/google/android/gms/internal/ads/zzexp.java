package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzexp implements zzetv {
    private final Map zza;

    public zzexp(Map map) {
        this.zza = map;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzay.zzb().zzi(this.zza));
        } catch (JSONException e10) {
            zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
