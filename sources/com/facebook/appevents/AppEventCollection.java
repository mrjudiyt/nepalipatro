package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: AppEventCollection.kt */
public final class AppEventCollection {
    private final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap = new HashMap<>();

    private final synchronized SessionEventsState getSessionEventsState(AccessTokenAppIdPair accessTokenAppIdPair) {
        SessionEventsState sessionEventsState = this.stateMap.get(accessTokenAppIdPair);
        if (sessionEventsState == null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            Context applicationContext = FacebookSdk.getApplicationContext();
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(applicationContext);
            if (attributionIdentifiers != null) {
                sessionEventsState = new SessionEventsState(attributionIdentifiers, AppEventsLogger.Companion.getAnonymousAppDeviceGUID(applicationContext));
            }
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppIdPair, sessionEventsState);
        return sessionEventsState;
    }

    public final synchronized void addEvent(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
        m.f(appEvent, "appEvent");
        SessionEventsState sessionEventsState = getSessionEventsState(accessTokenAppIdPair);
        if (sessionEventsState != null) {
            sessionEventsState.addEvent(appEvent);
        }
    }

    public final synchronized void addPersistedEvents(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (Map.Entry next : persistedEvents.entrySet()) {
                SessionEventsState sessionEventsState = getSessionEventsState((AccessTokenAppIdPair) next.getKey());
                if (sessionEventsState != null) {
                    for (AppEvent addEvent : (List) next.getValue()) {
                        sessionEventsState.addEvent(addEvent);
                    }
                }
            }
        }
    }

    public final synchronized SessionEventsState get(AccessTokenAppIdPair accessTokenAppIdPair) {
        m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.stateMap.get(accessTokenAppIdPair);
    }

    public final synchronized int getEventCount() {
        int i10;
        i10 = 0;
        for (SessionEventsState accumulatedEventCount : this.stateMap.values()) {
            i10 += accumulatedEventCount.getAccumulatedEventCount();
        }
        return i10;
    }

    public final synchronized Set<AccessTokenAppIdPair> keySet() {
        Set<AccessTokenAppIdPair> keySet;
        keySet = this.stateMap.keySet();
        m.e(keySet, "stateMap.keys");
        return keySet;
    }
}
