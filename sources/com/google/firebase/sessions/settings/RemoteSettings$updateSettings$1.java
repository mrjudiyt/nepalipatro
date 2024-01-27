package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
/* compiled from: RemoteSettings.kt */
final class RemoteSettings$updateSettings$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, r8.d<? super RemoteSettings$updateSettings$1> dVar) {
        super(dVar);
        this.this$0 = remoteSettings;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}
