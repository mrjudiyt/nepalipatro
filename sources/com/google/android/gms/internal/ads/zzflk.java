package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzflk implements Runnable {
    final /* synthetic */ zzfll zza;
    private final WebView zzb;

    zzflk(zzfll zzfll) {
        this.zza = zzfll;
        this.zzb = zzfll.zza;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
