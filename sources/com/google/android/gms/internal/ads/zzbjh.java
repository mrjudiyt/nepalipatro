package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbjh implements zzbjj {
    zzbjh() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        if (map.keySet().contains("start")) {
            zzcgb.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcgb.zzas(false);
        }
    }
}
