package com.google.firebase.sessions;

import androidx.privacysandbox.ads.adservices.topics.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SessionEvent.kt */
public final class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus2, String str3) {
        m.f(str, "sessionId");
        m.f(str2, "firstSessionId");
        m.f(dataCollectionStatus2, "dataCollectionStatus");
        m.f(str3, "firebaseInstallationId");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i10;
        this.eventTimestampUs = j10;
        this.dataCollectionStatus = dataCollectionStatus2;
        this.firebaseInstallationId = str3;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            i10 = sessionInfo.sessionIndex;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j10 = sessionInfo.eventTimestampUs;
        }
        long j11 = j10;
        if ((i11 & 16) != 0) {
            dataCollectionStatus2 = sessionInfo.dataCollectionStatus;
        }
        DataCollectionStatus dataCollectionStatus3 = dataCollectionStatus2;
        if ((i11 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        return sessionInfo.copy(str, str4, i12, j11, dataCollectionStatus3, str3);
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
        return this.eventTimestampUs;
    }

    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    public final String component6() {
        return this.firebaseInstallationId;
    }

    public final SessionInfo copy(String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus2, String str3) {
        m.f(str, "sessionId");
        m.f(str2, "firstSessionId");
        m.f(dataCollectionStatus2, "dataCollectionStatus");
        String str4 = str3;
        m.f(str4, "firebaseInstallationId");
        return new SessionInfo(str, str2, i10, j10, dataCollectionStatus2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return m.a(this.sessionId, sessionInfo.sessionId) && m.a(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && m.a(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && m.a(this.firebaseInstallationId, sessionInfo.firebaseInstallationId);
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
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

    public int hashCode() {
        return (((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + this.sessionIndex) * 31) + d.a(this.eventTimestampUs)) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", eventTimestampUs=" + this.eventTimestampUs + ", dataCollectionStatus=" + this.dataCollectionStatus + ", firebaseInstallationId=" + this.firebaseInstallationId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionInfo(String str, String str2, int i10, long j10, DataCollectionStatus dataCollectionStatus2, String str3, int i11, g gVar) {
        this(str, str2, i10, j10, (i11 & 16) != 0 ? new DataCollectionStatus((DataCollectionState) null, (DataCollectionState) null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 7, (g) null) : dataCollectionStatus2, (i11 & 32) != 0 ? "" : str3);
    }
}
