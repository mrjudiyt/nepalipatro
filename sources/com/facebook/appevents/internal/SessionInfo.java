package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SessionInfo.kt */
public final class SessionInfo {
    public static final Companion Companion = new Companion((g) null);
    private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
    private Long diskRestoreTime;
    /* access modifiers changed from: private */
    public int interruptionCount;
    private UUID sessionId;
    private Long sessionLastEventTime;
    private final Long sessionStartTime;
    private SourceApplicationInfo sourceApplicationInfo;

    /* compiled from: SessionInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void clearSavedSessionFromDisk() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.remove(SessionInfo.LAST_SESSION_INFO_START_KEY);
            edit.remove(SessionInfo.LAST_SESSION_INFO_END_KEY);
            edit.remove(SessionInfo.INTERRUPTION_COUNT_KEY);
            edit.remove(SessionInfo.SESSION_ID_KEY);
            edit.apply();
            SourceApplicationInfo.Companion.clearSavedSourceApplicationInfoFromDisk();
        }

        public final SessionInfo getStoredSessionInfo() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j10 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_START_KEY, 0);
            long j11 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_END_KEY, 0);
            String string = defaultSharedPreferences.getString(SessionInfo.SESSION_ID_KEY, (String) null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j10), Long.valueOf(j11), (UUID) null, 4, (g) null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.Companion.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            m.e(fromString, "fromString(sessionIDStr)");
            sessionInfo.setSessionId(fromString);
            return sessionInfo;
        }
    }

    public SessionInfo(Long l10, Long l11) {
        this(l10, l11, (UUID) null, 4, (g) null);
    }

    public SessionInfo(Long l10, Long l11, UUID uuid) {
        m.f(uuid, "sessionId");
        this.sessionStartTime = l10;
        this.sessionLastEventTime = l11;
        this.sessionId = uuid;
    }

    public static final void clearSavedSessionFromDisk() {
        Companion.clearSavedSessionFromDisk();
    }

    public static final SessionInfo getStoredSessionInfo() {
        return Companion.getStoredSessionInfo();
    }

    public final Long getDiskRestoreTime() {
        Long l10 = this.diskRestoreTime;
        if (l10 == null) {
            return 0L;
        }
        return l10;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l10;
        if (this.sessionStartTime == null || (l10 = this.sessionLastEventTime) == null) {
            return 0;
        }
        if (l10 != null) {
            return l10.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(Long l10) {
        this.diskRestoreTime = l10;
    }

    public final void setSessionId(UUID uuid) {
        m.f(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(Long l10) {
        this.sessionLastEventTime = l10;
    }

    public final void setSourceApplicationInfo(SourceApplicationInfo sourceApplicationInfo2) {
        this.sourceApplicationInfo = sourceApplicationInfo2;
    }

    public final void writeSessionToDisk() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l10 = this.sessionStartTime;
        long j10 = 0;
        edit.putLong(LAST_SESSION_INFO_START_KEY, l10 == null ? 0 : l10.longValue());
        Long l11 = this.sessionLastEventTime;
        if (l11 != null) {
            j10 = l11.longValue();
        }
        edit.putLong(LAST_SESSION_INFO_END_KEY, j10);
        edit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        edit.putString(SESSION_ID_KEY, this.sessionId.toString());
        edit.apply();
        SourceApplicationInfo sourceApplicationInfo2 = this.sourceApplicationInfo;
        if (sourceApplicationInfo2 != null && sourceApplicationInfo2 != null) {
            sourceApplicationInfo2.writeSourceApplicationInfoToDisk();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SessionInfo(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.g r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000d
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.m.e(r3, r4)
        L_0x000d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.SessionInfo.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.g):void");
    }
}
