package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final /* synthetic */ class zzavs implements ValueCallback {
    public final /* synthetic */ zzavt zza;
    public final /* synthetic */ zzavl zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzavs(zzavt zzavt, zzavl zzavl, WebView webView, boolean z10) {
        this.zza = zzavt;
        this.zzb = zzavl;
        this.zzc = webView;
        this.zzd = z10;
    }

    public final void onReceiveValue(Object obj) {
        this.zza.zze.zzd(this.zzb, this.zzc, (String) obj, this.zzd);
    }
}
