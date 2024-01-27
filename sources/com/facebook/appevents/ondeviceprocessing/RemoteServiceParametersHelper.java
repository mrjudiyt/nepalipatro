package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.List;
import kotlin.jvm.internal.m;
import org.json.JSONArray;

/* compiled from: RemoteServiceParametersHelper.kt */
public final class RemoteServiceParametersHelper {
    public static final RemoteServiceParametersHelper INSTANCE = new RemoteServiceParametersHelper();
    private static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    private RemoteServiceParametersHelper() {
    }

    public static final Bundle buildEventsBundle(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> list) {
        Class<RemoteServiceParametersHelper> cls = RemoteServiceParametersHelper.class;
        if (CrashShieldHandler.isObjectCrashing(cls)) {
            return null;
        }
        try {
            m.f(eventType, "eventType");
            m.f(str, "applicationId");
            m.f(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray buildEventsJson = INSTANCE.buildEventsJson(list, str);
                if (buildEventsJson.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", buildEventsJson.toString());
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, cls);
            return null;
        }
    }

    private final JSONArray buildEventsJson(List<AppEvent> list, String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> T = x.T(list);
            EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
            EventDeactivationManager.processEvents(T);
            boolean includeImplicitEvents = includeImplicitEvents(str);
            for (AppEvent appEvent : T) {
                if (!appEvent.isChecksumValid()) {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd(TAG, m.o("Event with invalid checksum: ", appEvent));
                } else if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && includeImplicitEvents)) {
                    jSONArray.put(appEvent.getJsonObject());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean includeImplicitEvents(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(str, false);
            if (queryAppSettings != null) {
                return queryAppSettings.supportsImplicitLogging();
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
