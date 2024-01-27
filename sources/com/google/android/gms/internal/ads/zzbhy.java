package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbhy implements zzbjj {
    private final zzbhz zza;

    public zzbhy(zzbhz zzbhz) {
        this.zza = zzbhz;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get("name");
            if (str == null) {
                zzcat.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbw.zza(new JSONObject((String) map.get("info")));
                } catch (JSONException e10) {
                    zzcat.zzh("Failed to convert ad metadata to JSON.", e10);
                }
            }
            if (bundle == null) {
                zzcat.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.zza.zza(str, bundle);
            }
        }
    }
}
