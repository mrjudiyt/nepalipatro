package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;

/* compiled from: ActivityLifecycleTracker.kt */
public final class ActivityLifecycleTracker {
    private static final String INCORRECT_IMPL_WARNING = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";
    public static final ActivityLifecycleTracker INSTANCE = new ActivityLifecycleTracker();
    private static final long INTERRUPTION_THRESHOLD_MILLISECONDS = 1000;
    /* access modifiers changed from: private */
    public static final String TAG;
    /* access modifiers changed from: private */
    public static int activityReferences;
    private static String appId;
    private static WeakReference<Activity> currActivity;
    private static long currentActivityAppearTime;
    private static volatile ScheduledFuture<?> currentFuture;
    private static final Object currentFutureLock = new Object();
    private static volatile SessionInfo currentSession;
    private static final AtomicInteger foregroundActivityCount = new AtomicInteger(0);
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
    private static final AtomicBoolean tracking = new AtomicBoolean(false);

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
    }

    private ActivityLifecycleTracker() {
    }

    private final void cancelCurrentTask() {
        synchronized (currentFutureLock) {
            if (currentFuture != null) {
                ScheduledFuture<?> scheduledFuture = currentFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
            }
            currentFuture = null;
            q qVar = q.f16189a;
        }
    }

    public static final Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID getCurrentSessionGuid() {
        SessionInfo sessionInfo;
        if (currentSession == null || (sessionInfo = currentSession) == null) {
            return null;
        }
        return sessionInfo.getSessionId();
    }

    private final int getSessionTimeoutInSeconds() {
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery != null) {
            return appSettingsWithoutQuery.getSessionTimeoutInSeconds();
        }
        Constants constants = Constants.INSTANCE;
        return Constants.getDefaultAppEventsSessionTimeoutInSeconds();
    }

    public static final boolean isInBackground() {
        return activityReferences == 0;
    }

    public static final boolean isTracking() {
        return tracking.get();
    }

    public static final void onActivityCreated(Activity activity) {
        singleThreadExecutor.execute(e.f5989h);
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityCreated$lambda-1  reason: not valid java name */
    public static final void m59onActivityCreated$lambda1() {
        if (currentSession == null) {
            currentSession = SessionInfo.Companion.getStoredSessionInfo();
        }
    }

    /* access modifiers changed from: private */
    public final void onActivityDestroyed(Activity activity) {
        CodelessManager codelessManager = CodelessManager.INSTANCE;
        CodelessManager.onActivityDestroyed(activity);
    }

    /* access modifiers changed from: private */
    public final void onActivityPaused(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        Utility utility = Utility.INSTANCE;
        String activityName = Utility.getActivityName(activity);
        CodelessManager codelessManager = CodelessManager.INSTANCE;
        CodelessManager.onActivityPaused(activity);
        singleThreadExecutor.execute(new b(currentTimeMillis, activityName));
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityPaused$lambda-6  reason: not valid java name */
    public static final void m60onActivityPaused$lambda6(long j10, String str) {
        m.f(str, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), (Long) null, (UUID) null, 4, (g) null);
        }
        SessionInfo sessionInfo = currentSession;
        if (sessionInfo != null) {
            sessionInfo.setSessionLastEventTime(Long.valueOf(j10));
        }
        if (foregroundActivityCount.get() <= 0) {
            c cVar = new c(j10, str);
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(cVar, (long) INSTANCE.getSessionTimeoutInSeconds(), TimeUnit.SECONDS);
                q qVar = q.f16189a;
            }
        }
        long j11 = currentActivityAppearTime;
        long j12 = 0;
        if (j11 > 0) {
            j12 = (j10 - j11) / ((long) 1000);
        }
        AutomaticAnalyticsLogger automaticAnalyticsLogger = AutomaticAnalyticsLogger.INSTANCE;
        AutomaticAnalyticsLogger.logActivityTimeSpentEvent(str, j12);
        SessionInfo sessionInfo2 = currentSession;
        if (sessionInfo2 != null) {
            sessionInfo2.writeSessionToDisk();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityPaused$lambda-6$lambda-4  reason: not valid java name */
    public static final void m61onActivityPaused$lambda6$lambda4(long j10, String str) {
        m.f(str, "$activityName");
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), (Long) null, (UUID) null, 4, (g) null);
        }
        if (foregroundActivityCount.get() <= 0) {
            SessionLogger sessionLogger = SessionLogger.INSTANCE;
            SessionLogger.logDeactivateApp(str, currentSession, appId);
            SessionInfo.Companion.clearSavedSessionFromDisk();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            q qVar = q.f16189a;
        }
    }

    public static final void onActivityResumed(Activity activity) {
        m.f(activity, "activity");
        ActivityLifecycleTracker activityLifecycleTracker = INSTANCE;
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        activityLifecycleTracker.cancelCurrentTask();
        long currentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = currentTimeMillis;
        Utility utility = Utility.INSTANCE;
        String activityName = Utility.getActivityName(activity);
        CodelessManager codelessManager = CodelessManager.INSTANCE;
        CodelessManager.onActivityResumed(activity);
        MetadataIndexer metadataIndexer = MetadataIndexer.INSTANCE;
        MetadataIndexer.onActivityResumed(activity);
        SuggestedEventsManager suggestedEventsManager = SuggestedEventsManager.INSTANCE;
        SuggestedEventsManager.trackActivity(activity);
        InAppPurchaseManager inAppPurchaseManager = InAppPurchaseManager.INSTANCE;
        InAppPurchaseManager.startTracking();
        singleThreadExecutor.execute(new d(currentTimeMillis, activityName, activity.getApplicationContext()));
    }

    /* access modifiers changed from: private */
    /* renamed from: onActivityResumed$lambda-2  reason: not valid java name */
    public static final void m62onActivityResumed$lambda2(long j10, String str, Context context) {
        SessionInfo sessionInfo;
        m.f(str, "$activityName");
        SessionInfo sessionInfo2 = currentSession;
        Long sessionLastEventTime = sessionInfo2 == null ? null : sessionInfo2.getSessionLastEventTime();
        if (currentSession == null) {
            currentSession = new SessionInfo(Long.valueOf(j10), (Long) null, (UUID) null, 4, (g) null);
            SessionLogger sessionLogger = SessionLogger.INSTANCE;
            String str2 = appId;
            m.e(context, "appContext");
            SessionLogger.logActivateApp(str, (SourceApplicationInfo) null, str2, context);
        } else if (sessionLastEventTime != null) {
            long longValue = j10 - sessionLastEventTime.longValue();
            if (longValue > ((long) (INSTANCE.getSessionTimeoutInSeconds() * 1000))) {
                SessionLogger sessionLogger2 = SessionLogger.INSTANCE;
                SessionLogger.logDeactivateApp(str, currentSession, appId);
                String str3 = appId;
                m.e(context, "appContext");
                SessionLogger.logActivateApp(str, (SourceApplicationInfo) null, str3, context);
                currentSession = new SessionInfo(Long.valueOf(j10), (Long) null, (UUID) null, 4, (g) null);
            } else if (longValue > INTERRUPTION_THRESHOLD_MILLISECONDS && (sessionInfo = currentSession) != null) {
                sessionInfo.incrementInterruptionCount();
            }
        }
        SessionInfo sessionInfo3 = currentSession;
        if (sessionInfo3 != null) {
            sessionInfo3.setSessionLastEventTime(Long.valueOf(j10));
        }
        SessionInfo sessionInfo4 = currentSession;
        if (sessionInfo4 != null) {
            sessionInfo4.writeSessionToDisk();
        }
    }

    public static final void startTracking(Application application, String str) {
        m.f(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.INSTANCE;
            FeatureManager.checkFeature(FeatureManager.Feature.CodelessEvents, a.f5981a);
            appId = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleTracker$startTracking$2());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startTracking$lambda-0  reason: not valid java name */
    public static final void m63startTracking$lambda0(boolean z10) {
        if (z10) {
            CodelessManager codelessManager = CodelessManager.INSTANCE;
            CodelessManager.enable();
            return;
        }
        CodelessManager codelessManager2 = CodelessManager.INSTANCE;
        CodelessManager.disable();
    }
}
