package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import o8.o;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerUtility.kt */
public final class AppEventsLoggerUtility {
    private static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = h0.e(o.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), o.a(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
    public static final AppEventsLoggerUtility INSTANCE = new AppEventsLoggerUtility();

    /* compiled from: AppEventsLoggerUtility.kt */
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private AppEventsLoggerUtility() {
    }

    public static final JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType graphAPIActivityType, AttributionIdentifiers attributionIdentifiers, String str, boolean z10, Context context) {
        m.f(graphAPIActivityType, "activityType");
        m.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(graphAPIActivityType));
        String userID = AppEventsLogger.Companion.getUserID();
        if (userID != null) {
            jSONObject.put("app_user_id", userID);
        }
        Utility utility = Utility.INSTANCE;
        Utility.setAppEventAttributionParameters(jSONObject, attributionIdentifiers, str, z10, context);
        try {
            Utility.setAppEventExtendedDeviceInfoParameters(jSONObject, context);
        } catch (Exception e10) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        Utility utility2 = Utility.INSTANCE;
        JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
        if (dataProcessingOptions != null) {
            Iterator<String> keys = dataProcessingOptions.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, dataProcessingOptions.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
