package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzflj extends WebViewClient {
    final String zza = "OMID NativeBridge WebViewClient";
    final /* synthetic */ zzfll zzb;

    zzflj(zzfll zzfll) {
        this.zzb = zzfll;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        if (this.zzb.zza() != webView) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        this.zzb.zzj((WebView) null);
        webView.destroy();
        return true;
    }
}
