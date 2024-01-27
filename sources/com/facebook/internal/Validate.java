package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;

/* compiled from: Validate.kt */
public final class Validate {
    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    public static final Validate INSTANCE = new Validate();
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    private static final String TAG = Validate.class.getName();

    private Validate() {
    }

    public static final void containsNoNullOrEmpty(Collection<String> collection, String str) {
        boolean z10;
        m.f(collection, "container");
        m.f(str, "name");
        for (String next : collection) {
            if (next != null) {
                if (next.length() > 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Container '" + str + "' cannot contain empty values").toString());
                }
            } else {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final <T> void containsNoNulls(Collection<? extends T> collection, String str) {
        m.f(collection, "container");
        m.f(str, "name");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    public static final String hasAppID() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            return applicationId;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    public static final boolean hasBluetoothPermission(Context context) {
        m.f(context, "context");
        return hasPermission(context, "android.permission.BLUETOOTH") && hasPermission(context, "android.permission.BLUETOOTH_ADMIN");
    }

    public static final boolean hasChangeWifiStatePermission(Context context) {
        m.f(context, "context");
        return hasPermission(context, "android.permission.CHANGE_WIFI_STATE");
    }

    public static final String hasClientToken() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String clientToken = FacebookSdk.getClientToken();
        if (clientToken != null) {
            return clientToken;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
    }

    public static final void hasContentProvider(Context context) {
        m.f(context, "context");
        String hasAppID = hasAppID();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            String o10 = m.o(CONTENT_PROVIDER_BASE, hasAppID);
            if (packageManager.resolveContentProvider(o10, 0) == null) {
                b0 b0Var = b0.f15559a;
                String format = String.format(CONTENT_PROVIDER_NOT_FOUND_REASON, Arrays.copyOf(new Object[]{o10}, 1));
                m.e(format, "java.lang.String.format(format, *args)");
                throw new IllegalStateException(format.toString());
            }
        }
    }

    public static final boolean hasCustomTabRedirectActivity(Context context, String str) {
        List<ResolveInfo> list;
        m.f(context, "context");
        m.f(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z10 = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!m.a(activityInfo.name, "com.facebook.CustomTabActivity") || !m.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void hasFacebookActivity(Context context) {
        m.f(context, "context");
        hasFacebookActivity(context, true);
    }

    public static final void hasInternetPermissions(Context context) {
        m.f(context, "context");
        hasInternetPermissions(context, true);
    }

    public static final boolean hasLocationPermission(Context context) {
        m.f(context, "context");
        return hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static final boolean hasPermission(Context context, String str) {
        m.f(context, "context");
        m.f(str, "permission");
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static final boolean hasWiFiPermission(Context context) {
        m.f(context, "context");
        return hasPermission(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public static final <T> void notEmpty(Collection<? extends T> collection, String str) {
        m.f(collection, "container");
        m.f(str, "name");
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException(("Container '" + str + "' cannot be empty").toString());
        }
    }

    public static final <T> void notEmptyAndContainsNoNulls(Collection<? extends T> collection, String str) {
        m.f(collection, "container");
        m.f(str, "name");
        containsNoNulls(collection, str);
        notEmpty(collection, str);
    }

    public static final void notNull(Object obj, String str) {
        m.f(str, "name");
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if ((r3.length() > 0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String notNullOrEmpty(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "name"
            kotlin.jvm.internal.m.f(r4, r0)
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0015
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x0011
            r2 = 1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Argument '"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = "' cannot be null or empty"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Validate.notNullOrEmpty(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final void oneOf(Object obj, String str, Object... objArr) {
        m.f(str, "name");
        m.f(objArr, "values");
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj2 = objArr[i10];
            i10++;
            if (m.a(obj2, obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Argument '" + str + "' was not one of the allowed values");
    }

    public static final void runningOnUiThread() {
        if (!m.a(Looper.getMainLooper(), Looper.myLooper())) {
            throw new FacebookException("This method should be called from the UI thread");
        }
    }

    public static final void sdkInitialized() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void hasFacebookActivity(android.content.Context r4, boolean r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.m.f(r4, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            if (r4 != 0) goto L_0x002c
            r4 = r5 ^ 1
            if (r4 == 0) goto L_0x0020
            goto L_0x002c
        L_0x0020:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Validate.hasFacebookActivity(android.content.Context, boolean):void");
    }

    public static final void hasInternetPermissions(Context context, boolean z10) {
        m.f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && !(!z10)) {
            throw new IllegalStateException(NO_INTERNET_PERMISSION_REASON.toString());
        }
    }

    public static final void notEmpty(String str, String str2) {
        m.f(str, "arg");
        m.f(str2, "name");
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException(("Argument '" + str2 + "' cannot be empty").toString());
        }
    }
}
