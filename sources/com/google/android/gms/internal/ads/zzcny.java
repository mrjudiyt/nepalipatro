package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcny implements zzcnl {
    zzcny() {
    }

    public final void zza(Map map) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzjC)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                zzt.zzo().zzh().zzI(Boolean.parseBoolean(str));
            }
        }
    }
}
