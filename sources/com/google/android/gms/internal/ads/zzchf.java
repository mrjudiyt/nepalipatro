package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchf extends zzche {
    public zzchf(zzcgb zzcgb, zzaxv zzaxv, boolean z10, zzedz zzedz) {
        super(zzcgb, zzaxv, z10, zzedz);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzN(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
