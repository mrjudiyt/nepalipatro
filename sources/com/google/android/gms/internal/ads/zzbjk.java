package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbjk implements zzbjj {
    private final zzbjl zza;

    public zzbjk(zzbjl zzbjl) {
        this.zza = zzbjl;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        boolean equals = AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("transparentBackground"));
        boolean equals2 = AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzcat.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcgb.zzat(equals);
    }
}
