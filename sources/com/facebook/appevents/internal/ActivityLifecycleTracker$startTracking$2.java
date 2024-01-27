package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Logger;
import kotlin.jvm.internal.m;

/* compiled from: ActivityLifecycleTracker.kt */
public final class ActivityLifecycleTracker$startTracking$2 implements Application.ActivityLifecycleCallbacks {
    ActivityLifecycleTracker$startTracking$2() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityCreated");
        AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
        ActivityLifecycleTracker.onActivityCreated(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityDestroyed");
        ActivityLifecycleTracker.INSTANCE.onActivityDestroyed(activity);
    }

    public void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityPaused");
        AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker.INSTANCE.onActivityPaused(activity);
    }

    public void onActivityResumed(Activity activity) {
        m.f(activity, "activity");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityResumed");
        AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
        AppEventUtility.assertIsMainThread();
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
        ActivityLifecycleTracker.onActivityResumed(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
        m.f(bundle, "outState");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
        ActivityLifecycleTracker.activityReferences = ActivityLifecycleTracker.activityReferences + 1;
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStarted");
    }

    public void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, ActivityLifecycleTracker.TAG, "onActivityStopped");
        AppEventsLogger.Companion.onContextStop();
        ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.INSTANCE;
        ActivityLifecycleTracker.activityReferences = ActivityLifecycleTracker.activityReferences - 1;
    }
}
