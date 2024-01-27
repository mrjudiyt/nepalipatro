package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdks implements zzbjj {
    public final /* synthetic */ zzdkv zza;

    public /* synthetic */ zzdks(zzdkv zzdkv) {
        this.zza = zzdkv;
    }

    public final void zza(Object obj, Map map) {
        zzcgb zzcgb = (zzcgb) obj;
        zzcgb.zzN().zzA(new zzdkp(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcgb.loadData(str, "text/html", "UTF-8");
        } else {
            zzcgb.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
