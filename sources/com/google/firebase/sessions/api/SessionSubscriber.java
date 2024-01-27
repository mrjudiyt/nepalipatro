package com.google.firebase.sessions.api;

import kotlin.jvm.internal.m;

/* compiled from: SessionSubscriber.kt */
public interface SessionSubscriber {

    /* compiled from: SessionSubscriber.kt */
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    public static final class SessionDetails {
        private final String sessionId;

        public SessionDetails(String str) {
            m.f(str, "sessionId");
            this.sessionId = str;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final SessionDetails copy(String str) {
            m.f(str, "sessionId");
            return new SessionDetails(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && m.a(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);
}
