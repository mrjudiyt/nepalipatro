package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfr;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public class Tracker extends zzbs {
    private boolean zza;
    private final Map<String, String> zzb;
    private final Map<String, String> zzc = new HashMap();
    /* access modifiers changed from: private */
    public final zzez zzd;
    /* access modifiers changed from: private */
    public final zzv zze;
    private ExceptionReporter zzf;
    /* access modifiers changed from: private */
    public zzfr zzg;

    Tracker(zzbv zzbv, String str, zzez zzez) {
        super(zzbv);
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put("&a", Integer.toString(new Random().nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER) + 1));
        this.zzd = new zzez(60, 2000, "tracking", zzC());
        this.zze = new zzv(this, zzbv);
    }

    private static void zzZ(Map<String, String> map, Map<String, String> map2) {
        Preconditions.checkNotNull(map2);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String zzn = zzn(next);
                if (zzn != null) {
                    map2.put(zzn, (String) next.getValue());
                }
            }
        }
    }

    private static String zzn(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        if (!key.startsWith("&") || key.length() < 2) {
            return null;
        }
        return entry.getKey().substring(1);
    }

    public void enableAdvertisingIdCollection(boolean z10) {
        this.zza = z10;
    }

    public void enableAutoActivityTracking(boolean z10) {
        this.zze.zzc(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enableExceptionReporting(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.analytics.ExceptionReporter r0 = r2.zzf     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0007
            r1 = 0
            goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            if (r1 != r3) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            if (r3 == 0) goto L_0x0026
            android.content.Context r3 = r2.zzo()     // Catch:{ all -> 0x0034 }
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x0034 }
            com.google.android.gms.analytics.ExceptionReporter r1 = new com.google.android.gms.analytics.ExceptionReporter     // Catch:{ all -> 0x0034 }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0034 }
            r2.zzf = r1     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will be reported to Google Analytics"
            r2.zzO(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x0026:
            java.lang.Thread$UncaughtExceptionHandler r3 = r0.zza()     // Catch:{ all -> 0x0034 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Uncaught exceptions will not be reported to Google Analytics"
            r2.zzO(r3)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.Tracker.enableExceptionReporting(boolean):void");
    }

    public String get(String str) {
        zzW();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzb.containsKey(str)) {
            return this.zzb.get(str);
        }
        if (str.equals("&ul")) {
            return zzfs.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (str.equals("&aiid")) {
            return zzu().zza().zze();
        }
        return null;
    }

    public void send(Map<String, String> map) {
        long currentTimeMillis = zzC().currentTimeMillis();
        if (zzp().getAppOptOut()) {
            zzF("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean isDryRunEnabled = zzp().isDryRunEnabled();
        HashMap hashMap = new HashMap();
        zzZ(this.zzb, hashMap);
        zzZ(map, hashMap);
        String str = this.zzb.get("useSecure");
        int i10 = 1;
        boolean z10 = str == null || str.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_YES) || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_NO));
        Map<String, String> map2 = this.zzc;
        Preconditions.checkNotNull(hashMap);
        for (Map.Entry next : map2.entrySet()) {
            String zzn = zzn(next);
            if (zzn != null && !hashMap.containsKey(zzn)) {
                hashMap.put(zzn, (String) next.getValue());
            }
        }
        this.zzc.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            zzz().zzc(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            boolean z11 = this.zza;
            synchronized (this) {
                if ("screenview".equalsIgnoreCase(str2) || "pageview".equalsIgnoreCase(str2) || "appview".equalsIgnoreCase(str2) || TextUtils.isEmpty(str2)) {
                    String str4 = this.zzb.get("&a");
                    Preconditions.checkNotNull(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i10 = parseInt;
                    }
                    this.zzb.put("&a", Integer.toString(i10));
                }
            }
            zzq().zzi(new zzu(this, hashMap, z11, str2, currentTimeMillis, isDryRunEnabled, z10, str3));
            return;
        }
        zzz().zzc(hashMap, "Missing tracking id parameter");
    }

    public void set(String str, String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.zzb.put(str, str2);
        }
    }

    public void setAnonymizeIp(boolean z10) {
        set("&aip", zzfs.zzc(z10));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        String str;
        if (uri != null && !uri.isOpaque()) {
            String queryParameter = uri.getQueryParameter("referrer");
            if (!TextUtils.isEmpty(queryParameter)) {
                String valueOf = String.valueOf(queryParameter);
                if (valueOf.length() != 0) {
                    str = "http://hostname/?".concat(valueOf);
                } else {
                    str = new String("http://hostname/?");
                }
                Uri parse = Uri.parse(str);
                String queryParameter2 = parse.getQueryParameter("utm_id");
                if (queryParameter2 != null) {
                    this.zzc.put("&ci", queryParameter2);
                }
                String queryParameter3 = parse.getQueryParameter("anid");
                if (queryParameter3 != null) {
                    this.zzc.put("&anid", queryParameter3);
                }
                String queryParameter4 = parse.getQueryParameter("utm_campaign");
                if (queryParameter4 != null) {
                    this.zzc.put("&cn", queryParameter4);
                }
                String queryParameter5 = parse.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
                if (queryParameter5 != null) {
                    this.zzc.put("&cc", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter("utm_medium");
                if (queryParameter6 != null) {
                    this.zzc.put("&cm", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter("utm_source");
                if (queryParameter7 != null) {
                    this.zzc.put("&cs", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
                if (queryParameter8 != null) {
                    this.zzc.put("&ck", queryParameter8);
                }
                String queryParameter9 = parse.getQueryParameter("dclid");
                if (queryParameter9 != null) {
                    this.zzc.put("&dclid", queryParameter9);
                }
                String queryParameter10 = parse.getQueryParameter("gclid");
                if (queryParameter10 != null) {
                    this.zzc.put("&gclid", queryParameter10);
                }
                String queryParameter11 = parse.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (queryParameter11 != null) {
                    this.zzc.put("&aclid", queryParameter11);
                }
            }
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d10) {
        set("&sf", Double.toString(d10));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i10, int i11) {
        if (i10 >= 0 || i11 >= 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(i10);
            sb.append("x");
            sb.append(i11);
            set("&sr", sb.toString());
            return;
        }
        zzR("Invalid width or height. The values should be non-negative.");
    }

    public void setSessionTimeout(long j10) {
        this.zze.zze(j10 * 1000);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z10) {
        set("useSecure", zzfs.zzc(z10));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    /* access modifiers changed from: protected */
    public final void zzd() {
        this.zze.zzX();
        String zza2 = zzB().zza();
        if (zza2 != null) {
            set("&an", zza2);
        }
        String zzb2 = zzB().zzb();
        if (zzb2 != null) {
            set("&av", zzb2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzm(zzfr zzfr) {
        zzO("Loading Tracker config values");
        this.zzg = zzfr;
        String str = zzfr.zza;
        if (str != null) {
            set("&tid", str);
            zzP("trackingId loaded", str);
        }
        double d10 = zzfr.zzb;
        if (d10 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            String d11 = Double.toString(d10);
            set("&sf", d11);
            zzP("Sample frequency loaded", d11);
        }
        int i10 = zzfr.zzc;
        if (i10 >= 0) {
            setSessionTimeout((long) i10);
            zzP("Session timeout loaded", Integer.valueOf(i10));
        }
        int i11 = zzfr.zzd;
        boolean z10 = false;
        if (i11 != -1) {
            boolean z11 = 1 == i11;
            enableAutoActivityTracking(z11);
            zzP("Auto activity tracking loaded", Boolean.valueOf(z11));
        }
        int i12 = zzfr.zze;
        if (i12 != -1) {
            if (i12 != 0) {
                set("&aip", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            zzP("Anonymize ip loaded", Boolean.valueOf(1 == i12));
        }
        if (zzfr.zzf == 1) {
            z10 = true;
        }
        enableExceptionReporting(z10);
    }
}
