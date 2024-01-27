package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbip implements zzbjj {
    zzbip() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcgb zzcgb = (zzcgb) obj;
        zzbfb zzK = zzcgb.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcgb.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcgb.zze("nativeClickMetaReady", zzb);
        }
    }
}
