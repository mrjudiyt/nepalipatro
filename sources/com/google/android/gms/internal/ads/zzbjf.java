package com.google.android.gms.internal.ads;

import com.facebook.internal.NativeProtocol;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbjf implements zzbjj {
    zzbjf() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if ("pause".equals(str)) {
            zzcgb.zzbj();
        } else if ("resume".equals(str)) {
            zzcgb.zzbk();
        }
    }
}
