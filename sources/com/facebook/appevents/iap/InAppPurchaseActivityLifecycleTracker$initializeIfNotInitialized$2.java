package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 implements Application.ActivityLifecycleCallbacks {
    InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-0  reason: not valid java name */
    public static final void m54onActivityResumed$lambda0() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
        ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, purchasesInapp, false);
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, InAppPurchaseEventManager.getPurchasesSubs(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityStopped$lambda-1  reason: not valid java name */
    public static final void m55onActivityStopped$lambda1() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
        ArrayList<String> purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
        if (purchasesInapp.isEmpty()) {
            purchasesInapp = InAppPurchaseEventManager.getPurchaseHistoryInapp(applicationContext, InAppPurchaseActivityLifecycleTracker.inAppBillingObj);
        }
        InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, purchasesInapp, false);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        m.f(activity, "activity");
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.getExecutor().execute(a.f5975h);
        } catch (Exception unused) {
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
        m.f(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
        try {
            if (m.a(InAppPurchaseActivityLifecycleTracker.hasBillingActivity, Boolean.TRUE) && m.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(b.f5976h);
            }
        } catch (Exception unused) {
        }
    }
}
