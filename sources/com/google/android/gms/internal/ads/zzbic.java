package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzbic implements zzbjj {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
        if ("tick".equals(str)) {
            String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                zzcat.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzcat.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzt.zzB().elapsedRealtime() + (Long.parseLong(str4) - zzt.zzB().currentTimeMillis());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzcgb.zzm().zzc(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e10) {
                    zzcat.zzk("Malformed timestamp for CSI tick.", e10);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzcat.zzj("No value given for CSI experiment.");
            } else {
                zzcgb.zzm().zza().zzd("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzcat.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzcat.zzj("No name given for CSI extra.");
            } else {
                zzcgb.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
