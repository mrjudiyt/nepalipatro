package com.google.android.gms.internal.ads;

import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbiw implements zzbjj {
    zzbiw() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzfsc.zzc(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, str)) {
                if (!zzfsc.zzc("false", str)) {
                    return;
                }
            }
            zzfpx.zzi(zzcgb.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            zzt.zzo().zzu(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
