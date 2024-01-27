package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdna implements zzauw {
    public final /* synthetic */ zzcgb zza;

    public /* synthetic */ zzdna(zzcgb zzcgb) {
        this.zza = zzcgb;
    }

    public final void zzbt(zzauv zzauv) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != zzauv.zzj ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        this.zza.zzd("onAdVisibilityChanged", hashMap);
    }
}
