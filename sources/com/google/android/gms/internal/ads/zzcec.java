package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzcec implements zzbjj {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdc zzcdc = (zzcdc) obj;
        zzcgx zzq = zzcdc.zzq();
        if (zzq == null) {
            try {
                zzcgx zzcgx = new zzcgx(zzcdc, Float.parseFloat((String) map.get("duration")), AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("customControlsAllowed")), AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("clickToExpandAllowed")));
                zzcdc.zzC(zzcgx);
                zzq = zzcgx;
            } catch (NullPointerException e10) {
                e = e10;
                zzcat.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                zzcat.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i10 = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i10 = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcat.zzm(3)) {
            zzcat.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i10 + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat2, parseFloat, i10, equals, parseFloat3);
    }
}
