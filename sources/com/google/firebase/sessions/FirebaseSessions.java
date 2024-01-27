package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.settings.SessionsSettings;
import i9.l0;
import i9.m0;
import i9.n0;
import i9.u1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import o8.q;
import r8.d;
import y8.p;

/* compiled from: FirebaseSessions.kt */
public final class FirebaseSessions {
    public static final Companion Companion = new Companion((g) null);
    private static final String TAG = "FirebaseSessions";
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    /* access modifiers changed from: private */
    public final SessionsSettings settings;

    @f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, 48}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1  reason: invalid class name */
    /* compiled from: FirebaseSessions.kt */
    static final class AnonymousClass1 extends k implements p<l0, d<? super q>, Object> {
        int label;
        final /* synthetic */ FirebaseSessions this$0;

        {
            this.this$0 = r1;
        }

        /* access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1  reason: not valid java name */
        public static final void m159invokeSuspend$lambda1(String str, FirebaseOptions firebaseOptions) {
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient((SessionLifecycleClient) null);
        }

        public final d<q> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, gVar, dVar);
        }

        public final Object invoke(l0 l0Var, d<? super q> dVar) {
            return ((AnonymousClass1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = s8.d.c()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                o8.m.b(r5)
                goto L_0x0066
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                o8.m.b(r5)
                goto L_0x002c
            L_0x001e:
                o8.m.b(r5)
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r5 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r4.label = r3
                java.lang.Object r5 = r5.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r4)
                if (r5 != r0) goto L_0x002c
                return r0
            L_0x002c:
                java.util.Map r5 = (java.util.Map) r5
                java.util.Collection r5 = r5.values()
                boolean r1 = r5 instanceof java.util.Collection
                if (r1 == 0) goto L_0x003d
                boolean r1 = r5.isEmpty()
                if (r1 == 0) goto L_0x003d
                goto L_0x0054
            L_0x003d:
                java.util.Iterator r5 = r5.iterator()
            L_0x0041:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0054
                java.lang.Object r1 = r5.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L_0x0041
                r3 = 0
            L_0x0054:
                if (r3 == 0) goto L_0x0057
                goto L_0x008d
            L_0x0057:
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.sessions.settings.SessionsSettings r5 = r5.settings
                r4.label = r2
                java.lang.Object r5 = r5.updateSettings(r4)
                if (r5 != r0) goto L_0x0066
                return r0
            L_0x0066:
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.sessions.settings.SessionsSettings r5 = r5.settings
                boolean r5 = r5.getSessionsEnabled()
                if (r5 != 0) goto L_0x0073
                goto L_0x008d
            L_0x0073:
                com.google.firebase.sessions.SessionLifecycleClient r5 = new com.google.firebase.sessions.SessionLifecycleClient
                r8.g r0 = r9
                r5.<init>(r0)
                r5.bindToService()
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
                r0.setLifecycleClient(r5)
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.FirebaseApp r5 = r5.firebaseApp
                com.google.firebase.sessions.c r0 = com.google.firebase.sessions.c.f14054a
                r5.addLifecycleEventListener(r0)
            L_0x008d:
                o8.q r5 = o8.q.f16189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FirebaseSessions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            m.e(obj, "Firebase.app[FirebaseSessions::class.java]");
            return (FirebaseSessions) obj;
        }
    }

    public FirebaseSessions(FirebaseApp firebaseApp2, SessionsSettings sessionsSettings, final r8.g gVar) {
        m.f(firebaseApp2, "firebaseApp");
        m.f(sessionsSettings, "settings");
        m.f(gVar, "backgroundDispatcher");
        this.firebaseApp = firebaseApp2;
        this.settings = sessionsSettings;
        Context applicationContext = firebaseApp2.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.INSTANCE);
            u1 unused = i.d(m0.a(gVar), (r8.g) null, (n0) null, new AnonymousClass1(this, (d<? super AnonymousClass1>) null), 3, (Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to register lifecycle callbacks, unexpected context ");
        sb.append(applicationContext.getClass());
        sb.append('.');
    }
}
