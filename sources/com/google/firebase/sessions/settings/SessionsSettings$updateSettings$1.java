package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {134, 135}, m = "updateSettings")
/* compiled from: SessionsSettings.kt */
final class SessionsSettings$updateSettings$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionsSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, r8.d<? super SessionsSettings$updateSettings$1> dVar) {
        super(dVar);
        this.this$0 = sessionsSettings;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}
