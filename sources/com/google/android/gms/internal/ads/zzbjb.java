package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzbjb implements zzbjj {
    zzbjb() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        ((zzcgb) obj).zzal(AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("custom_close")));
    }
}
