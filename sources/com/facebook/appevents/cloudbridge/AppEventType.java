package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;
    
    public static final Companion Companion = null;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AppEventType invoke(String str) {
            m.f(str, "rawValue");
            if (m.a(str, "MOBILE_APP_INSTALL")) {
                return AppEventType.MOBILE_APP_INSTALL;
            }
            if (m.a(str, "CUSTOM_APP_EVENTS")) {
                return AppEventType.CUSTOM;
            }
            return AppEventType.OTHER;
        }
    }

    static {
        Companion = new Companion((g) null);
    }
}
