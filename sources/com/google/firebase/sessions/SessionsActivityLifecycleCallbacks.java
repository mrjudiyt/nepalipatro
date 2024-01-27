package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final SessionsActivityLifecycleCallbacks INSTANCE = new SessionsActivityLifecycleCallbacks();
    private static boolean hasPendingForeground;
    private static SessionLifecycleClient lifecycleClient;

    private SessionsActivityLifecycleCallbacks() {
    }

    public static /* synthetic */ void getHasPendingForeground$com_google_firebase_firebase_sessions$annotations() {
    }

    public final boolean getHasPendingForeground$com_google_firebase_firebase_sessions() {
        return hasPendingForeground;
    }

    public final SessionLifecycleClient getLifecycleClient() {
        return lifecycleClient;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        m.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        m.f(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.backgrounded();
        }
    }

    public void onActivityResumed(Activity activity) {
        q qVar;
        m.f(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.foregrounded();
            qVar = q.f16189a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            hasPendingForeground = true;
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
    }

    public final void setHasPendingForeground$com_google_firebase_firebase_sessions(boolean z10) {
        hasPendingForeground = z10;
    }

    public final void setLifecycleClient(SessionLifecycleClient sessionLifecycleClient) {
        lifecycleClient = sessionLifecycleClient;
        if (sessionLifecycleClient != null && hasPendingForeground) {
            hasPendingForeground = false;
            sessionLifecycleClient.foregrounded();
        }
    }
}
