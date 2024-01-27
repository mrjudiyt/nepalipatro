package com.google.firebase.sessions;

import a9.a;
import android.content.Context;
import e9.i;
import g0.e;
import h0.b;
import i9.l0;
import i9.m0;
import i9.n0;
import i9.u1;
import j0.d;
import j0.f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.z;
import o8.q;
import y8.l;
import y8.p;

/* compiled from: SessionDatastore.kt */
public final class SessionDatastoreImpl implements SessionDatastore {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((g) null);
    @Deprecated
    private static final String TAG = "FirebaseSessionsRepo";
    /* access modifiers changed from: private */
    @Deprecated
    public static final a<Context, e<d>> dataStore$delegate = i0.a.b(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), (b) null, (l) null, (l0) null, 14, (Object) null);
    private final r8.g backgroundDispatcher;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final l9.d<FirebaseSessionsData> firebaseSessionDataFlow;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1  reason: invalid class name */
    /* compiled from: SessionDatastore.kt */
    static final class AnonymousClass1 extends k implements p<l0, r8.d<? super q>, Object> {
        int label;
        final /* synthetic */ SessionDatastoreImpl this$0;

        {
            this.this$0 = r1;
        }

        public final r8.d<q> create(Object obj, r8.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        public final Object invoke(l0 l0Var, r8.d<? super q> dVar) {
            return ((AnonymousClass1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                o8.m.b(obj);
                l9.d access$getFirebaseSessionDataFlow$p = this.this$0.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
                AnonymousClass1 r12 = new l9.e() {
                    public final Object emit(FirebaseSessionsData firebaseSessionsData, r8.d<? super q> dVar) {
                        sessionDatastoreImpl.currentSessionFromDatastore.set(firebaseSessionsData);
                        return q.f16189a;
                    }
                };
                this.label = 1;
                if (access$getFirebaseSessionDataFlow$p.collect(r12, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                o8.m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return q.f16189a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    private static final class Companion {
        static final /* synthetic */ i<Object>[] $$delegatedProperties = {z.f(new u(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final e<d> getDataStore(Context context) {
            return (e) SessionDatastoreImpl.dataStore$delegate.a(context, $$delegatedProperties[0]);
        }
    }

    /* compiled from: SessionDatastore.kt */
    private static final class FirebaseSessionDataKeys {
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();
        private static final d.a<String> SESSION_ID = f.f("session_id");

        private FirebaseSessionDataKeys() {
        }

        public final d.a<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    public SessionDatastoreImpl(Context context2, r8.g gVar) {
        m.f(context2, "context");
        m.f(gVar, "backgroundDispatcher");
        this.context = context2;
        this.backgroundDispatcher = gVar;
        this.firebaseSessionDataFlow = new SessionDatastoreImpl$special$$inlined$map$1(l9.f.b(Companion.getDataStore(context2).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1((r8.d<? super SessionDatastoreImpl$firebaseSessionDataFlow$1>) null)), this);
        u1 unused = i.d(m0.a(gVar), (r8.g) null, (n0) null, new AnonymousClass1(this, (r8.d<? super AnonymousClass1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(d dVar) {
        return new FirebaseSessionsData((String) dVar.b(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    public String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    public void updateSessionId(String str) {
        m.f(str, "sessionId");
        u1 unused = i.d(m0.a(this.backgroundDispatcher), (r8.g) null, (n0) null, new SessionDatastoreImpl$updateSessionId$1(this, str, (r8.d<? super SessionDatastoreImpl$updateSessionId$1>) null), 3, (Object) null);
    }
}
