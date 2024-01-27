package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzedz;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzu extends zzab {
    public zzu() {
        super((zzaa) null);
    }

    public final int zza() {
        return 16974374;
    }

    public final CookieManager zzb(Context context) {
        zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcat.zzh("Failed to obtain CookieManager.", th);
            zzt.zzo().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    public final zzcgi zzd(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzedz zzedz) {
        return new zzchf(zzcgb, zzaxv, z10, zzedz);
    }
}
