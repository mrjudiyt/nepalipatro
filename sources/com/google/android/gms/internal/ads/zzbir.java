package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbir implements zzbjj {
    zzbir() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfqz zzl = zzfra.zzl();
        zzl.zzb((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        zzl.zzh(zzcgb.getWidth());
        zzl.zzg(zzcgb.zzF().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            zzl.zzd(81);
        } else {
            zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zza((String) map.get("enifd"));
        }
        try {
            zzt.zzj().zzj(zzcgb, zzl.zzi());
        } catch (NullPointerException e10) {
            zzt.zzo().zzu(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
