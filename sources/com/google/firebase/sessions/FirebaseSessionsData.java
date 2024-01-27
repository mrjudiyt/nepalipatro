package com.google.firebase.sessions;

import kotlin.jvm.internal.m;

/* compiled from: SessionDatastore.kt */
public final class FirebaseSessionsData {
    private final String sessionId;

    public FirebaseSessionsData(String str) {
        this.sessionId = str;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData firebaseSessionsData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = firebaseSessionsData.sessionId;
        }
        return firebaseSessionsData.copy(str);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final FirebaseSessionsData copy(String str) {
        return new FirebaseSessionsData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && m.a(this.sessionId, ((FirebaseSessionsData) obj).sessionId);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.sessionId + ')';
    }
}
