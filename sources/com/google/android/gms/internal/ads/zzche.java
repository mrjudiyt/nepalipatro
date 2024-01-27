package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public class zzche extends zzcgi {
    public zzche(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzedz zzedz) {
        super(zzcgb, zzaxv, z10, new zzbrx(zzcgb, zzcgb.zzE(), new zzbbs(zzcgb.getContext())), (zzbrs) null, zzedz);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcgb)) {
            zzcat.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcgb zzcgb = (zzcgb) webView;
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            zzbxu.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcgb.zzN() != null) {
            zzcgb.zzN().zzE();
        }
        if (zzcgb.zzO().zzi()) {
            str2 = (String) zzba.zzc().zzb(zzbci.zzO);
        } else if (zzcgb.zzaA()) {
            str2 = (String) zzba.zzc().zzb(zzbci.zzN);
        } else {
            str2 = (String) zzba.zzc().zzb(zzbci.zzM);
        }
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzw(zzcgb.getContext(), zzcgb.zzn().zza, str2);
    }
}
