package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbio implements zzbjj {
    zzbio() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcgb zzcgb = (zzcgb) obj;
        zzbfb zzK = zzcgb.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcgb.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcgb.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
