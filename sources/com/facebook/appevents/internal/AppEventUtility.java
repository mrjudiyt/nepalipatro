package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: AppEventUtility.kt */
public final class AppEventUtility {
    public static final AppEventUtility INSTANCE = new AppEventUtility();
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    private AppEventUtility() {
    }

    public static final void assertIsMainThread() {
    }

    public static final void assertIsNotMainThread() {
    }

    public static final String bytesToHex(byte[] bArr) {
        m.f(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            b0 b0Var = b0.f15559a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        m.e(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final String getAppVersion() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            m.e(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View getRootView(Activity activity) {
        Class<AppEventUtility> cls = AppEventUtility.class;
        if (CrashShieldHandler.isObjectCrashing(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (g9.p.v(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isEmulator() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = g9.p.v(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L_0x0073
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = g9.p.v(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = g9.q.y(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = g9.q.y(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = g9.q.y(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.m.e(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = g9.q.y(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.m.e(r0, r1)
            boolean r0 = g9.p.v(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.m.e(r0, r1)
            boolean r0 = g9.p.v(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
        L_0x006b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.m.a(r6, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.AppEventUtility.isEmulator():boolean");
    }

    private static final boolean isMainThread() {
        return m.a(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final double normalizePrice(String str) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(str);
            if (!matcher.find()) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            String group = matcher.group(0);
            Utility utility = Utility.INSTANCE;
            return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(group).doubleValue();
        } catch (ParseException unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }
}
