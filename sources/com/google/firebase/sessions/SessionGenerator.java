package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import y8.a;

/* compiled from: SessionGenerator.kt */
public final class SessionGenerator {
    public static final Companion Companion = new Companion((g) null);
    private SessionDetails currentSession;
    private final String firstSessionId;
    private int sessionIndex;
    private final TimeProvider timeProvider;
    private final a<UUID> uuidGenerator;

    /* compiled from: SessionGenerator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            m.e(obj, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) obj;
        }
    }

    public SessionGenerator(TimeProvider timeProvider2, a<UUID> aVar) {
        m.f(timeProvider2, "timeProvider");
        m.f(aVar, "uuidGenerator");
        this.timeProvider = timeProvider2;
        this.uuidGenerator = aVar;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    private final String generateSessionId() {
        String uuid = this.uuidGenerator.invoke().toString();
        m.e(uuid, "uuidGenerator().toString()");
        String lowerCase = p.t(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        m.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final SessionDetails generateNewSession() {
        int i10 = this.sessionIndex + 1;
        this.sessionIndex = i10;
        this.currentSession = new SessionDetails(i10 == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        m.x("currentSession");
        return null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionGenerator(TimeProvider timeProvider2, a aVar, int i10, g gVar) {
        this(timeProvider2, (i10 & 2) != 0 ? AnonymousClass1.INSTANCE : aVar);
    }
}
