package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbiv implements zzbjj {
    zzbiv() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        try {
            zzfpw.zzj(zzcgb.getContext()).zzk();
            zzfpx.zzi(zzcgb.getContext()).zzj();
        } catch (IOException e10) {
            zzt.zzo().zzu(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
