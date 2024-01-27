package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
public final class zzeem implements zzeen {
    static /* synthetic */ zzfkc zzc(String str, String str2, String str3, zzeeo zzeeo, String str4, WebView webView, String str5, String str6, zzeep zzeep) {
        zzfkm zza = zzfkm.zza("Google", str2);
        zzfkl zzm = zzm("javascript");
        zzfkh zzk = zzk(zzeeo.toString());
        zzfkl zzfkl = zzfkl.NONE;
        if (zzm == zzfkl) {
            zzcat.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            zzcat.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeeo)));
            return null;
        } else {
            zzfkl zzm2 = zzm(str4);
            if (zzk == zzfkh.zzd && zzm2 == zzfkl) {
                zzcat.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return zzfkc.zza(zzfkd.zza(zzk, zzl(zzeep.toString()), zzm, zzm2, true), zzfke.zzb(zza, webView, str5, ""));
        }
    }

    static /* synthetic */ zzfkc zzd(String str, String str2, String str3, String str4, zzeeo zzeeo, WebView webView, String str5, String str6, zzeep zzeep) {
        zzfkm zza = zzfkm.zza(str, str2);
        zzfkl zzm = zzm("javascript");
        zzfkl zzm2 = zzm(str4);
        zzfkh zzk = zzk(zzeeo.toString());
        zzfkl zzfkl = zzfkl.NONE;
        if (zzm == zzfkl) {
            zzcat.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            zzcat.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeeo)));
            return null;
        } else if (zzk == zzfkh.zzd && zzm2 == zzfkl) {
            zzcat.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return zzfkc.zza(zzfkd.zza(zzk, zzl(zzeep.toString()), zzm, zzm2, true), zzfke.zzc(zza, webView, str5, ""));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfkh zzk(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzfkh r4 = com.google.android.gms.internal.ads.zzfkh.zzd
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzfkh r4 = com.google.android.gms.internal.ads.zzfkh.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzfkh r4 = com.google.android.gms.internal.ads.zzfkh.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zzk(java.lang.String):com.google.android.gms.internal.ads.zzfkh");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzfkk zzl(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzfkk r4 = com.google.android.gms.internal.ads.zzfkk.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.zzfkk r4 = com.google.android.gms.internal.ads.zzfkk.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.zzfkk r4 = com.google.android.gms.internal.ads.zzfkk.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzfkk r4 = com.google.android.gms.internal.ads.zzfkk.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zzl(java.lang.String):com.google.android.gms.internal.ads.zzfkk");
    }

    private static zzfkl zzm(String str) {
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str)) {
            return zzfkl.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfkl.JAVASCRIPT;
        }
        return zzfkl.NONE;
    }

    private static final Object zzn(zzeel zzeel) {
        try {
            return zzeel.zza();
        } catch (RuntimeException e10) {
            zzt.zzo().zzt(e10, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            zzt.zzo().zzt(e10, "omid exception");
        }
    }

    public final zzfkc zza(String str, WebView webView, String str2, String str3, String str4, zzeep zzeep, zzeeo zzeeo, String str5) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue() || !zzfka.zzb()) {
            return null;
        }
        return (zzfkc) zzn(new zzeei("Google", str, "javascript", zzeeo, str4, webView, str5, "", zzeep));
    }

    public final zzfkc zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzeep zzeep, zzeeo zzeeo, String str6) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue() || !zzfka.zzb()) {
            return null;
        }
        return (zzfkc) zzn(new zzeef(str5, str, "javascript", str4, zzeeo, webView, str6, "", zzeep));
    }

    public final String zze(Context context) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue()) {
            return null;
        }
        return (String) zzn(zzeej.zza);
    }

    public final void zzf(zzfkc zzfkc, View view) {
        zzo(new zzeed(zzfkc, view));
    }

    public final void zzg(zzfkc zzfkc) {
        zzo(new zzeek(zzfkc));
    }

    public final void zzh(zzfkc zzfkc, View view) {
        zzo(new zzeee(zzfkc, view));
    }

    public final void zzi(zzfkc zzfkc) {
        if (((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue() && zzfka.zzb()) {
            zzfkc.getClass();
            zzo(new zzeeg(zzfkc));
        }
    }

    public final boolean zzj(Context context) {
        if (!((Boolean) zzba.zzc().zzb(zzbci.zzeS)).booleanValue()) {
            zzcat.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzn(new zzeeh(context));
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
