package com.facebook.appevents.iap;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.m;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 implements ServiceConnection {
    InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1() {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m.f(componentName, "name");
        m.f(iBinder, "service");
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
        InAppPurchaseEventManager inAppPurchaseEventManager = InAppPurchaseEventManager.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        InAppPurchaseActivityLifecycleTracker.inAppBillingObj = InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        m.f(componentName, "name");
    }
}
