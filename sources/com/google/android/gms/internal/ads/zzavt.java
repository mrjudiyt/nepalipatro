package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzavt implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzavl zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzavv zze;

    zzavt(zzavv zzavv, zzavl zzavl, WebView webView, boolean z10) {
        this.zze = zzavv;
        this.zzb = zzavl;
        this.zzc = webView;
        this.zzd = z10;
        this.zza = new zzavs(this, zzavl, webView, z10);
    }

    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
