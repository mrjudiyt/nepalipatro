package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import i9.m0;
import i9.n0;
import i9.u1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.d;

/* compiled from: SessionFirelogPublisher.kt */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = "SessionFirelogPublisher";
    private static final double randomValueForSampling = Math.random();
    private final r8.g backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    /* access modifiers changed from: private */
    public final SessionsSettings sessionSettings;

    /* compiled from: SessionFirelogPublisher.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp2, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, r8.g gVar) {
        m.f(firebaseApp2, "firebaseApp");
        m.f(firebaseInstallationsApi, "firebaseInstallations");
        m.f(sessionsSettings, "sessionSettings");
        m.f(eventGDTLoggerInterface, "eventGDTLogger");
        m.f(gVar, "backgroundDispatcher");
        this.firebaseApp = firebaseApp2;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.sessionSettings = sessionsSettings;
        this.eventGDTLogger = eventGDTLoggerInterface;
        this.backgroundDispatcher = gVar;
    }

    /* access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            StringBuilder sb = new StringBuilder();
            sb.append("Successfully logged Session Start event: ");
            sb.append(sessionEvent.getSessionData().getSessionId());
        } catch (RuntimeException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getFirebaseInstallationId(r8.d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            o8.m.b(r5)     // Catch:{ Exception -> 0x004b }
            goto L_0x0048
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            o8.m.b(r5)
            com.google.firebase.installations.FirebaseInstallationsApi r5 = r4.firebaseInstallations     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch:{ Exception -> 0x004b }
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.m.e(r5, r2)     // Catch:{ Exception -> 0x004b }
            r0.label = r3     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = s9.b.a(r5, r0)     // Catch:{ Exception -> 0x004b }
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x004b }
            goto L_0x004d
        L_0x004b:
            java.lang.String r5 = ""
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.getFirebaseInstallationId(r8.d):java.lang.Object");
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object shouldLogSession(r8.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = s8.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            o8.m.b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            o8.m.b(r5)
            com.google.firebase.sessions.settings.SessionsSettings r5 = r4.sessionSettings
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.updateSettings(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            com.google.firebase.sessions.settings.SessionsSettings r5 = r0.sessionSettings
            boolean r5 = r5.getSessionsEnabled()
            r1 = 0
            if (r5 != 0) goto L_0x0054
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r5
        L_0x0054:
            boolean r5 = r0.shouldCollectEvents()
            if (r5 != 0) goto L_0x005f
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r5
        L_0x005f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.shouldLogSession(r8.d):java.lang.Object");
    }

    public void logSession(SessionDetails sessionDetails) {
        m.f(sessionDetails, "sessionDetails");
        u1 unused = i.d(m0.a(this.backgroundDispatcher), (r8.g) null, (n0) null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, (d<? super SessionFirelogPublisherImpl$logSession$1>) null), 3, (Object) null);
    }
}
