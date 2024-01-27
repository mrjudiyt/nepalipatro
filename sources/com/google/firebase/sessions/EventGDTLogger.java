package com.google.firebase.sessions;

import com.google.firebase.inject.Provider;
import g9.d;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import q3.b;
import q3.c;

/* compiled from: EventGDTLogger.kt */
public final class EventGDTLogger implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = "EventGDTLogger";
    private final Provider<q3.g> transportFactoryProvider;

    /* compiled from: EventGDTLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public EventGDTLogger(Provider<q3.g> provider) {
        m.f(provider, "transportFactoryProvider");
        this.transportFactoryProvider = provider;
    }

    /* access modifiers changed from: private */
    public final byte[] encode(SessionEvent sessionEvent) {
        String encode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        m.e(encode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        StringBuilder sb = new StringBuilder();
        sb.append("Session Event: ");
        sb.append(encode);
        byte[] bytes = encode.getBytes(d.f14759b);
        m.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public void log(SessionEvent sessionEvent) {
        m.f(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().a(AQS_LOG_SOURCE, SessionEvent.class, b.b("json"), new b(this)).a(c.d(sessionEvent));
    }
}
