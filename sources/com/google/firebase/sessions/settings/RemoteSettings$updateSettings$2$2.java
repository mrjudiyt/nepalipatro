package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import o8.m;
import o8.q;
import r8.d;
import y8.p;

@f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
/* compiled from: RemoteSettings.kt */
final class RemoteSettings$updateSettings$2$2 extends k implements p<String, d<? super q>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RemoteSettings$updateSettings$2$2(d<? super RemoteSettings$updateSettings$2$2> dVar) {
        super(2, dVar);
    }

    public final d<q> create(Object obj, d<?> dVar) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(dVar);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    public final Object invoke(String str, d<? super q> dVar) {
        return ((RemoteSettings$updateSettings$2$2) create(str, dVar)).invokeSuspend(q.f16189a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            m.b(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("Error failing to fetch the remote configs: ");
            sb.append((String) this.L$0);
            return q.f16189a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
