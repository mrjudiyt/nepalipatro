package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzfke {
    private final zzfkm zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfkf zzg;

    private zzfke(zzfkm zzfkm, WebView webView, String str, List list, String str2, String str3, zzfkf zzfkf) {
        this.zza = zzfkm;
        this.zzb = webView;
        this.zzg = zzfkf;
        this.zzf = str2;
        this.zze = "";
    }

    public static zzfke zzb(zzfkm zzfkm, WebView webView, String str, String str2) {
        return new zzfke(zzfkm, webView, (String) null, (List) null, str, "", zzfkf.HTML);
    }

    public static zzfke zzc(zzfkm zzfkm, WebView webView, String str, String str2) {
        return new zzfke(zzfkm, webView, (String) null, (List) null, str, "", zzfkf.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfkf zzd() {
        return this.zzg;
    }

    public final zzfkm zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
