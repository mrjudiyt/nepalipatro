package com.google.firebase.sessions;

import j0.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import l9.e;
import o8.m;
import y8.q;

@f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {73}, m = "invokeSuspend")
/* compiled from: SessionDatastore.kt */
final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends k implements q<e<? super d>, Throwable, r8.d<? super o8.q>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SessionDatastoreImpl$firebaseSessionDataFlow$1(r8.d<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> dVar) {
        super(3, dVar);
    }

    public final Object invoke(e<? super d> eVar, Throwable th, r8.d<? super o8.q> dVar) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(dVar);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = eVar;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(o8.q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            Throwable th = (Throwable) this.L$1;
            d a10 = j0.e.a();
            this.L$0 = null;
            this.label = 1;
            if (((e) this.L$0).emit(a10, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8.q.f16189a;
    }
}
