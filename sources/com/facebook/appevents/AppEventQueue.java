package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.a;

/* compiled from: AppEventQueue.kt */
public final class AppEventQueue {
    private static final int FLUSH_PERIOD_IN_SECONDS = 15;
    public static final AppEventQueue INSTANCE = new AppEventQueue();
    private static final int NO_CONNECTIVITY_ERROR_CODE = -1;
    private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
    private static final String TAG = AppEventQueue.class.getName();
    private static volatile AppEventCollection appEventCollection = new AppEventCollection();
    private static final Runnable flushRunnable = h.f5972h;
    private static ScheduledFuture<?> scheduledFuture;
    private static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    private AppEventQueue() {
    }

    public static final void add(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(accessTokenAppIdPair, "accessTokenAppId");
                m.f(appEvent, "appEvent");
                singleThreadExecutor.execute(new d(accessTokenAppIdPair, appEvent));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: add$lambda-3  reason: not valid java name */
    public static final void m25add$lambda3(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(accessTokenAppIdPair, "$accessTokenAppId");
                m.f(appEvent, "$appEvent");
                appEventCollection.addEvent(accessTokenAppIdPair, appEvent);
                if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.getEventCount() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                    flushAndWait(FlushReason.EVENT_THRESHOLD);
                } else if (scheduledFuture == null) {
                    scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final GraphRequest buildRequestForSession(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState, boolean z10, FlushStatistics flushStatistics) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(accessTokenAppIdPair, "accessTokenAppId");
            m.f(sessionEventsState, "appEvents");
            m.f(flushStatistics, "flushState");
            String applicationId = accessTokenAppIdPair.getApplicationId();
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            boolean z11 = false;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.Companion;
            b0 b0Var = b0.f15559a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            m.e(format, "java.lang.String.format(format, *args)");
            GraphRequest newPostRequest = companion.newPostRequest((AccessToken) null, format, (JSONObject) null, (GraphRequest.Callback) null);
            newPostRequest.setForceApplicationRequest(true);
            Bundle parameters = newPostRequest.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("access_token", accessTokenAppIdPair.getAccessTokenString());
            String pushNotificationsRegistrationId = InternalAppEventsLogger.Companion.getPushNotificationsRegistrationId();
            if (pushNotificationsRegistrationId != null) {
                parameters.putString("device_token", pushNotificationsRegistrationId);
            }
            String installReferrer = AppEventsLoggerImpl.Companion.getInstallReferrer();
            if (installReferrer != null) {
                parameters.putString("install_referrer", installReferrer);
            }
            newPostRequest.setParameters(parameters);
            if (queryAppSettings != null) {
                z11 = queryAppSettings.supportsImplicitLogging();
            }
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            int populateRequest = sessionEventsState.populateRequest(newPostRequest, FacebookSdk.getApplicationContext(), z11, z10);
            if (populateRequest == 0) {
                return null;
            }
            flushStatistics.setNumEvents(flushStatistics.getNumEvents() + populateRequest);
            newPostRequest.setCallback(new c(accessTokenAppIdPair, newPostRequest, sessionEventsState, flushStatistics));
            return newPostRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: buildRequestForSession$lambda-4  reason: not valid java name */
    public static final void m26buildRequestForSession$lambda4(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics, GraphResponse graphResponse) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(accessTokenAppIdPair, "$accessTokenAppId");
                m.f(graphRequest, "$postRequest");
                m.f(sessionEventsState, "$appEvents");
                m.f(flushStatistics, "$flushState");
                m.f(graphResponse, "response");
                handleResponse(accessTokenAppIdPair, graphRequest, graphResponse, sessionEventsState, flushStatistics);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final List<GraphRequest> buildRequests(AppEventCollection appEventCollection2, FlushStatistics flushStatistics) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(appEventCollection2, "appEventCollection");
            m.f(flushStatistics, "flushResults");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair next : appEventCollection2.keySet()) {
                SessionEventsState sessionEventsState = appEventCollection2.get(next);
                if (sessionEventsState != null) {
                    GraphRequest buildRequestForSession = buildRequestForSession(next, sessionEventsState, limitEventAndDataUsage, flushStatistics);
                    if (buildRequestForSession != null) {
                        arrayList.add(buildRequestForSession);
                        if (AppEventsCAPIManager.INSTANCE.isEnabled$facebook_core_release()) {
                            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = AppEventsConversionsAPITransformerWebRequests.INSTANCE;
                            AppEventsConversionsAPITransformerWebRequests.transformGraphRequestAndSendToCAPIGEndPoint(buildRequestForSession);
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void flush(FlushReason flushReason) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(flushReason, Constants.REASON);
                singleThreadExecutor.execute(new f(flushReason));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: flush$lambda-2  reason: not valid java name */
    public static final void m27flush$lambda2(FlushReason flushReason) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(flushReason, "$reason");
                flushAndWait(flushReason);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void flushAndWait(FlushReason flushReason) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(flushReason, Constants.REASON);
                AppEventDiskStore appEventDiskStore = AppEventDiskStore.INSTANCE;
                appEventCollection.addPersistedEvents(AppEventDiskStore.readAndClearStore());
                try {
                    FlushStatistics sendEventsToServer = sendEventsToServer(flushReason, appEventCollection);
                    if (sendEventsToServer != null) {
                        Intent intent = new Intent(AppEventsLogger.ACTION_APP_EVENTS_FLUSHED);
                        intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED, sendEventsToServer.getNumEvents());
                        intent.putExtra(AppEventsLogger.APP_EVENTS_EXTRA_FLUSH_RESULT, sendEventsToServer.getResult());
                        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                        a.b(FacebookSdk.getApplicationContext()).d(intent);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: flushRunnable$lambda-0  reason: not valid java name */
    public static final void m28flushRunnable$lambda0() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                scheduledFuture = null;
                if (AppEventsLogger.Companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                    flushAndWait(FlushReason.TIMER);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final Set<AccessTokenAppIdPair> getKeySet() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            return appEventCollection.keySet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    public static final void handleResponse(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, GraphResponse graphResponse, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        String str;
        AccessTokenAppIdPair accessTokenAppIdPair2 = accessTokenAppIdPair;
        SessionEventsState sessionEventsState2 = sessionEventsState;
        FlushStatistics flushStatistics2 = flushStatistics;
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(accessTokenAppIdPair2, "accessTokenAppId");
                m.f(graphRequest, "request");
                m.f(graphResponse, "response");
                m.f(sessionEventsState2, "appEvents");
                m.f(flushStatistics2, "flushState");
                FacebookRequestError error = graphResponse.getError();
                String str2 = "Success";
                FlushResult flushResult = FlushResult.SUCCESS;
                boolean z10 = true;
                if (error != null) {
                    if (error.getErrorCode() == -1) {
                        str2 = "Failed: No Connectivity";
                        flushResult = FlushResult.NO_CONNECTIVITY;
                    } else {
                        b0 b0Var = b0.f15559a;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{graphResponse.toString(), error.toString()}, 2));
                        m.e(str2, "java.lang.String.format(format, *args)");
                        flushResult = FlushResult.SERVER_ERROR;
                    }
                }
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) graphRequest.getTag()).toString(2);
                        m.e(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    String str3 = TAG;
                    m.e(str3, "TAG");
                    companion.log(loggingBehavior, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.getGraphObject()), str2, str);
                }
                if (error == null) {
                    z10 = false;
                }
                sessionEventsState2.clearInFlightAndStats(z10);
                FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
                if (flushResult == flushResult2) {
                    FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                    FacebookSdk.getExecutor().execute(new e(accessTokenAppIdPair2, sessionEventsState2));
                }
                if (flushResult != FlushResult.SUCCESS && flushStatistics.getResult() != flushResult2) {
                    flushStatistics2.setResult(flushResult);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleResponse$lambda-5  reason: not valid java name */
    public static final void m29handleResponse$lambda5(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                m.f(accessTokenAppIdPair, "$accessTokenAppId");
                m.f(sessionEventsState, "$appEvents");
                AppEventStore appEventStore = AppEventStore.INSTANCE;
                AppEventStore.persistEvents(accessTokenAppIdPair, sessionEventsState);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final void persistToDisk() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                singleThreadExecutor.execute(g.f5971h);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: persistToDisk$lambda-1  reason: not valid java name */
    public static final void m30persistToDisk$lambda1() {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                AppEventStore appEventStore = AppEventStore.INSTANCE;
                AppEventStore.persistEvents(appEventCollection);
                appEventCollection = new AppEventCollection();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static final FlushStatistics sendEventsToServer(FlushReason flushReason, AppEventCollection appEventCollection2) {
        Class<AppEventQueue> cls = AppEventQueue.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(flushReason, Constants.REASON);
            m.f(appEventCollection2, "appEventCollection");
            FlushStatistics flushStatistics = new FlushStatistics();
            List<GraphRequest> buildRequests = buildRequests(appEventCollection2, flushStatistics);
            if (!(!buildRequests.isEmpty())) {
                return null;
            }
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            m.e(str, "TAG");
            companion.log(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics.getNumEvents()), flushReason.toString());
            for (GraphRequest executeAndWait : buildRequests) {
                executeAndWait.executeAndWait();
            }
            return flushStatistics;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }
}
