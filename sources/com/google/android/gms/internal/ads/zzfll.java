package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfll extends zzflh {
    /* access modifiers changed from: private */
    public WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfll(Map map, String str) {
        this.zzc = map;
    }

    public final void zzc() {
        long j10;
        super.zzc();
        if (this.zzb == null) {
            j10 = 4000;
        } else {
            j10 = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzflk(this), Math.max(4000 - j10, 2000));
        this.zza = null;
    }

    public final void zzg(zzfkg zzfkg, zzfke zzfke) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfke.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzh(zzfkg, zzfke, jSONObject);
        } else {
            zzfkn zzfkn = (zzfkn) zzi.get((String) it.next());
            throw null;
        }
    }

    public final void zzk() {
        WebView webView = new WebView(zzfky.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzflj(this));
        zzj(this.zza);
        zzfla.zzi(this.zza, (String) null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfkn zzfkn = (zzfkn) this.zzc.get((String) it.next());
        throw null;
    }
}
