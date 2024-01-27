package com.google.firebase.sessions;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {95}, m = "shouldLogSession")
/* compiled from: SessionFirelogPublisher.kt */
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, r8.d<? super SessionFirelogPublisherImpl$shouldLogSession$1> dVar) {
        super(dVar);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shouldLogSession(this);
    }
}
