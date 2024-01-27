package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzchb {
    private final zzchc zza;
    private final zzcha zzb;

    public zzchb(zzchc zzchc, zzcha zzcha) {
        this.zzb = zzcha;
        this.zza = zzchc;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzchj, com.google.android.gms.internal.ads.zzchc] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ? r02 = this.zza;
        zzaro zzI = r02.zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzark zzc = zzI.zzc();
        if (r02.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchc zzchc = this.zza;
        return zzc.zzf(zzchc.getContext(), str, (View) zzchc, zzchc.zzi());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzchj, com.google.android.gms.internal.ads.zzchc] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r02 = this.zza;
        zzaro zzI = r02.zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzark zzc = zzI.zzc();
        if (r02.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchc zzchc = this.zza;
        return zzc.zzh(zzchc.getContext(), (View) zzchc, zzchc.zzi());
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzcat.zzj("URL is empty, ignoring message");
        } else {
            zzt.zza.post(new zzcgz(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcgi zzaJ = ((zzcgu) this.zzb.zza).zzaJ();
        if (zzaJ == null) {
            zzcat.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
