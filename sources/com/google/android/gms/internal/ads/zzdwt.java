package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzdwt implements Callable {
    public final /* synthetic */ CookieManager zza;

    public /* synthetic */ zzdwt(CookieManager cookieManager) {
        this.zza = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return "";
        }
        return cookieManager.getCookie((String) zzba.zzc().zzb(zzbci.zzaM));
    }
}
