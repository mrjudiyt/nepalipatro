package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: CustomTabUtils.kt */
public final class CustomTabUtils {
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final CustomTabUtils INSTANCE = new CustomTabUtils();

    private CustomTabUtils() {
    }

    public static final String getChromePackage() {
        Class<CustomTabUtils> cls = CustomTabUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            m.e(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet x10 = k.x(CHROME_PACKAGES);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && x10.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getDefaultRedirectURI() {
        Class<CustomTabUtils> cls = CustomTabUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            return m.o(Validate.CUSTOM_TAB_REDIRECT_URI_PREFIX, FacebookSdk.getApplicationContext().getPackageName());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final String getValidRedirectURI(String str) {
        Class<CustomTabUtils> cls = CustomTabUtils.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(str, "developerDefinedRedirectURI");
            Validate validate = Validate.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), str)) {
                return str;
            }
            return Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI()) ? getDefaultRedirectURI() : "";
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
