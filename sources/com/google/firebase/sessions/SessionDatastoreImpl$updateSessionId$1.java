package com.google.firebase.sessions;

import com.google.firebase.sessions.SessionDatastoreImpl;
import g0.e;
import i9.l0;
import j0.a;
import j0.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {85}, m = "invokeSuspend")
/* compiled from: SessionDatastore.kt */
final class SessionDatastoreImpl$updateSessionId$1 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    @f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1  reason: invalid class name */
    /* compiled from: SessionDatastore.kt */
    static final class AnonymousClass1 extends k implements p<a, d<? super q>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final d<q> create(Object obj, d<?> dVar) {
            AnonymousClass1 r02 = new AnonymousClass1(str, dVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invoke(a aVar, d<? super q> dVar) {
            return ((AnonymousClass1) create(aVar, dVar)).invokeSuspend(q.f16189a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.label == 0) {
                m.b(obj);
                ((a) this.L$0).j(SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE.getSESSION_ID(), str);
                return q.f16189a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, d<? super SessionDatastoreImpl$updateSessionId$1> dVar) {
        super(2, dVar);
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = str;
    }

    public final d<q> create(Object obj, d<?> dVar) {
        return new SessionDatastoreImpl$updateSessionId$1(this.this$0, this.$sessionId, dVar);
    }

    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((SessionDatastoreImpl$updateSessionId$1) create(l0Var, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            m.b(obj);
            e access$getDataStore = SessionDatastoreImpl.Companion.getDataStore(this.this$0.context);
            final String str = this.$sessionId;
            AnonymousClass1 r12 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.label = 1;
            if (g.a(access$getDataStore, r12, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f16189a;
    }
}
