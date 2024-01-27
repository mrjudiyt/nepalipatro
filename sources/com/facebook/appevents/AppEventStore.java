package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.jvm.internal.m;

/* compiled from: AppEventStore.kt */
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String TAG = AppEventStore.class.getName();

    private AppEventStore() {
    }

    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        Class<AppEventStore> cls = AppEventStore.class;
        synchronized (cls) {
            if (!CrashShieldHandler.isObjectCrashing(cls)) {
                try {
                    m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
                    m.f(sessionEventsState, "appEvents");
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    AppEventUtility.assertIsNotMainThread();
                    AppEventDiskStore appEventDiskStore = AppEventDiskStore.INSTANCE;
                    PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
                    readAndClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                    AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                }
            }
        }
    }

    public static final synchronized void persistEvents(AppEventCollection appEventCollection) {
        Class<AppEventStore> cls = AppEventStore.class;
        synchronized (cls) {
            if (!CrashShieldHandler.isObjectCrashing(cls)) {
                try {
                    m.f(appEventCollection, "eventsToPersist");
                    AppEventUtility appEventUtility = AppEventUtility.INSTANCE;
                    AppEventUtility.assertIsNotMainThread();
                    AppEventDiskStore appEventDiskStore = AppEventDiskStore.INSTANCE;
                    PersistedEvents readAndClearStore = AppEventDiskStore.readAndClearStore();
                    for (AccessTokenAppIdPair next : appEventCollection.keySet()) {
                        SessionEventsState sessionEventsState = appEventCollection.get(next);
                        if (sessionEventsState != null) {
                            readAndClearStore.addEvents(next, sessionEventsState.getEventsToPersist());
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    AppEventDiskStore appEventDiskStore2 = AppEventDiskStore.INSTANCE;
                    AppEventDiskStore.saveEventsToDisk$facebook_core_release(readAndClearStore);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, cls);
                }
            }
        }
    }
}
