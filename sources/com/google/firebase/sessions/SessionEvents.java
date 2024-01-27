package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: SessionEvents.kt */
public final class SessionEvents {
    public static final SessionEvents INSTANCE = new SessionEvents();
    private static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder build = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        m.e(build, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = build;
    }

    private SessionEvents() {
    }

    public static /* synthetic */ SessionEvent buildSession$default(SessionEvents sessionEvents, FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails processDetails, List list, Map map, String str, int i10, Object obj) {
        return sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, processDetails, list, (i10 & 32) != 0 ? h0.d() : map, (i10 & 64) != 0 ? "" : str);
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber sessionSubscriber) {
        if (sessionSubscriber == null) {
            return DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (sessionSubscriber.isDataCollectionEnabled()) {
            return DataCollectionState.COLLECTION_ENABLED;
        }
        return DataCollectionState.COLLECTION_DISABLED;
    }

    public final SessionEvent buildSession(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails processDetails, List<ProcessDetails> list, Map<SessionSubscriber.Name, ? extends SessionSubscriber> map, String str) {
        Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2 = map;
        m.f(firebaseApp, "firebaseApp");
        m.f(sessionDetails, "sessionDetails");
        m.f(sessionsSettings, "sessionsSettings");
        m.f(processDetails, "currentProcessDetails");
        m.f(list, "appProcessDetails");
        m.f(map2, "subscribers");
        String str2 = str;
        m.f(str2, "firebaseInstallationId");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState((SessionSubscriber) map2.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState((SessionSubscriber) map2.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), str2), getApplicationInfo(firebaseApp));
    }

    public final ApplicationInfo getApplicationInfo(FirebaseApp firebaseApp) {
        String str;
        m.f(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        m.e(applicationContext, "firebaseApp.applicationContext");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            str = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            str = String.valueOf(packageInfo.versionCode);
        }
        String str2 = str;
        String applicationId = firebaseApp.getOptions().getApplicationId();
        m.e(applicationId, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        m.e(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        m.e(str4, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        m.e(packageName, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        String str5 = packageInfo.versionName;
        String str6 = str5 == null ? str2 : str5;
        String str7 = Build.MANUFACTURER;
        m.e(str7, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        m.e(applicationContext2, "firebaseApp.applicationContext");
        ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        m.e(applicationContext3, "firebaseApp.applicationContext");
        return new ApplicationInfo(applicationId, str3, BuildConfig.VERSION_NAME, str4, logEnvironment, new AndroidApplicationInfo(packageName, str6, str2, str7, currentProcessDetails, processDetailsProvider.getAppProcessDetails(applicationContext3)));
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
