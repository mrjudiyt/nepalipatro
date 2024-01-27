package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    /* access modifiers changed from: private */
    public static void addEnvFields(Context context, JSONObject jSONObject, String str) {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(final Context context, final String str, double d10) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (!atomicBoolean.get() && Math.random() < d10) {
            atomicBoolean.set(true);
            new Thread() {
                /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|(2:8|(1:10)(1:33))|11|12|13|14|15) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0137 */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x0144 A[SYNTHETIC, Splitter:B:23:0x0144] */
                /* JADX WARNING: Removed duplicated region for block: B:27:0x014b A[SYNTHETIC, Splitter:B:27:0x014b] */
                /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r18 = this;
                        r0 = r18
                        java.lang.String r1 = "data"
                        java.lang.String r2 = ""
                        java.lang.String r3 = "0"
                        java.lang.String r4 = "attempt"
                        java.lang.String r5 = "UTF-8"
                        super.run()
                        r6 = 0
                        java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x0140 }
                        java.lang.String r8 = "https://www.facebook.com/adnw_logging/"
                        r7.<init>(r8)     // Catch:{ all -> 0x0140 }
                        java.net.URLConnection r7 = r7.openConnection()     // Catch:{ all -> 0x0140 }
                        java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0140 }
                        java.lang.String r8 = "POST"
                        r7.setRequestMethod(r8)     // Catch:{ all -> 0x013e }
                        java.lang.String r8 = "Content-Type"
                        java.lang.String r9 = "application/x-www-form-urlencoded;charset=UTF-8"
                        r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x013e }
                        java.lang.String r8 = "Accept"
                        java.lang.String r9 = "application/json"
                        r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x013e }
                        java.lang.String r8 = "Accept-Charset"
                        r7.setRequestProperty(r8, r5)     // Catch:{ all -> 0x013e }
                        java.lang.String r8 = "user-agent"
                        java.lang.String r9 = "[FBAN/AudienceNetworkForAndroid;FBSN/Android]"
                        r7.setRequestProperty(r8, r9)     // Catch:{ all -> 0x013e }
                        r8 = 1
                        r7.setDoOutput(r8)     // Catch:{ all -> 0x013e }
                        r7.setDoInput(r8)     // Catch:{ all -> 0x013e }
                        r7.connect()     // Catch:{ all -> 0x013e }
                        java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x013e }
                        java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x013e }
                        org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x013e }
                        r9.<init>()     // Catch:{ all -> 0x013e }
                        r9.put(r4, r3)     // Catch:{ all -> 0x013e }
                        android.content.Context r10 = r4     // Catch:{ all -> 0x013e }
                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(r10, r9, r8)     // Catch:{ all -> 0x013e }
                        org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x013e }
                        r10.<init>()     // Catch:{ all -> 0x013e }
                        java.lang.String r11 = "subtype"
                        java.lang.String r12 = "generic"
                        r10.put(r11, r12)     // Catch:{ all -> 0x013e }
                        java.lang.String r11 = "subtype_code"
                        java.lang.String r12 = "1320"
                        r10.put(r11, r12)     // Catch:{ all -> 0x013e }
                        java.lang.String r11 = "caught_exception"
                        java.lang.String r12 = "1"
                        r10.put(r11, r12)     // Catch:{ all -> 0x013e }
                        java.lang.String r11 = "stacktrace"
                        java.lang.String r12 = r5     // Catch:{ all -> 0x013e }
                        r10.put(r11, r12)     // Catch:{ all -> 0x013e }
                        org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x013e }
                        r11.<init>()     // Catch:{ all -> 0x013e }
                        java.lang.String r12 = "id"
                        java.util.UUID r13 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x013e }
                        java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x013e }
                        r11.put(r12, r13)     // Catch:{ all -> 0x013e }
                        java.lang.String r12 = "type"
                        java.lang.String r13 = "debug"
                        r11.put(r12, r13)     // Catch:{ all -> 0x013e }
                        java.lang.String r12 = "session_time"
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
                        r13.<init>()     // Catch:{ all -> 0x013e }
                        r13.append(r2)     // Catch:{ all -> 0x013e }
                        long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x013e }
                        r16 = 1000(0x3e8, double:4.94E-321)
                        long r14 = r14 / r16
                        r13.append(r14)     // Catch:{ all -> 0x013e }
                        java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x013e }
                        r11.put(r12, r13)     // Catch:{ all -> 0x013e }
                        java.lang.String r12 = "time"
                        java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
                        r13.<init>()     // Catch:{ all -> 0x013e }
                        r13.append(r2)     // Catch:{ all -> 0x013e }
                        long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x013e }
                        long r14 = r14 / r16
                        r13.append(r14)     // Catch:{ all -> 0x013e }
                        java.lang.String r2 = r13.toString()     // Catch:{ all -> 0x013e }
                        r11.put(r12, r2)     // Catch:{ all -> 0x013e }
                        java.lang.String r2 = "session_id"
                        r11.put(r2, r8)     // Catch:{ all -> 0x013e }
                        r11.put(r1, r10)     // Catch:{ all -> 0x013e }
                        r11.put(r4, r3)     // Catch:{ all -> 0x013e }
                        android.content.Context r2 = r4     // Catch:{ all -> 0x013e }
                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(r2, r10, r8)     // Catch:{ all -> 0x013e }
                        org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x013e }
                        r2.<init>()     // Catch:{ all -> 0x013e }
                        r2.put(r11)     // Catch:{ all -> 0x013e }
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x013e }
                        r3.<init>()     // Catch:{ all -> 0x013e }
                        r3.put(r1, r9)     // Catch:{ all -> 0x013e }
                        java.lang.String r1 = "events"
                        r3.put(r1, r2)     // Catch:{ all -> 0x013e }
                        java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x013e }
                        java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x013e }
                        java.io.OutputStream r3 = r7.getOutputStream()     // Catch:{ all -> 0x013e }
                        r2.<init>(r3)     // Catch:{ all -> 0x013e }
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013b }
                        r3.<init>()     // Catch:{ all -> 0x013b }
                        java.lang.String r4 = "payload="
                        r3.append(r4)     // Catch:{ all -> 0x013b }
                        java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)     // Catch:{ all -> 0x013b }
                        r3.append(r1)     // Catch:{ all -> 0x013b }
                        java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x013b }
                        r2.writeBytes(r1)     // Catch:{ all -> 0x013b }
                        r2.flush()     // Catch:{ all -> 0x013b }
                        r1 = 16384(0x4000, float:2.2959E-41)
                        byte[] r1 = new byte[r1]     // Catch:{ all -> 0x013b }
                        java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x013b }
                        r3.<init>()     // Catch:{ all -> 0x013b }
                        java.io.InputStream r6 = r7.getInputStream()     // Catch:{ all -> 0x013b }
                    L_0x0125:
                        int r4 = r6.read(r1)     // Catch:{ all -> 0x013b }
                        r5 = -1
                        if (r4 == r5) goto L_0x0131
                        r5 = 0
                        r3.write(r1, r5, r4)     // Catch:{ all -> 0x013b }
                        goto L_0x0125
                    L_0x0131:
                        r3.flush()     // Catch:{ all -> 0x013b }
                        r2.close()     // Catch:{ Exception -> 0x0137 }
                    L_0x0137:
                        r6.close()     // Catch:{ Exception -> 0x0152 }
                        goto L_0x0152
                    L_0x013b:
                        r1 = r6
                        r6 = r2
                        goto L_0x0142
                    L_0x013e:
                        r1 = r6
                        goto L_0x0142
                    L_0x0140:
                        r1 = r6
                        r7 = r1
                    L_0x0142:
                        if (r6 == 0) goto L_0x0149
                        r6.close()     // Catch:{ Exception -> 0x0148 }
                        goto L_0x0149
                    L_0x0148:
                    L_0x0149:
                        if (r1 == 0) goto L_0x0150
                        r1.close()     // Catch:{ Exception -> 0x014f }
                        goto L_0x0150
                    L_0x014f:
                    L_0x0150:
                        if (r7 == 0) goto L_0x0155
                    L_0x0152:
                        r7.disconnect()
                    L_0x0155:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.AnonymousClass1.run():void");
                }
            }.start();
        }
    }
}
