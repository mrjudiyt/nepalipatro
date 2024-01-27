package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbkq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.5.0 */
public final class H5AdsWebViewClient extends zzbkd {
    private final zzbkq zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new zzbkq(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    /* access modifiers changed from: protected */
    public WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
