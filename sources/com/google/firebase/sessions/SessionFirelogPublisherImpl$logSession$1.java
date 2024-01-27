package com.google.firebase.sessions;

import i9.l0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {64, 72, 73}, m = "invokeSuspend")
/* compiled from: SessionFirelogPublisher.kt */
final class SessionFirelogPublisherImpl$logSession$1 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, d<? super SessionFirelogPublisherImpl$logSession$1> dVar) {
        super(2, dVar);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((SessionFirelogPublisherImpl$logSession$1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = s8.d.c()
            int r1 = r14.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x006d
            if (r1 == r4) goto L_0x0069
            if (r1 == r3) goto L_0x0048
            if (r1 != r2) goto L_0x0040
            java.lang.Object r0 = r14.L$7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r14.L$6
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r14.L$5
            com.google.firebase.sessions.ProcessDetails r2 = (com.google.firebase.sessions.ProcessDetails) r2
            java.lang.Object r3 = r14.L$4
            com.google.firebase.sessions.settings.SessionsSettings r3 = (com.google.firebase.sessions.settings.SessionsSettings) r3
            java.lang.Object r4 = r14.L$3
            com.google.firebase.sessions.SessionDetails r4 = (com.google.firebase.sessions.SessionDetails) r4
            java.lang.Object r5 = r14.L$2
            com.google.firebase.FirebaseApp r5 = (com.google.firebase.FirebaseApp) r5
            java.lang.Object r6 = r14.L$1
            com.google.firebase.sessions.SessionEvents r6 = (com.google.firebase.sessions.SessionEvents) r6
            java.lang.Object r7 = r14.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r7 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r7
            o8.m.b(r15)
            r8 = r7
            r11 = r6
            r6 = r0
            r0 = r11
            r12 = r5
            r5 = r1
            r1 = r12
            r13 = r4
            r4 = r2
            r2 = r13
            goto L_0x0103
        L_0x0040:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0048:
            java.lang.Object r1 = r14.L$6
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r14.L$5
            com.google.firebase.sessions.ProcessDetails r3 = (com.google.firebase.sessions.ProcessDetails) r3
            java.lang.Object r4 = r14.L$4
            com.google.firebase.sessions.settings.SessionsSettings r4 = (com.google.firebase.sessions.settings.SessionsSettings) r4
            java.lang.Object r5 = r14.L$3
            com.google.firebase.sessions.SessionDetails r5 = (com.google.firebase.sessions.SessionDetails) r5
            java.lang.Object r6 = r14.L$2
            com.google.firebase.FirebaseApp r6 = (com.google.firebase.FirebaseApp) r6
            java.lang.Object r7 = r14.L$1
            com.google.firebase.sessions.SessionEvents r7 = (com.google.firebase.sessions.SessionEvents) r7
            java.lang.Object r8 = r14.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r8 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r8
            o8.m.b(r15)
            goto L_0x00dc
        L_0x0069:
            o8.m.b(r15)
            goto L_0x007b
        L_0x006d:
            o8.m.b(r15)
            com.google.firebase.sessions.SessionFirelogPublisherImpl r15 = r14.this$0
            r14.label = r4
            java.lang.Object r15 = r15.shouldLogSession(r14)
            if (r15 != r0) goto L_0x007b
            return r0
        L_0x007b:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0112
            com.google.firebase.sessions.SessionFirelogPublisherImpl r15 = r14.this$0
            com.google.firebase.sessions.SessionEvents r1 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.FirebaseApp r4 = r15.firebaseApp
            com.google.firebase.sessions.SessionDetails r5 = r14.$sessionDetails
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r14.this$0
            com.google.firebase.sessions.settings.SessionsSettings r6 = r6.sessionSettings
            com.google.firebase.sessions.ProcessDetailsProvider r7 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE
            com.google.firebase.sessions.SessionFirelogPublisherImpl r8 = r14.this$0
            com.google.firebase.FirebaseApp r8 = r8.firebaseApp
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r9 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.m.e(r8, r9)
            com.google.firebase.sessions.ProcessDetails r8 = r7.getCurrentProcessDetails(r8)
            com.google.firebase.sessions.SessionFirelogPublisherImpl r10 = r14.this$0
            com.google.firebase.FirebaseApp r10 = r10.firebaseApp
            android.content.Context r10 = r10.getApplicationContext()
            kotlin.jvm.internal.m.e(r10, r9)
            java.util.List r7 = r7.getAppProcessDetails(r10)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r9 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r14.L$0 = r15
            r14.L$1 = r1
            r14.L$2 = r4
            r14.L$3 = r5
            r14.L$4 = r6
            r14.L$5 = r8
            r14.L$6 = r7
            r14.label = r3
            java.lang.Object r3 = r9.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r14)
            if (r3 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            r11 = r8
            r8 = r15
            r15 = r3
            r3 = r11
            r12 = r7
            r7 = r1
            r1 = r12
            r13 = r6
            r6 = r4
            r4 = r13
        L_0x00dc:
            java.util.Map r15 = (java.util.Map) r15
            com.google.firebase.sessions.SessionFirelogPublisherImpl r9 = r14.this$0
            r14.L$0 = r8
            r14.L$1 = r7
            r14.L$2 = r6
            r14.L$3 = r5
            r14.L$4 = r4
            r14.L$5 = r3
            r14.L$6 = r1
            r14.L$7 = r15
            r14.label = r2
            java.lang.Object r2 = r9.getFirebaseInstallationId(r14)
            if (r2 != r0) goto L_0x00f9
            return r0
        L_0x00f9:
            r0 = r7
            r11 = r6
            r6 = r15
            r15 = r2
            r2 = r5
            r5 = r1
            r1 = r11
            r12 = r4
            r4 = r3
            r3 = r12
        L_0x0103:
            java.lang.String r7 = "getFirebaseInstallationId()"
            kotlin.jvm.internal.m.e(r15, r7)
            r7 = r15
            java.lang.String r7 = (java.lang.String) r7
            com.google.firebase.sessions.SessionEvent r15 = r0.buildSession(r1, r2, r3, r4, r5, r6, r7)
            r8.attemptLoggingSessionEvent(r15)
        L_0x0112:
            o8.q r15 = o8.q.f16189a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
