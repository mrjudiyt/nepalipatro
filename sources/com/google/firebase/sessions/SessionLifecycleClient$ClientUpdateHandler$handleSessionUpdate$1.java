package com.google.firebase.sessions;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import i9.l0;
import java.util.Collection;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {73}, m = "invokeSuspend")
/* compiled from: SessionLifecycleClient.kt */
final class SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(String str, d<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1> dVar) {
        super(2, dVar);
        this.$sessionId = str;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(this.$sessionId, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.label = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Collection<SessionSubscriber> values = ((Map) obj).values();
        String str = this.$sessionId;
        for (SessionSubscriber sessionSubscriber : values) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            StringBuilder sb = new StringBuilder();
            sb.append("Notified ");
            sb.append(sessionSubscriber.getSessionSubscriberName());
            sb.append(" of new session ");
            sb.append(str);
        }
        return q.f16189a;
    }
}
