package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzfkz implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfla zzc;

    zzfkz(zzfla zzfla, WebView webView, String str) {
        this.zzc = zzfla;
        this.zza = webView;
        this.zzb = str;
    }

    public final void run() {
        zzfla.zzi(this.zza, this.zzb);
    }
}
