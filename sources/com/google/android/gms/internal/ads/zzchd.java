package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchd extends zzche {
    public zzchd(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzedz zzedz) {
        super(zzcgb, zzaxv, z10, zzedz);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, (Map) null);
    }
}
