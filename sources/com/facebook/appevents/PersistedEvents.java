package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: PersistedEvents.kt */
public final class PersistedEvents implements Serializable {
    public static final Companion Companion = new Companion((g) null);
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* compiled from: PersistedEvents.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: PersistedEvents.kt */
    public static final class SerializationProxyV1 implements Serializable {
        public static final Companion Companion = new Companion((g) null);
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        /* compiled from: PersistedEvents.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            m.f(hashMap, "proxyEvents");
            this.proxyEvents = hashMap;
        }

        private final Object readResolve() {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
                m.f(list, "appEvents");
                if (!this.events.containsKey(accessTokenAppIdPair)) {
                    this.events.put(accessTokenAppIdPair, x.T(list));
                    return;
                }
                List list2 = this.events.get(accessTokenAppIdPair);
                if (list2 != null) {
                    list2.addAll(list);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet = this.events.entrySet();
            m.e(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> keySet = this.events.keySet();
            m.e(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        m.f(hashMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap2 = new HashMap<>();
        this.events = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
