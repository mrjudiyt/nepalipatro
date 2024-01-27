package com.google.firebase.sessions;

import androidx.privacysandbox.ads.adservices.topics.d;
import kotlin.jvm.internal.m;

/* compiled from: SessionGenerator.kt */
public final class SessionDetails {
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public SessionDetails(String str, String str2, int i10, long j10) {
        m.f(str, "sessionId");
        m.f(str2, "firstSessionId");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i10 = sessionDetails.sessionIndex;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j10 = sessionDetails.sessionStartTimestampUs;
        }
        return sessionDetails.copy(str, str3, i12, j10);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    public final SessionDetails copy(String str, String str2, int i10, long j10) {
        m.f(str, "sessionId");
        m.f(str2, "firstSessionId");
        return new SessionDetails(str, str2, i10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return m.a(this.sessionId, sessionDetails.sessionId) && m.a(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + this.sessionIndex) * 31) + d.a(this.sessionStartTimestampUs);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }
}
